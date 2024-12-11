package by.mybooks.ui.homepage;

import by.mybooks.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

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

    public HomePage sendKeysSearchForABook() {
        String book = "гарри поттер и философский камень";
        driver.findElement(By.xpath(HomePageXpath.SEARCH_STRING_XPATH)).sendKeys(book);
        return this;
    }

    public HomePage clickButtonSearch() {
        driver.findElement(By.xpath(HomePageXpath.BUTTON_SEARCH_XPATH)).click();
        return this;
    }

    public HomePage clickButtonAddIntoBasket() {
        Actions action = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(HomePageXpath.BOOK_HARRY_POTTER_XPATH)));
        action.moveToElement(driver.findElement(By.xpath(HomePageXpath.BOOK_HARRY_POTTER_XPATH))).perform();
        driver.findElement(By.xpath(HomePageXpath.BUTTON_ADD_BOOK_INTO_BASKET_XPATH)).click();
        return this;
    }

    public void clickButtonBasket() {
        driver.findElement(By.xpath(HomePageXpath.BUTTON_BASKET_XPATH)).click();
    }

    public String getTextBookInTheBasket() {
        return driver.findElement(By.xpath(HomePageXpath.BOOK_IN_THE_BASKET_XPATH)).getText();
    }
}
