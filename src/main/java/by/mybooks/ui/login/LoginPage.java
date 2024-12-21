package by.mybooks.ui.login;

import by.mybooks.driver.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private static final Logger logger = LogManager.getLogger();

    private WebDriver driver;

    public LoginPage() {
        driver = Driver.getDriver();
    }

    public LoginPage clickButtonEntranceHomePage() {
        logger.info("LoginPage - clickButtonEntranceHomePage()");
        driver.findElement(By.xpath(LoginXpath.BUTTON_ENTRANCE_HOMEPAGE_XPATH)).click();
        return this;
    }

    public LoginPage sendKeysEmail(String email) {
        logger.info("LoginPage - sendKeysEmail():{}", email);
        driver.findElement(By.xpath(LoginXpath.INPUT_EMAIL_XPATH)).sendKeys(email);
        return this;
    }

    public LoginPage sendKeysPassword(String password) {
        logger.info("LoginPage - sendKeysPassword():{}", password);
        driver.findElement(By.xpath(LoginXpath.INPUT_PASSWORD_XPATH)).sendKeys(password);
        return this;
    }

    public LoginPage clickButtonEntrance() {
        logger.info("LoginPage - clickButtonEntrance()");
        driver.findElement(By.xpath(LoginXpath.BUTTON_ENTRANCE_XPATH)).click();
        return this;
    }

    public String getTextYourEmail() {
        logger.info("LoginPage - getTextYourEmail()");
        return driver.findElement(By.xpath(LoginXpath.EMAIL_MESSAGE_XPATH)).getText();
    }

    public String getTextPassword() {
        logger.info("LoginPage - getTextPassword()");
        return driver.findElement(By.xpath(LoginXpath.PASSWORD_MESSAGE_XPATH)).getText();
    }
}
