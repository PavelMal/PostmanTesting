package com.test.service;

import com.test.model.Order;
import com.test.model.OrderBook;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    public ResponseEntity createOrder(Order order) {

        OrderBook.addOrder(order);

        return ResponseEntity.ok().body(order.getId().toString());
    }

    public ResponseEntity getOrderById(Long orderId) {

        Order order = OrderBook.orderBook.get(orderId);

        if (order == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(order);

    }
}
