package by.mybooks.ui.steps;

import by.mybooks.ui.homepage.HomePage;
import by.mybooks.ui.searchstring.SearchStringPage;

public class BasketStep {

    public void addBookIntoBasket(String book, String bookXpath, String buttonAddTheBookIntoBasketXpath) {
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
