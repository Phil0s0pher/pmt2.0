package com.epam.factory;


import com.epam.enums.RecordEnum;
import com.epam.exception.InvalidRecordValidatorException;
import com.epam.validator.PasswordValidator;
import com.epam.validator.RecordValidator;
import com.epam.validator.UrlValidator;
import com.epam.validator.UserNameValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecordValidatorFactory {
    @Autowired
    UserNameValidator userNameValidator;

    @Autowired
    PasswordValidator passwordValidator;

    @Autowired
    UrlValidator urlValidator;


    public RecordValidator getRecordValidate(RecordEnum recordEnum) throws InvalidRecordValidatorException {
        switch (recordEnum) {
            case USER_NAME:
                return userNameValidator;
            case PASSWORD:
                return passwordValidator;
            case URL:
                return urlValidator;
        }
        throw new InvalidRecordValidatorException();
    }
}

