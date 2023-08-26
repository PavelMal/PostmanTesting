package com.test.service;

import com.test.model.Order;
import com.test.model.OrderBook;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;

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

        HashMap<String, Long> map = new HashMap<>();
        map.put("id", order.getId());

        return ResponseEntity.ok().body(map);
    }

    public ResponseEntity<Order> getOrderById(Long orderId) {

        Order order = OrderBook.orderBook.get(orderId);

        if (order == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(order);

    }

    public ResponseEntity cleanOrderBook() {

        OrderBook.cleanOrderBook();

        return ResponseEntity.ok().build();

    }
}
