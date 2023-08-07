package com.test.assertion;

import com.test.exception.NotAllowedToAddIdException;
import com.test.model.Order;

public class Id {

    public static void checkId(Order order) {

        if (order.getId() != null) {
            throw new NotAllowedToAddIdException();
        }
    }

}