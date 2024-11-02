package com.startjava.lesson_2_3_4.library;

public class ShelfFullException extends RuntimeException {
    public ShelfFullException(String message) {
        super(message);
    }
}