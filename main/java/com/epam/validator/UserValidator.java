package com.epam.validator;

import com.epam.entity.Account;

public interface UserValidator {
    boolean isValidUser(Account account);
}
