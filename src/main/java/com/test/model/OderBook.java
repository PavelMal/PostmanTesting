package com.test.model;

import java.util.Map;
import java.util.TreeMap;

public class OderBook {

    public static final Map<String, Order> orderBook = new TreeMap<>();

    public static void addOrder(Order order) {
        orderBook.put(order.getId(), order);
    }
}
