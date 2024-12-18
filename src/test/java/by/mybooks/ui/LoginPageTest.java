package by.mybooks.ui;

import by.mybooks.domain.Users;
import by.mybooks.ui.login.LoginMessage;
import by.mybooks.ui.login.LoginPage;
import by.mybooks.ui.steps.LoginStep;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LoginPageTest extends BaseTest {

    private static final Logger logger = LogManager.getLogger();

    @Test
    @DisplayName("проверка формы логина с пустыми значениями email и password")
    public void testLoginFormWithEmptyEmailAndEmptyPassword() {

        logger.info("НАЧАЛО - Тест testLoginFormWithEmptyEmailAndEmptyPassword() " +
                "проверка формы логина с пустыми значениями email и password");

        LoginStep loginStep = new LoginStep();
        loginStep.fillFormAndSubmit(Users.getUserWithNoData());

        LoginPage loginPage = new LoginPage();
        Assertions.assertEquals(LoginMessage.YOUR_EMAIL_MESSAGE, loginPage.getTextYourEmail());
        Assertions.assertEquals(LoginMessage.PASSWORD_MESSAGE, loginPage.getTextPassword());

        logger.info("КОНЕЦ - Тест testLoginFormWithEmptyEmailAndEmptyPassword() " +
                "проверка формы логина с пустыми значениями email и password");
    }

    @Test
    @DisplayName("проверка формы логина с валидными значениями email и password")
    public void testLoginFormWithValidEmailAndValidPassword() {

        logger.info("НАЧАЛО - Тест testLoginFormWithEmptyEmailAndEmptyPassword() " +
                "проверка формы логина с валидными значениями email и password");

        LoginStep loginStep = new LoginStep();
        loginStep.fillFormAndSubmit(Users.getUserWithValidData());

        LoginPage loginPage = new LoginPage();
        Assertions.assertEquals(LoginMessage.YOUR_EMAIL_MESSAGE, loginPage.getTextYourEmail());
        Assertions.assertEquals(LoginMessage.PASSWORD_MESSAGE, loginPage.getTextPassword());

        logger.info("КОНЕЦ - Тест testLoginFormWithEmptyEmailAndEmptyPassword() " +
                "проверка формы логина с валидными значениями email и password");
    }

    @Test
    @DisplayName("проверка формы логина с валидным значением email и пустым значением password")
    public void testLoginFormWithValidEmailAndEmptyPassword() {

        logger.info("НАЧАЛО - Тест testLoginFormWithValidEmailAndEmptyPassword() " +
                "проверка формы логина с валидным значением email и пустым значением password");

        LoginStep loginStep = new LoginStep();
        loginStep.fillFormAndSubmit(Users.getUserWithValidEmailAndNoPassword());

        LoginPage loginPage = new LoginPage();
        Assertions.assertEquals(LoginMessage.YOUR_EMAIL_MESSAGE, loginPage.getTextYourEmail());
        Assertions.assertEquals(LoginMessage.PASSWORD_MESSAGE, loginPage.getTextPassword());

        logger.info("КОНЕЦ - Тест testLoginFormWithValidEmailAndEmptyPassword() " +
                "проверка формы логина с валидным значением email и пустым значением password");
    }

    @Test
    @DisplayName("проверка формы логина с пустым значением email и валидным значением password")
    public void testLoginFormWithEmptyEmailAndValidPassword() {

        logger.info("НАЧАЛО - testLoginFormWithEmptyEmailAndValidPassword() " +
                "проверка формы логина с пустым значением email и валидным значением password");

        LoginStep loginStep = new LoginStep();
        loginStep.fillFormAndSubmit(Users.getUserWithNoEmailAndValidPassword());

        LoginPage loginPage = new LoginPage();
        Assertions.assertEquals(LoginMessage.YOUR_EMAIL_MESSAGE, loginPage.getTextYourEmail());
        Assertions.assertEquals(LoginMessage.PASSWORD_MESSAGE, loginPage.getTextPassword());

        logger.info("КОНЕЦ - testLoginFormWithEmptyEmailAndValidPassword() " +
                "проверка формы логина с пустым значением email и валидным значением password");
    }

    @Test
    @DisplayName("проверка формы логина с пустым значением email и невалидным значением password")
    public void testLoginFormWithEmptyEmailAndInvalidPassword() {

        logger.info("НАЧАЛО - testLoginFormWithEmptyEmailAndInvalidPassword() " +
                "проверка формы логина с пустым значением email и невалидным значением password");

        LoginStep loginStep = new LoginStep();
        loginStep.fillFormAndSubmit(Users.getUserWithNoEmailAndInvalidPassword());

        LoginPage loginPage = new LoginPage();
        Assertions.assertEquals(LoginMessage.YOUR_EMAIL_MESSAGE, loginPage.getTextYourEmail());
        Assertions.assertEquals(LoginMessage.PASSWORD_MESSAGE, loginPage.getTextPassword());

        logger.info("КОНЕЦ - testLoginFormWithEmptyEmailAndInvalidPassword() " +
                "проверка формы логина с пустым значением email и невалидным значением password");
    }

    @Test
    @DisplayName("проверка формы логина с невалидным значением email и пустым значением password")
    public void testLoginFormWithInvalidEmailAndEmptyPassword() {

        logger.info("НАЧАЛО - testLoginFormWithInvalidEmailAndEmptyPassword() " +
                "проверка формы логина с невалидным значением email и пустым значением password");

        LoginStep loginStep = new LoginStep();
        loginStep.fillFormAndSubmit(Users.getUserWithInvalidEmailAndNoPassword());

        LoginPage loginPage = new LoginPage();
        Assertions.assertEquals(LoginMessage.YOUR_EMAIL_MESSAGE, loginPage.getTextYourEmail());
        Assertions.assertEquals(LoginMessage.PASSWORD_MESSAGE, loginPage.getTextPassword());

        logger.info("КОНЕЦ - testLoginFormWithInvalidEmailAndEmptyPassword() " +
                "проверка формы логина с невалидным значением email и пустым значением password");
    }

    @Test
    @DisplayName("проверка формы логина с невалидными значениями email и password")
    public void testLoginFormWithInvalidEmailAndInvalidPassword() {

        logger.info("НАЧАЛО - testLoginFormWithInvalidEmailAndInvalidPassword() " +
                "проверка формы логина с невалидными значениями email и password");

        LoginStep loginStep = new LoginStep();
        loginStep.fillFormAndSubmit(Users.getUserWithInvalidData());

        LoginPage loginPage = new LoginPage();
        Assertions.assertEquals(LoginMessage.YOUR_EMAIL_MESSAGE, loginPage.getTextYourEmail());
        Assertions.assertEquals(LoginMessage.PASSWORD_MESSAGE, loginPage.getTextPassword());

        logger.info("КОНЕЦ - testLoginFormWithInvalidEmailAndInvalidPassword() " +
                "проверка формы логина с невалидными значениями email и password");
    }

    @Test
    @DisplayName("проверка формы логина с невалидным значением email и валидным значением password")
    public void testLoginFormWithInvalidEmailAndValidPassword() {

        logger.info("НАЧАЛО - testLoginFormWithInvalidEmailAndValidPassword() " +
                "проверка формы логина с невалидным значением email и валидным значением password");

        LoginStep loginStep = new LoginStep();
        loginStep.fillFormAndSubmit(Users.getUserWithInvalidEmailAndValidPassword());

        LoginPage loginPage = new LoginPage();
        Assertions.assertEquals(LoginMessage.YOUR_EMAIL_MESSAGE, loginPage.getTextYourEmail());
        Assertions.assertEquals(LoginMessage.PASSWORD_MESSAGE, loginPage.getTextPassword());

        logger.info("КОНЕЦ - testLoginFormWithInvalidEmailAndValidPassword() " +
                "проверка формы логина с невалидным значением email и валидным значением password");
    }

    @Test
    @DisplayName("проверка формы логина с валидным значением email и невалдиным значением password")
    public void testLoginFormWithValidEmailAndInvalidPassword() {

        logger.info("НАЧАЛО - testLoginFormWithValidEmailAndInvalidPassword() " +
                "проверка формы логина с валидным значением email и невалдиным значением password");

        LoginStep loginStep = new LoginStep();
        loginStep.fillFormAndSubmit(Users.getUserWithValidEmailAndInvalidPassword());

        LoginPage loginPage = new LoginPage();
        Assertions.assertEquals(LoginMessage.YOUR_EMAIL_MESSAGE, loginPage.getTextYourEmail());
        Assertions.assertEquals(LoginMessage.PASSWORD_MESSAGE, loginPage.getTextPassword());

        logger.info("КОНЕЦ - testLoginFormWithValidEmailAndInvalidPassword() " +
                "проверка формы логина с валидным значением email и невалдиным значением password");
    }
}
