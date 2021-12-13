package com.epam.validator;

import com.epam.entity.Record;
import com.epam.service.RecordServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.epam.entity.*;

@Component
public class DuplicateRecordValidator implements RecordValidator {
    @Autowired
    RecordServiceImpl recordServiceImpl;

    @Override
    public boolean isValidRecord(Record record) {
        return recordServiceImpl.isRecordExists(record);
    }
}