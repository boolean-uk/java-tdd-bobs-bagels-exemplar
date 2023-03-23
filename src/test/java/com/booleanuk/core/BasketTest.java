package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {
    @Test
    public void addBagelToBasketSucceeds() {
        Basket basket = new Basket();
        Assertions.assertTrue(basket.add("Plain bagel"));
        Assertions.assertEquals("[Plain bagel]", basket.toString());
    }

}
