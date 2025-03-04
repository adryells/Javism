package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public String getUser(@PathVariable String id) {
        return userService.getUserById(id);
    }

    @PostMapping("/{id}")
    public String saveUser(@PathVariable String id, @RequestBody String name) {
        return userService.saveUser(id, name);
    }
}
