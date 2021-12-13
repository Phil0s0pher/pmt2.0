package com.epam.validator;

import com.epam.entity.Account;

public interface AccountValidator {
    boolean isAccountExists(Account account);
}
