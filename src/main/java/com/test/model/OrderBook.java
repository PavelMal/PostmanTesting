package com.test.model;

import java.util.Map;
import java.util.NoSuchElementException;
import java.util.TreeMap;

public class OrderBook {

    public static final TreeMap<Long, Order> orderBook = new TreeMap<>();

    public static void addOrder(Order order) {
        Long lastId = 1L;
        try {
            lastId = orderBook.lastKey();
        } catch (NoSuchElementException ex) {
            orderBook.put(lastId, order);
        }

        orderBook.put(lastId + 1, order);

    }
}
