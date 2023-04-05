package com.spiritualwarriors.ecommercebackend.controllers;

import com.spiritualwarriors.ecommercebackend.entities.Product;
import com.spiritualwarriors.ecommercebackend.services.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping()
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(productService.getAll());
    }

    @PostMapping()
    public ResponseEntity<?> post(@RequestBody Product product) {
        return ResponseEntity.ok(productService.add(product));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id) {
        productService.remove(id);
        return ResponseEntity.noContent().build();
    }
}
