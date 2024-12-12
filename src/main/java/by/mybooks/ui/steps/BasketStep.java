package by.mybooks.ui.steps;

import by.mybooks.ui.homepage.HomePage;

public class BasketStep {

    public void addBookIntoBasket(String book, String bookXpath, String buttonAddTheBookIntoBasketXpath) {
        HomePage homePage = new HomePage();
        homePage
                .clickButtonAcceptAllCookies()
                .sendKeysSearchForABook(book)
                .clickButtonSearch()
                .clickButtonAddIntoBasket(bookXpath, buttonAddTheBookIntoBasketXpath)
                .clickButtonBasket();
    }
}
