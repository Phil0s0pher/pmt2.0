package com.epam.factory;


import com.epam.enums.UserEnum;
import com.epam.exception.InvalidUserValidatorException;
import com.epam.validator.AccountNameValidator;
import com.epam.validator.PasswordValidator;
import com.epam.validator.UserNameValidator;
import com.epam.validator.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserValidatorFactory {
    @Autowired
    AccountNameValidator accountNameValidator;

    @Autowired
    UserNameValidator userNameValidator;

    @Autowired
    PasswordValidator passwordValidator;

    public UserValidator getUserValidate(UserEnum userEnum) throws InvalidUserValidatorException {
        switch (userEnum) {
            case ACCOUNT_NAME:
                return accountNameValidator;
            case USER_NAME:
                return userNameValidator;
            case PASSWORD:
                return passwordValidator;
        }
        throw new InvalidUserValidatorException();
    }
}

