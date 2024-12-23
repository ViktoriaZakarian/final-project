package by.mybooks.ui.steps;

import by.mybooks.domain.User;
import by.mybooks.ui.login.LoginPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoginStep {

    private static final Logger logger = LogManager.getLogger();

    public void fillFormAndSubmit(String email, String password) {
        logger.info("LoginStep - fillFormAndSubmit: email{}, password{}", email, password);
        LoginPage loginPage = new LoginPage();

        loginPage
                .clickButtonEntranceHomePage()
                .sendKeysEmail(email)
                .sendKeysPassword(password)
                .clickButtonEntrance();
    }

    public void fillFormAndSubmit(User user) {
        logger.info("LoginStep - fillFormAndSubmit():{}", user);
        fillFormAndSubmit(user.getEmail(), user.getPassword());
    }
}
