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

    @Test
    public void removeBagelSucceeds() {
        Basket basket = new Basket();
        basket.add("Plain bagel");
        basket.add("Plain bagel");
        basket.add("Onion bagel");

        Assertions.assertTrue(basket.remove("Plain bagel"));
        Assertions.assertEquals("[Plain bagel, Onion bagel]", basket.toString());
    }

    @Test
    public void removeBagelFailure() {
        Basket basket = new Basket();
        basket.add("Plain bagel");
        basket.add("Plain bagel");
        basket.add("Onion bagel");

        Assertions.assertFalse(basket.remove("Garlic bagel"));
        Assertions.assertEquals("[Plain bagel, Plain bagel, Onion bagel]", basket.toString());
    }

    @Test
    public void successfullyResizeBasketTo5() {
        Basket basket = new Basket();

        Assertions.assertTrue(basket.resizeBasket(5));
        Assertions.assertEquals(5, basket.getCapacity());
    }

    @Test
    public void unsuccessfullyResizeBasket() {
        Basket basket = new Basket();

        Assertions.assertFalse(basket.resizeBasket(-1));
    }

    @Test
    public void successfullyResizeBasketTo1() {
        Basket basket = new Basket();
        basket.add("Plain bagel");
        basket.add("Onion bagel");

        Assertions.assertTrue(basket.resizeBasket(1));
        Assertions.assertEquals("[Plain bagel]", basket.toString());
    }

}
