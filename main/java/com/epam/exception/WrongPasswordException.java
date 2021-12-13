package com.epam.exception;

public class WrongPasswordException extends Exception {
    public WrongPasswordException() {
        super("Password does not match!!! Try again.");
    }
}
