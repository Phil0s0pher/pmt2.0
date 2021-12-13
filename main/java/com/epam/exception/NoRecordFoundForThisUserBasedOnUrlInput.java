package com.epam.exception;

public class NoRecordFoundForThisUserBasedOnUrlInput extends Exception {
    public NoRecordFoundForThisUserBasedOnUrlInput() {
        super("No Record Found For Input Url...");
    }
}
