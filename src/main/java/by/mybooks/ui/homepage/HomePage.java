package by.mybooks.ui.homepage;

import by.mybooks.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

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
        return driver.findElement(By.xpath(HomePageXpath.ADDRESS_OF_THE_SHOO_TEXT_XPATH)).getText();
    }

    public HomePage sendKeysSearchForABook(String book) {
        driver.findElement(By.xpath(HomePageXpath.SEARCH_STRING_XPATH)).sendKeys(book);
        return this;
    }

    public HomePage clickButtonSearch() {
        driver.findElement(By.xpath(HomePageXpath.BUTTON_SEARCH_XPATH)).click();
        return this;
    }

    public HomePage clickButtonAddIntoBasket(String bookXpath, String buttonAddTheBookIntoBasketXpath) {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath(bookXpath))).perform();
        driver.findElement(By.xpath(buttonAddTheBookIntoBasketXpath)).click();
        return this;
    }

    public HomePage clickButtonBasket() {
        driver.findElement(By.xpath(HomePageXpath.BUTTON_BASKET_XPATH)).click();
        return this;
    }

    public String getTextBookInTheBasket(String titleOfTheBookXpath) {
        return driver.findElement(By.xpath(titleOfTheBookXpath)).getText();
    }

    public HomePage clickPaymentAndDeliveryLink() {
        driver.findElement(By.xpath(HomePageXpath.PAYMENT_AND_DELIVERY_LINK_XPATH)).click();
        return this;
    }

    public String getTextPaymentAndDelivery() {
        return driver.findElement(By.xpath(HomePageXpath.PAYMENT_AND_DELIVERY_TEXT_XPATH)).getText();
    }
}
