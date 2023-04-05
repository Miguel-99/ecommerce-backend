package com.spiritualwarriors.ecommercebackend.repositories;

import com.spiritualwarriors.ecommercebackend.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}