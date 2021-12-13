package com.epam.exception;

public class InvalidAccountNameInputException extends Exception {
    public InvalidAccountNameInputException() {
        super("Sorry! Invalid AccountName");
    }
}