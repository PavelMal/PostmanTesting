package com.test.service;

import com.google.gson.Gson;
import com.test.assertion.Id;
import com.test.assertion.Name;
import com.test.assertion.Price;
import com.test.model.Order;
import com.test.model.OrderBook;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import static com.test.assertion.Id.checkId;
import static com.test.assertion.Name.checkName;
import static com.test.assertion.Price.checkPrice;

@Service
public class OrderService {

    public ResponseEntity createOrder(Order order) {

        checkPrice(order);
        checkName(order);
        checkId(order);

        OrderBook.addOrder(order);

        return ResponseEntity.ok().body(order.getId());
    }

    public ResponseEntity getOrderById(Long orderId) {

        Order order = OrderBook.orderBook.get(orderId);

        if (order == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(order);

    }
}
