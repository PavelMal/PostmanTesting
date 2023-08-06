package com.test.assertion;

import com.test.exception.NullPriceException;
import com.test.exception.PriceLessOrEqualZeroException;
import com.test.model.Order;

public class Price {

    public static void checkPrice(Order order) {

        if (order.getPrice() == null) {
            throw new NullPriceException();
        }

        if (order.getPrice() <= 0) {
            throw new PriceLessOrEqualZeroException();
        }
    }
}