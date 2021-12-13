package com.epam.repository;

import com.epam.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface AccountRepositoryImpl extends JpaRepository<Account, String> {
    boolean existsByUserName(String userName);

    Account findByUserName(String userName);
}