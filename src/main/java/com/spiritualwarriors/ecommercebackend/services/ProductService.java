package com.spiritualwarriors.ecommercebackend.services;

import com.spiritualwarriors.ecommercebackend.entities.Product;
import com.spiritualwarriors.ecommercebackend.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAll() {
        return productRepository.findAll();
    }

    public Product add(Product product) {
        return productRepository.save(product);
    }

    public Boolean remove(Long id) {
        productRepository.deleteById(id);
        return true;
    }
}
