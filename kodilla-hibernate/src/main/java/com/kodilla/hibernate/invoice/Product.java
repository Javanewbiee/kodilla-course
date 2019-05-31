package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="PRODUCTS")
public class Product {

    private int id;
    private String name;
    private Item item;

    public Product(String name) {
        this.name = name;
    }

    public Product() {
    }
    @Id
    @NotNull
    @GeneratedValue
    @Column(name="PRODUCTS_ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Column(name="PRODUCTS_NAME")
    public String getName() {
        return name;
    }
    @ManyToOne
    @JoinColumn(name="ITEMS_ID")
    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public void setName(String name) {
        this.name = name;
    }
}
