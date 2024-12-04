package by.mybooks.ui;

import by.mybooks.domain.Users;
import by.mybooks.ui.login.LoginMessage;
import by.mybooks.ui.login.LoginPage;
import by.mybooks.ui.steps.LoginStep;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LoginPageTest extends BaseTest {

    @Test
    @DisplayName("проверка формы логина с пустыми значениями email и password")
    public void test1() {

        LoginStep loginStep = new LoginStep();
        loginStep.fillFormAndSubmit(Users.getUserWithNoData());

        LoginPage loginPage = new LoginPage();
        Assertions.assertEquals(LoginMessage.YOUR_EMAIL_MESSAGE, loginPage.getTextYourEmail());
        Assertions.assertEquals(LoginMessage.PASSWORD_MESSAGE, loginPage.getTextPassword());
    }

    @Test
    @DisplayName("проверка формы логина с валидными значениями email и password")
    public void test2() {

        LoginStep loginStep = new LoginStep();
        loginStep.fillFormAndSubmit(Users.getUserWithValidData());

        LoginPage loginPage = new LoginPage();
        Assertions.assertEquals(LoginMessage.YOUR_EMAIL_MESSAGE, loginPage.getTextYourEmail());
        Assertions.assertEquals(LoginMessage.PASSWORD_MESSAGE, loginPage.getTextPassword());
    }

    @Test
    @DisplayName("проверка формы логина с валидным значением email и пустым значением password")
    public void test3() {

        LoginStep loginStep = new LoginStep();
        loginStep.fillFormAndSubmit(Users.getUserWithValidEmailAndNoPassword());

        LoginPage loginPage = new LoginPage();
        Assertions.assertEquals(LoginMessage.YOUR_EMAIL_MESSAGE, loginPage.getTextYourEmail());
        Assertions.assertEquals(LoginMessage.PASSWORD_MESSAGE, loginPage.getTextPassword());
    }

    @Test
    @DisplayName("проверка формы логина с пустым значением email и валидным значением password")
    public void test4() {

        LoginStep loginStep = new LoginStep();
        loginStep.fillFormAndSubmit(Users.getUserWithNoEmailAndValidPassword());

        LoginPage loginPage = new LoginPage();
        Assertions.assertEquals(LoginMessage.YOUR_EMAIL_MESSAGE, loginPage.getTextYourEmail());
        Assertions.assertEquals(LoginMessage.PASSWORD_MESSAGE, loginPage.getTextPassword());
    }

    @Test
    @DisplayName("проверка формы логина с пустым значением email и невалидным значением password")
    public void test5() {

        LoginStep loginStep = new LoginStep();
        loginStep.fillFormAndSubmit(Users.getUserWithNoEmailAndInvalidPassword());

        LoginPage loginPage = new LoginPage();
        Assertions.assertEquals(LoginMessage.YOUR_EMAIL_MESSAGE, loginPage.getTextYourEmail());
        Assertions.assertEquals(LoginMessage.PASSWORD_MESSAGE, loginPage.getTextPassword());
    }

    @Test
    @DisplayName("проверка формы логина с невалидным значением email и пустым значением password")
    public void test6() {

        LoginStep loginStep = new LoginStep();
        loginStep.fillFormAndSubmit(Users.getUserWithInvalidEmailAndNoPassword());

        LoginPage loginPage = new LoginPage();
        Assertions.assertEquals(LoginMessage.YOUR_EMAIL_MESSAGE, loginPage.getTextYourEmail());
        Assertions.assertEquals(LoginMessage.PASSWORD_MESSAGE, loginPage.getTextPassword());
    }

    @Test
    @DisplayName("проверка формы логина с невалидными значениями email и password")
    public void test7() {

        LoginStep loginStep = new LoginStep();
        loginStep.fillFormAndSubmit(Users.getUserWithInvalidData());

        LoginPage loginPage = new LoginPage();
        Assertions.assertEquals(LoginMessage.YOUR_EMAIL_MESSAGE, loginPage.getTextYourEmail());
        Assertions.assertEquals(LoginMessage.PASSWORD_MESSAGE, loginPage.getTextPassword());
    }

    @Test
    @DisplayName("проверка формы логина с невалидным значением email и валидным значением password")
    public void test8() {

        LoginStep loginStep = new LoginStep();
        loginStep.fillFormAndSubmit(Users.getUserWithInvalidEmailAndValidPassword());

        LoginPage loginPage = new LoginPage();
        Assertions.assertEquals(LoginMessage.YOUR_EMAIL_MESSAGE, loginPage.getTextYourEmail());
        Assertions.assertEquals(LoginMessage.PASSWORD_MESSAGE, loginPage.getTextPassword());
    }

    @Test
    @DisplayName("проверка формы логина с валидным значением email и невалдиным значением password")
    public void test9() {

        LoginStep loginStep = new LoginStep();
        loginStep.fillFormAndSubmit(Users.getUserWithValidEmailAndInvalidPassword());

        LoginPage loginPage = new LoginPage();
        Assertions.assertEquals(LoginMessage.YOUR_EMAIL_MESSAGE, loginPage.getTextYourEmail());
        Assertions.assertEquals(LoginMessage.PASSWORD_MESSAGE, loginPage.getTextPassword());
    }
}
