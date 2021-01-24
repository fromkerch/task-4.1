package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {
    private Book book = new Book(1, "Inception", 220, "Christofer Nolan");
    private Smartphone smartphone = new Smartphone(3, "8", 25000, "Samsung");

    @Test
    void shouldNotMatchesSearch() {
        boolean actual = smartphone.matches("");
        assertEquals(false, actual);
    }

    @Test
    void shouldMatchesBookByTitle() {
        boolean actual = smartphone.matches("8");
        assertEquals(true, actual);
    }

    @Test
    void shouldMatchesBookByManufacturer() {
        boolean actual = smartphone.matches("Samsung");
        assertEquals(true, actual);
    }
}