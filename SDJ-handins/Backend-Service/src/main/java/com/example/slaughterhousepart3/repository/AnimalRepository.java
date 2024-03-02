package com.example.slaughterhousepart3.repository;

import com.example.slaughterhousepart3.entity.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AnimalRepository extends JpaRepository<Animal, Integer> {
    //filter or extra*: add the method here
}
