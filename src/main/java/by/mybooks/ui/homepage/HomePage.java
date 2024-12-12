package by.mybooks.ui.homepage;

import by.mybooks.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage() {
        driver = Driver.getDriver();
    }

    public HomePage clickButtonAcceptAllCookies() {
        driver.findElement(By.xpath(HomePageXpath.BUTTON_ACCEPT_ALL_COOKIES_XPATH)).click();
        return this;
    }

    public HomePage clickAddressOfTheShopLink() {
        driver.findElement(By.xpath(HomePageXpath.ADDRESS_OF_THE_SHOP_LINK_XPATH)).click();
        return this;
    }

    public String getTextAddressOfTheShop() {
        return driver.findElement(By.xpath(HomePageXpath.ADDRESS_OF_THE_SHOP_TEXT_XPATH)).getText();
    }

    public HomePage clickPaymentAndDeliveryLink() {
        driver.findElement(By.xpath(HomePageXpath.PAYMENT_AND_DELIVERY_LINK_XPATH)).click();
        return this;
    }

    public String getTextPaymentAndDelivery() {
        return driver.findElement(By.xpath(HomePageXpath.PAYMENT_AND_DELIVERY_TEXT_XPATH)).getText();
    }
}
