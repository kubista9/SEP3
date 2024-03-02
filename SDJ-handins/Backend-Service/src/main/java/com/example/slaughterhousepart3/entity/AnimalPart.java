package com.example.slaughterhousepart3.entity;

import jakarta.persistence.*;

@Entity
@Table
public class AnimalPart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int partId;
    @Column
    private String type;

    @ManyToOne
    @JoinColumn(name = "animal_id")
    private Animal animal;

    // Getters and setters...

    public Animal getAnimal() {
        return animal;
    }

    public AnimalPart(int partId, String type) {
        this.partId = partId;
        this.type = type;
    }

    public AnimalPart() {

    }

    public int getPartId() {
        return partId;
    }

    public String getType() {
        return type;
    }

    public void setPartId(int partId) {
        this.partId = partId;
    }

    public void setType(String type) {
        this.type = type;
    }
}
