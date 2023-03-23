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

    @Test
    public void addBagelToBasketFails() {
        Basket basket = new Basket();
        basket.add("Plain bagel");
        basket.add("Cinnamon and raisin bagel");
        basket.add("Onion bagel");

        Assertions.assertFalse(basket.add("Sesame bagel"));
        Assertions.assertEquals("[Plain bagel, Cinnamon and raisin bagel, Onion bagel]", basket.toString());
    }

}
