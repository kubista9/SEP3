package com.example.slaughterhousepart3.service;

import com.example.slaughterhousepart3.entity.Animal;
import com.example.slaughterhousepart3.entity.AnimalPart;
import com.example.slaughterhousepart3.repository.AnimalPartRepository;
import com.example.slaughterhousepart3.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnimalPartService {

    private AnimalPartRepository animalPartRepository;

    @Autowired
    public AnimalPartService(AnimalPartRepository animalPartRepository) {
        this.animalPartRepository = animalPartRepository;
    }

    public void addAnimalPart(AnimalPart part) {
        animalPartRepository.save(part);
    }

}
