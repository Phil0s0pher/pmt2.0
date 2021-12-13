package com.epam.exception;

public class RecordDoesNotExistException extends Exception {
    public RecordDoesNotExistException() {
        super("No Record Found!!!");
    }
}