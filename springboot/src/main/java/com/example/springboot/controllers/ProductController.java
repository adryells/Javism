package com.example.springboot.controllers;

import com.example.springboot.dtos.ProductRecordDto;
import com.example.springboot.models.ProductModel;
import com.example.springboot.repositories.ProductRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class ProductController {
    @Autowired
    ProductRepository productRepository;

    @PostMapping("/products")
    public ResponseEntity<ProductModel> addProduct(@RequestBody @Valid ProductRecordDto productRecordDto){
        var productModel = new ProductModel();
        BeanUtils.copyProperties(productRecordDto, productModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(productRepository.save(productModel));
    }

    @GetMapping("/products")
    public ResponseEntity<List<ProductModel>> getProducts(){
        List<ProductModel> products = productRepository.findAll();

        if(!products.isEmpty()){
            for(ProductModel product : products){
                UUID id = product.getProductId();
                product.add(linkTo(methodOn(ProductController.class).getProduct(id)).withSelfRel());
            }
        }

        return ResponseEntity.status(HttpStatus.OK).body(productRepository.findAll());
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<Optional<Object>> getProduct(@PathVariable(value="id") UUID id){
        Optional<ProductModel> product = productRepository.findById(id);

        if (product.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(Optional.of("Product not found."));
        }

        product.get().add(linkTo(methodOn(ProductController.class).getProducts()).withRel("Products"));

        return ResponseEntity.status(HttpStatus.OK).body(Optional.of(product.get()));
    }

    @PutMapping("/products/{id}")
    public ResponseEntity<Optional<Object>> updateProduct(@PathVariable(value="id") UUID id, @RequestBody @Valid ProductRecordDto productRecordDto){
        Optional<ProductModel> product = productRepository.findById(id);

        if (product.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(Optional.of("Product not found."));
        }

        var productModel = product.get();
        BeanUtils.copyProperties(productRecordDto, productModel);

        return ResponseEntity.status(HttpStatus.OK).body(Optional.of(productRepository.save(productModel)));
    }

    @DeleteMapping("/products/{id}")
    public ResponseEntity<Optional<Object>> deleteProduct(@PathVariable(value="id") UUID id){
        Optional<ProductModel> product = productRepository.findById(id);

        if (product.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(Optional.of("Product not found."));
        }

        productRepository.delete(product.get());
        return ResponseEntity.status(HttpStatus.OK).body(Optional.of("Product deleted successfully."));
    }
}
