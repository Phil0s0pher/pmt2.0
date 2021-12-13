package com.epam.service;


import com.epam.entity.Account;
import com.epam.entity.Record;
import com.epam.repository.RecordRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.epam.entity.*;

import java.util.List;

@Service
public class RecordServiceImpl implements RecordService {
    @Autowired
    RecordRepositoryImpl recordRepositoryImpl;

    private Account account;

    @Override
    public boolean addRecord(Record record) {
        record.setAccount(account);
        record.setPassword((record.getPassword()));
        Record addedRecord = recordRepositoryImpl.save(record);
        return addedRecord != null;
    }

    @Override
    public Record findRecordBasedOnUrl(Record record) {
        return recordRepositoryImpl.findByUrlAndAccount(record.getUrl(), account);
    }

    @Override
    public List<Record> findAllRecords() {
        return recordRepositoryImpl.findByAccount(account);
    }

    @Override
    public boolean updateRecord(Record record) {
        record.setAccount(account);
        record.setPassword((record.getPassword()));
        Record updatedRecord = recordRepositoryImpl.save(record);
        return updatedRecord != null;
    }

    @Override
    public boolean deleteRecordBasedOnUrl(Record record) {
        record.setAccount(account);
        Record fetchRecord = findRecordBasedOnUrl(record);
        if (fetchRecord != null) {
            recordRepositoryImpl.deleteByUrlAndAccount(record.getUrl(), account);
            return true;
        }
        return false;
    }

    @Override
    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public Account getAccount() {
        return this.account;
    }

    @Override
    public boolean isRecordExists(Record record) {
        return recordRepositoryImpl.existsByUrlAndAccount(record.getUrl(), account);
    }
}

