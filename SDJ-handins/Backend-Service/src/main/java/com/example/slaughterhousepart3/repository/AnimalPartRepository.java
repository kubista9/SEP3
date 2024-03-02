package com.example.slaughterhousepart3.repository;

import com.example.slaughterhousepart3.entity.Animal;
import com.example.slaughterhousepart3.entity.AnimalPart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalPartRepository extends JpaRepository<AnimalPart, Integer> {
    //filter or extra*: add the method here
}