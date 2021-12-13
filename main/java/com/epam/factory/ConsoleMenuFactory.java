package com.epam.factory;

import com.epam.console.ExitMenu;
import com.epam.console.LogInUserMenu;
import com.epam.console.Menu;
import com.epam.console.UserRegistrationMenu;
import com.epam.enums.MenuEnum;
import com.epam.exception.InvalidConsoleInputException;
import com.epam.exception.NoConsoleInputException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConsoleMenuFactory {

    @Autowired
    LogInUserMenu loginUserMenuObj;

    @Autowired
    UserRegistrationMenu userRegistrationMenuObj;

    @Autowired
    ExitMenu exitMenuObj;

    public Menu getConsoleMenu(MenuEnum consoleMenuEnum)
            throws NoConsoleInputException, InvalidConsoleInputException {

        switch (consoleMenuEnum) {
            case LOGIN_USER:
                return loginUserMenuObj;
            case REGISTER_USER:
                return userRegistrationMenuObj;
            case EXIT:
                return exitMenuObj;
            case INVALID:
                throw new InvalidConsoleInputException();
        }
        throw new NoConsoleInputException();
    }
}

