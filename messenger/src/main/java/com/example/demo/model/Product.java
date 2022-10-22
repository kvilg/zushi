package com.example.demo.model;

import org.jboss.jandex.Index;

public class Product {
    public String name;
    public Integer price;
    public String photo;

    public Product(String name, int price, String photo) {
        this.name = name;
        this.price = price;
        this.photo = photo;
    }
}
