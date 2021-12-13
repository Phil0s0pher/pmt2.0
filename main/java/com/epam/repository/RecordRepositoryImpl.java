package com.epam.repository;


import com.epam.entity.Record;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.epam.entity.*;
import java.util.List;

@Repository
@Transactional
public interface RecordRepositoryImpl extends JpaRepository<Record, Integer> {
    List<Record> findByAccount(Account account);

    boolean existsByUrlAndAccount(String url, Account account);

    Record findByUrlAndAccount(String url, Account account);

    void deleteByUrlAndAccount(String url, Account account);
}
