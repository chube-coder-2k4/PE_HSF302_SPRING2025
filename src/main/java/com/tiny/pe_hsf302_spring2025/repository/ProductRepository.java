package com.tiny.pe_hsf302_spring2025.repository;

import com.tiny.pe_hsf302_spring2025.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
}
