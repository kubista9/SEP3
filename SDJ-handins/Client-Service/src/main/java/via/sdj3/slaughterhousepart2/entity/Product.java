package via.sdj3.slaughterhousepart2.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    public int productId;
    @Column
    private String type;
    @Column
    private double weight;
    @Column
    private double price;
    @ManyToMany
    @JoinTable(
            name = "product_animal",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "animal_id"))
    private List<Animal> animals;

    public Product(int productId, String type, double weight, double price, List<Animal> animals) {
        this.productId = productId;
        this.type = type;
        this.weight = weight;
        this.price = price;
        this.animals = animals;
    }

    public Product() {

    }

    public int getProductId() {
        return productId;
    }

    public String getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }
}
