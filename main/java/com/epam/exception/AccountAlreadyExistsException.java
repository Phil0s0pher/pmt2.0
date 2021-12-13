package com.epam.exception;

public class AccountAlreadyExistsException extends Exception {
    public AccountAlreadyExistsException() {
        super("Account Already Exists....!Please Login");
    }
}
