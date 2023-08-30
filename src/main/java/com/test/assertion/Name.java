package com.test.assertion;

import com.test.exception.EmptyNameException;
import com.test.exception.NullNameException;
import com.test.model.Order;

public class Name {

    public static void checkName(Order order) {

        if (order.getName() == null) {
            throw new NullNameException();
        }

        if (order.getName().isBlank()) {
            throw new EmptyNameException();
        }
    }
}