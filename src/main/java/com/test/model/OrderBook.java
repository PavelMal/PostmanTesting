package com.test.model;

import java.util.TreeMap;

public class OrderBook {

    public static final TreeMap<Long, Order> orderBook = new TreeMap<>();

    public static void addOrder(Order order) {

        if (orderBook.isEmpty()) {
            order.setId(1L);
            orderBook.put(1L, order);
        }
        else {
            Long lastId = orderBook.lastKey();
            order.setId(lastId + 1);
            orderBook.put(order.getId(), order);
        }
    }

    public static void cleanOrderBook() {
        orderBook.clear();
    }
}
