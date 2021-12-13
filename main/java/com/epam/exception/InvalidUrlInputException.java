package com.epam.exception;

public class InvalidUrlInputException extends Exception {
    public InvalidUrlInputException() {
        super("Invalid Url");
    }
}