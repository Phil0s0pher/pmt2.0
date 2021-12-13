package com.epam.exception;

public class AccountDoesNotExistException extends Exception {
    public AccountDoesNotExistException() {
        super("Sorry! No Account Found!!");
    }
}
