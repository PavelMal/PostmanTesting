package com.test.assertion;

import com.test.exception.NullNameException;
import com.test.exception.NullPriceException;
import com.test.exception.PriceLessOrEqualZeroException;
import com.test.model.Order;

public class Name {

    public static void checkName(Order order) {

        if (order.getName() == null) {
            throw new NullNameException();
        }
    }
}