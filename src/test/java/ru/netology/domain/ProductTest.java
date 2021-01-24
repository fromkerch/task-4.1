package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    private Product product = new Product(1, "Fix bugs", 1100);

    @Test
    void shouldNotMatchesProduct() {
        boolean actual = product.matches("");
        assertEquals(false, actual);
    }

    @Test
    void shouldMatchesProduct() {
        boolean actual = product.matches("Fix bugs");
        assertEquals(true, actual);
    }
}