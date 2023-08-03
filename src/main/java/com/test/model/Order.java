package com.test.model;

import com.google.gson.Gson;

import java.util.Objects;

public class Order {

    private String id;
    private String name;
    private Long price;

    public Order(String id, String name, Long price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public Order setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Order setName(String name) {
        this.name = name;
        return this;
    }

    public Long getPrice() {
        return price;
    }

    public Order setPrice(Long price) {
        this.price = price;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price);
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
