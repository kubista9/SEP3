package com.example.slaughterhousepart3.repository;

import com.example.slaughterhousepart3.entity.Animal;
import com.example.slaughterhousepart3.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    //filter or extra*: add the method here
}