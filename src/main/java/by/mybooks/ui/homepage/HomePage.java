package by.mybooks.ui.homepage;

import by.mybooks.driver.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private static final Logger logger = LogManager.getLogger();

    private WebDriver driver;

    public HomePage() {
        driver = Driver.getDriver();
    }

    public HomePage clickButtonAcceptAllCookies() {
        logger.info("HomePage - clickButtonAcceptAllCookies()");
        driver.findElement(By.xpath(HomePageXpath.BUTTON_ACCEPT_ALL_COOKIES_XPATH)).click();
        return this;
    }

    public HomePage clickAddressOfTheShopLink() {
        logger.info("HomePage - clickAddressOfTheShopLink()");
        driver.findElement(By.xpath(HomePageXpath.ADDRESS_OF_THE_SHOP_LINK_XPATH)).click();
        return this;
    }

    public String getTextAddressOfTheShop() {
        logger.info("HomePage - getTextAddressOfTheShop()");
        return driver.findElement(By.xpath(HomePageXpath.ADDRESS_OF_THE_SHOP_TEXT_XPATH)).getText();
    }

    public HomePage clickPaymentAndDeliveryLink() {
        logger.info("HomePage - clickPaymentAndDeliveryLink()");
        driver.findElement(By.xpath(HomePageXpath.PAYMENT_AND_DELIVERY_LINK_XPATH)).click();
        return this;
    }

    public String getTextPaymentAndDelivery() {
        logger.info("HomePage - getTextPaymentAndDelivery()");
        return driver.findElement(By.xpath(HomePageXpath.PAYMENT_AND_DELIVERY_TEXT_XPATH)).getText();
    }

    public HomePage clickFictionLink() {
        logger.info("HomePage - clickFictionLink()");
        driver.findElement(By.xpath(HomePageXpath.FICTION_LINK_XPATH)).click();
        return this;
    }

    public String getTextFiction() {
        logger.info("HomePage - getTextFiction()");
        return driver.findElement(By.xpath(HomePageXpath.FICTION_TEXT_XPATH)).getText();
    }

    public HomePage clickNewYearLink() {
        logger.info("HomePage - clickNewYearLink()");
        driver.findElement(By.xpath(HomePageXpath.NEW_YEAR_LINK_XPATH)).click();
        return this;
    }

    public String getTextNewYear() {
        logger.info("HomePage - getTextNewYear()");
        return driver.findElement(By.xpath(HomePageXpath.NEW_YEAR_TEXT_XPATH)).getText();
    }

    public HomePage clickButtonNext() {
        logger.info("HomePage - clickButtonNext()");
        driver.findElement(By.xpath(HomePageXpath.BUTTON_NEXT_XPATH)).click();
        return this;
    }

    public HomePage clickBestsellersLink() {
        logger.info("HomePage - clickBestsellersLink()");
        driver.findElement(By.xpath(HomePageXpath.BESTSELLERS_LINK_XPATH)).click();
        return this;
    }

    public String getTextBestsellers() {
        logger.info("HomePage - getTextBestsellers()");
        return driver.findElement(By.xpath(HomePageXpath.BESTSELLERS_TEXT_XPATH)).getText();
    }

    public HomePage clickComputerLiteratureLink() {
        logger.info("HomePage - clickComputerLiteratureLink()");
        driver.findElement(By.xpath(HomePageXpath.COMPUTER_LITERATURE_LINK_XPATH)).click();
        return this;
    }

    public String getTextComputerLiterature() {
        logger.info("HomePage - getTextComputerLiterature()");
        return driver.findElement(By.xpath(HomePageXpath.COMPUTER_LITERATURE_TEXT_XPATH)).getText();
    }

    public HomePage clickMedicalLiteratureLink() {
        logger.info("HomePage - clickMedicalLiteratureLink()");
        driver.findElement(By.xpath(HomePageXpath.MEDICAL_LITERATURE_LINK_XPATH)).click();
        return this;
    }

    public String getTextMedicalLiterature() {
        logger.info("HomePage - getTextMedicalLiterature()");
        return driver.findElement(By.xpath(HomePageXpath.MEDICAL_LITERATURE_TEXT_XPATH)).getText();
    }
}
