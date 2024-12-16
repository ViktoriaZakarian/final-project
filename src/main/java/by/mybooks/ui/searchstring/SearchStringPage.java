package by.mybooks.ui.searchstring;

import by.mybooks.driver.Driver;
import by.mybooks.ui.homepage.HomePageXpath;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class SearchStringPage {

    private static final Logger logger = LogManager.getLogger();

    private WebDriver driver;

    public SearchStringPage() {
        driver = Driver.getDriver();
    }

    public SearchStringPage sendKeysSearchForABook(String book) {
        logger.info("SearchStringPage - sendKeysSearchForABook():{}", book);
        driver.findElement(By.xpath(HomePageXpath.SEARCH_STRING_XPATH)).sendKeys(book);
        return this;
    }

    public SearchStringPage clickButtonSearch() {
        logger.info("SearchStringPage - clickButtonSearch()");
        driver.findElement(By.xpath(HomePageXpath.BUTTON_SEARCH_XPATH)).click();
        return this;
    }

    public SearchStringPage clickButtonAddIntoBasket(String bookXpath, String buttonAddTheBookIntoBasketXpath) {
        logger.info("SearchStringPage - clickButtonAddIntoBasket():{}", bookXpath, buttonAddTheBookIntoBasketXpath);
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath(bookXpath))).perform();
        driver.findElement(By.xpath(buttonAddTheBookIntoBasketXpath)).click();
        return this;
    }

    public SearchStringPage clickButtonBasket() {
        logger.info("SearchStringPage - clickButtonBasket()");
        driver.findElement(By.xpath(HomePageXpath.BUTTON_BASKET_XPATH)).click();
        return this;
    }

    public String getTextBookInTheBasket(String titleOfTheBookXpath) {
        logger.info("SearchStringPage - getTextBookInTheBasket():{}", titleOfTheBookXpath);
        return driver.findElement(By.xpath(titleOfTheBookXpath)).getText();
    }

    public SearchStringPage clickButtonAddTheSameExtraBook() {
        logger.info("SearchStringPage - clickButtonAddTheSameExtraBook()");
        driver.findElement(By.xpath(SearchStringXpath.BUTTON_ADD_THE_SAME_EXTRA_BOOK_XPATH)).click();
        return this;
    }

    public String getAmountOfBooksInTheBasket(String amountOfBooksXpath) {
        logger.info("SearchStringPage - getAmountOfBooksInTheBasket():{}", amountOfBooksXpath);
        return driver.findElement(By.xpath(amountOfBooksXpath)).getAttribute("value");
    }
}
