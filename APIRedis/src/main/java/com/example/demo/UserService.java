package com.example.demo;

import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Cacheable(value = "users", key = "#id")
    public String getUserById(String id) {
        System.out.println("Finding user...");
        simulateSlowService();
        return "User " + id;
    }

    @CachePut(value = "users", key = "#id")
    public String saveUser(String id, String name) {
        System.out.println("Adding user...");
        return name;
    }

    private void simulateSlowService() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
