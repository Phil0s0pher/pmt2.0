package com.epam.service;

import com.epam.entity.Account;
import com.epam.repository.AccountRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    AccountRepositoryImpl accountRepositoryImplObj;

    @Override
    public boolean registerAccount(Account account) {
        account.setPassword((account.getPassword()));
        Account registeredAccount = accountRepositoryImplObj.save(account);
        if (registeredAccount != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isAccountExists(Account account) {
        return accountRepositoryImplObj.existsByUserName(account.getUserName());
    }

    @Override
    public String validateLogin(Account account) {
        account.setPassword((account.getPassword()));
        Account byUserName = accountRepositoryImplObj.findByUserName(account.getUserName());
        if (byUserName != null) {
            if (byUserName.getPassword().equals(account.getPassword()))
                return byUserName.getAccountName();
            else
                return "invalidPassword";
        } else {
            return "invalidAccount";
        }
    }
}

