package by.mybooks.ui.steps;

import by.mybooks.ui.homepage.HomePage;
import by.mybooks.ui.searchstring.SearchStringPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BasketStep {

    private static final Logger logger = LogManager.getLogger();

    public void addBookIntoBasket(String book, String bookXpath, String buttonAddTheBookIntoBasketXpath) {
        logger.info("BasketStep - addBookIntoBasket():{}", book, bookXpath, buttonAddTheBookIntoBasketXpath);
        HomePage homePage = new HomePage();
        homePage.clickButtonAcceptAllCookies();

        SearchStringPage searchStringPage = new SearchStringPage();
        searchStringPage
                .sendKeysSearchForABook(book)
                .clickButtonSearch()
                .clickButtonAddIntoBasket(bookXpath, buttonAddTheBookIntoBasketXpath)
                .clickButtonBasket();
    }
}
