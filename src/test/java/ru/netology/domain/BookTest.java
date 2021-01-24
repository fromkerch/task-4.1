package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    private Book book = new Book(1, "Inception", 220, "Christofer Nolan");
    private Smartphone smartphone = new Smartphone(3, "8", 25000, "Samsung");

    @Test
    void shouldNotMatchesSearch() {
        boolean actual = book.matches("");
        assertEquals(false, actual);
    }

    @Test
    void shouldMatchesBookByTitle() {
        boolean actual = book.matches("Inception");
        assertEquals(true, actual);
    }

    @Test
    void shouldMatchesBookByAuthor() {
        boolean actual = book.matches("Christofer Nolan");
        assertEquals(true, actual);
    }
}