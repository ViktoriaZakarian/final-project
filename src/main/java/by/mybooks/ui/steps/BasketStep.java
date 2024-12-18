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

    public void addBookIntoBasketFromTheFirstPageOfCatalog(String catalogSection, String link, String bookXpath, String buttonAddTheBookIntoBasketXpath) {
        logger.info("BasketStep - addBookIntoBasketFromTheFirstPageOfCatalog():{}", catalogSection, link, bookXpath, buttonAddTheBookIntoBasketXpath);
        HomePage homePage = new HomePage();
        homePage.clickButtonAcceptAllCookies();

        SearchStringPage searchStringPage = new SearchStringPage();
        searchStringPage
                .clickLinkInCatalog(catalogSection, link)
                .clickButtonAddIntoBasket(bookXpath, buttonAddTheBookIntoBasketXpath)
                .clickButtonBasket();
    }

    public void addBookIntoBasketFromTheSecondPageOfCatalog(String catalogSection, String link, String bookXpath, String buttonAddTheBookIntoBasketXpath) {
        logger.info("BasketStep - addBookIntoBasketFromTheSecondPageOfCatalog():{}", catalogSection, link, bookXpath, buttonAddTheBookIntoBasketXpath);
        CatalogStep step = new CatalogStep();
        step.goToTheSecondPageOfTheCatalog();

        SearchStringPage searchStringPage = new SearchStringPage();
        searchStringPage
                .clickLinkInCatalog(catalogSection, link)
                .clickButtonAddIntoBasket(bookXpath, buttonAddTheBookIntoBasketXpath)
                .clickButtonBasket();
    }

    public void addBookIntoBasketFromTheThirdPageOfCatalog(String catalogSection, String link, String bookXpath, String buttonAddTheBookIntoBasketXpath) {
        logger.info("BasketStep - addBookIntoBasketFromTheThirdPageOfCatalog():{}", catalogSection, link, bookXpath, buttonAddTheBookIntoBasketXpath);
        CatalogStep step = new CatalogStep();
        step.goToTheThirdPageOfTheCatalog();

        SearchStringPage searchStringPage = new SearchStringPage();
        searchStringPage
                .clickLinkInCatalog(catalogSection, link)
                .clickButtonAddIntoBasket(bookXpath, buttonAddTheBookIntoBasketXpath)
                .clickButtonBasket();
    }

    public void addBookIntoBasketFromTheFourthPageOfCatalog(String catalogSection, String link, String bookXpath, String buttonAddTheBookIntoBasketXpath) {
        logger.info("BasketStep - addBookIntoBasketFromTheFourthPageOfCatalog():{}", catalogSection, link, bookXpath, buttonAddTheBookIntoBasketXpath);
        CatalogStep step = new CatalogStep();
        step.goToTheFourthPageOfTheCatalog();

        SearchStringPage searchStringPage = new SearchStringPage();
        searchStringPage
                .clickLinkInCatalog(catalogSection, link)
                .clickButtonAddIntoBasket(bookXpath, buttonAddTheBookIntoBasketXpath)
                .clickButtonBasket();
    }
}
