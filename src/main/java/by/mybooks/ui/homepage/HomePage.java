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

    public HomePage clickButtonNext() {
        logger.info("HomePage - clickButtonNext()");
        driver.findElement(By.xpath(HomePageXpath.BUTTON_NEXT_XPATH)).click();
        return this;
    }

    public HomePage clickCatalogSectionLink(String catalogSectionLinkXpath) {
        logger.info("HomePage - clickCatalogSectionLink:{}", catalogSectionLinkXpath);
        driver.findElement(By.xpath(catalogSectionLinkXpath)).click();
        return this;
    }

    public String getTextOfTheCatalogSectionTitle() {
        logger.info("HomePage - getTextOfTheCatalogSectionTitle");
        return driver.findElement(By.xpath(HomePageXpath.TITLE_TEXT_XPATH)).getText();
    }
}
