package com.devsuperior.mysecondproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.mysecondproject.entities.Product;


@Repository //
public interface ProductRepository extends JpaRepository<Product, Long>{


}