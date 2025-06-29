package com.junit.exception;

public class StudentNotFounException extends RuntimeException {
    public StudentNotFounException (String message) {
        super(message);
    }
}
