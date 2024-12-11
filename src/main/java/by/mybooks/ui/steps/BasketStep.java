package by.mybooks.ui.steps;

import by.mybooks.ui.homepage.HomePage;

public class BasketStep {

    public void addBookIntoBasket() {
        HomePage homePage = new HomePage();

        homePage
                .clickButtonAcceptAllCookies()
                .sendKeysSearchForABook()
                .clickButtonSearch()
                .clickButtonAddIntoBasket()
                .clickButtonBasket();
    }
}
