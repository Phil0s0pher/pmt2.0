package com.epam.validator;

import com.epam.entity.Account;
import com.epam.service.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DuplicateAccountValidator implements AccountValidator {
    @Autowired
    AccountServiceImpl accountServiceImplObj;

    @Override
    public boolean isAccountExists(Account account) {
        return accountServiceImplObj.isAccountExists(account);
    }
}
