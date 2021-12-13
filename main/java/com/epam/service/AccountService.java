package com.epam.service;

import com.epam.entity.Account;

public interface AccountService {
    boolean registerAccount(Account account);

    boolean isAccountExists(Account account);

    String validateLogin(Account account);
}
