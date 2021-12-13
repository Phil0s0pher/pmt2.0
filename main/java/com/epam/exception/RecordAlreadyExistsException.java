package com.epam.exception;

public class RecordAlreadyExistsException extends Exception {
    public RecordAlreadyExistsException() {
        super("Record Already Exists For Input Url..!!!");
    }
}