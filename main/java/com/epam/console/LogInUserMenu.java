package com.epam.console;

import com.epam.entity.Account;
import com.epam.exception.AccountDoesNotExistException;
import com.epam.exception.WrongPasswordException;
import com.epam.service.AccountServiceImpl;
import com.epam.service.RecordServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LogInUserMenu implements Menu {
    private static final Logger logger = LogManager.getLogger(LogInUserMenu.class);

    private String accountName;
    private String userName;
    private String password;

    @Autowired
    UserInput userInput;

    @Autowired
    AccountServiceImpl accountServiceImplObj;

    @Autowired
    RecordConsoleMenu recordConsoleMenu;

    @Autowired
    RecordServiceImpl recordServiceImpl;

    @Override
    public void displayMenu() throws Exception {
        logger.info("------Login Details------");
        userName = userInput.getUserNameInput();
        password = userInput.getPasswordInput();
        Account account = new Account(userName, password);
        accountName = accountServiceImplObj.validateLogin(account);
        if (accountName.equals("invalidPassword")) {
            throw new WrongPasswordException();
        } else if (accountName.equals("invalidAccount")) {
            throw new AccountDoesNotExistException();
        } else {
            logger.info("Hi, " + accountName + "! Welcome..");
            recordServiceImpl.setAccount(account); // setting account for global
            recordConsoleMenu.displayMenu();
        }
    }
}
