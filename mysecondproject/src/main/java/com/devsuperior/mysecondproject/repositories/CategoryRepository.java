package com.devsuperior.mysecondproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.mysecondproject.entities.Category;

@Repository //
public interface CategoryRepository extends JpaRepository<Category, Long>{


}