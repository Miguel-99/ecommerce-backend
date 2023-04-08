package com.spiritualwarriors.ecommercebackend.controllers;

import com.spiritualwarriors.ecommercebackend.entities.Product;
import com.spiritualwarriors.ecommercebackend.services.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@CrossOrigin("*")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping()
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(productService.getAll());
    }

    @GetMapping("/{details}")
    public ResponseEntity<?> getDetailsResult(@PathVariable List<String> details) {
        List<ProductService.ResultDTO> result = productService.getDetail(details);
        return ResponseEntity.ok(result);
    }

    @PostMapping()
    public ResponseEntity<?> add(@RequestBody Product product) {
        return ResponseEntity.ok(productService.add(product));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id) {
        productService.remove(id);
        return ResponseEntity.noContent().build();
    }
}
