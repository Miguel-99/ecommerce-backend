package com.spiritualwarriors.ecommercebackend.services;

import com.spiritualwarriors.ecommercebackend.entities.Product;
import com.spiritualwarriors.ecommercebackend.repositories.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Slf4j
@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAll() {
        log.info("GetAll called");
        return productRepository.findAll();
    }

    public Product add(Product product) {
        log.info("add called");
        return productRepository.save(product);
    }

    public Boolean remove(Long id) {
        log.info("remove called");
        productRepository.deleteById(id);
        return true;
    }

    public List<ResultDTO> getDetail(List<String> details) {
        log.info("getDetail called");
        List<ResultDTO> result = new ArrayList<>();
        details.forEach(detail -> {
            String[] parts = detail.split("-");
            Long id = Long.parseLong(parts[0]);
            Integer quantity = Integer.parseInt(parts[1]);
            Product productFound = productRepository.findById(id).orElseThrow(() -> new NoSuchElementException(""));
            BigDecimal subtotal = productFound.getPrice().multiply(BigDecimal.valueOf(quantity));
            result.add(new ResultDTO(productFound, quantity, subtotal));
        });
        return result;
    }

    public record ResultDTO(Product product, Integer quantity, BigDecimal subtotal){}
}
