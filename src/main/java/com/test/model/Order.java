package com.test.model;

import com.google.gson.Gson;
import com.google.gson.annotations.Expose;
import springfox.documentation.annotations.ApiIgnore;

import java.util.Objects;

public class Order {

    private Long id;
    private String name;
    private Long price;

    public Order(String name, Long price) {
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public Order setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public Order setName(String name) {
        this.name = name;
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
