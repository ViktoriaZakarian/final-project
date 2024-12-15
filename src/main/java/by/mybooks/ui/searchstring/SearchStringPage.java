package by.mybooks.ui.searchstring;

import by.mybooks.driver.Driver;
import by.mybooks.ui.homepage.HomePageXpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class SearchStringPage {

    private WebDriver driver;

    public SearchStringPage() {
        driver = Driver.getDriver();
    }

    public SearchStringPage sendKeysSearchForABook(String book) {
        driver.findElement(By.xpath(HomePageXpath.SEARCH_STRING_XPATH)).sendKeys(book);
        return this;
    }

    public SearchStringPage clickButtonSearch() {
        driver.findElement(By.xpath(HomePageXpath.BUTTON_SEARCH_XPATH)).click();
        return this;
    }

    public SearchStringPage clickButtonAddIntoBasket(String bookXpath, String buttonAddTheBookIntoBasketXpath) {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath(bookXpath))).perform();
        driver.findElement(By.xpath(buttonAddTheBookIntoBasketXpath)).click();
        return this;
    }

    public SearchStringPage clickButtonBasket() {
        driver.findElement(By.xpath(HomePageXpath.BUTTON_BASKET_XPATH)).click();
        return this;
    }

    public String getTextBookInTheBasket(String titleOfTheBookXpath) {
        return driver.findElement(By.xpath(titleOfTheBookXpath)).getText();
    }

    public SearchStringPage clickButtonAddTheSameExtraBook() {
        driver.findElement(By.xpath(SearchStringXpath.BUTTON_ADD_THE_SAME_EXTRA_BOOK_XPATH)).click();
        return this;
    }

    public String getAmountOfBooksInTheBasket(String amountOfBooksXpath) {
        return driver.findElement(By.xpath(amountOfBooksXpath)).getAttribute("value");
    }
}
