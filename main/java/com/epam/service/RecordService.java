package com.epam.service;
import com.epam.entity.*;
import com.epam.entity.Record;

import java.util.List;

public interface RecordService {
    boolean addRecord(Record record);

    Record findRecordBasedOnUrl(Record record);

    List<Record> findAllRecords();

    boolean updateRecord(Record record);

    boolean deleteRecordBasedOnUrl(Record record);

    void setAccount(Account account);

    Account getAccount();

    boolean isRecordExists(Record record);
}

