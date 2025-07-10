package com.tiny.pe_hsf302_spring2025.repository;

import com.tiny.pe_hsf302_spring2025.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {
}
