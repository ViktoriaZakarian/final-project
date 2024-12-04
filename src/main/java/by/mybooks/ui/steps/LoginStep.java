package by.mybooks.ui.steps;

import by.mybooks.domain.User;
import by.mybooks.ui.login.LoginPage;

public class LoginStep {

    public void fillFormAndSubmit(String email, String password) {
        LoginPage loginPage = new LoginPage();

        loginPage
                .clickButtonEntranceHomePage()
                .sendKeysEmail(email)
                .sendKeysPassword(password)
                .clickButtonEntrance();
    }

    public void fillFormAndSubmit(User user) {
        fillFormAndSubmit(user.getEmail(), user.getPassword());
    }
}
