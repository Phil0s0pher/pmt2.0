package com.epam.validator;

import com.epam.entity.Record;
import org.springframework.stereotype.Component;
import com.epam.entity.*;
import java.util.regex.Pattern;

@Component
public class UrlValidator implements RecordValidator {
    private final String URL_REGEX = "((([A-Za-z]{3,9}:(?:\\/\\/)?)(?:[-;:&=\\+\\$,\\w]+@)?[A-Za-z0-9.-]+|(?:www.|[-;:&=\\+\\$,\\w]+@)[A-Za-z0-9.-]+)((?:\\/[\\+~%\\/.\\w-_]*)?\\??(?:[-\\+=&;%@.\\w_]*)#?(?:[\\w]*))?)";

    @Override
    public boolean isValidRecord(Record record) {
        return Pattern.matches(URL_REGEX, record.getUrl()) && checkNullAndBlankInput(record.getUrl());
    }

    static boolean checkNullAndBlankInput(String input) {
        return input != null && !input.equals("");
    }
}
