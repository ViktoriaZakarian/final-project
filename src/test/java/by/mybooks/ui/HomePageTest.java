package by.mybooks.ui;

import by.mybooks.ui.homepage.HomePage;
import by.mybooks.ui.homepage.HomePageMessage;
import by.mybooks.ui.homepage.HomePageXpath;
import by.mybooks.ui.steps.BasketStep;
import by.mybooks.util.Books;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class HomePageTest extends BaseTest {

    @Test
    @DisplayName("проверка открытия ссылки Адрес магазина и наличия на странице контакных данных")
    public void test1() {

        HomePage homePage = new HomePage();
        homePage
                .clickButtonAcceptAllCookies()
                .clickAddressOfTheShopLink();

        Assertions.assertEquals(HomePageMessage.ADDRESS_OF_THE_SHOP_TEXT, homePage.getTextAddressOfTheShop());
    }

    @Test
    @DisplayName("поиск книги 'Гарри Поттер и философский камень', добавление книги в корзину, " +
            "проверка, что книга добавилась в корзину")
    public void test2() {

        BasketStep step = new BasketStep();
        step.addBookIntoBasket(Books.HARRY_POTTER, HomePageXpath.BOOK_HARRY_POTTER_XPATH,
                HomePageXpath.BUTTON_ADD_BOOK_HARRY_POTTER_INTO_BASKET_XPATH);

        HomePage homePage = new HomePage();
        Assertions.assertEquals(HomePageMessage.THE_TITLE_HARRY_POTTER,
                homePage.getTextBookInTheBasket(HomePageXpath.BOOK_HARRY_POTTER_IN_THE_BASKET_XPATH));
    }

    @Test
    @DisplayName("проверка открытия ссылки 'Оплата и доставка'")
    public void test3() {

        HomePage homePage = new HomePage();
        homePage
                .clickButtonAcceptAllCookies()
                .clickPaymentAndDeliveryLink();

        Assertions.assertEquals(HomePageMessage.PAYMENT_AND_DELIVERY_TEXT, homePage.getTextPaymentAndDelivery());
    }

    @Test
    @DisplayName("поиск книги 'Голодные игры', добавление книги в корзину, " +
            "проверка, что книга добавилась в корзину")
    public void test4() {

        BasketStep step = new BasketStep();
        step.addBookIntoBasket(Books.THE_HUNGER_GAMES, HomePageXpath.BOOK_THE_HUNGER_GAMES_XPATH,
                HomePageXpath.BUTTON_ADD_BOOK_THE_HUNGER_GAMES_INTO_BASKET_XPATH);

        HomePage homePage = new HomePage();
        Assertions.assertEquals(HomePageMessage.THE_TITLE_THE_HUNGER_GAMES,
                homePage.getTextBookInTheBasket(HomePageXpath.BOOK_THE_HUNGER_GAMES_IN_THE_BASKET_XPATH));
    }

    @Test
    @DisplayName("поиск книги 'Голодные игры', добавление книги в корзину, " +
            "проверка, что книга добавилась в корзину")
    public void test5() {

        BasketStep step = new BasketStep();
        step.addBookIntoBasket(Books.THE_HUNGER_GAMES, HomePageXpath.BOOK_THE_HUNGER_GAMES_XPATH,
                HomePageXpath.BUTTON_ADD_BOOK_THE_HUNGER_GAMES_INTO_BASKET_XPATH);

        HomePage homePage = new HomePage();
        Assertions.assertEquals(HomePageMessage.THE_TITLE_THE_HUNGER_GAMES,
                homePage.getTextBookInTheBasket(HomePageXpath.BOOK_THE_HUNGER_GAMES_IN_THE_BASKET_XPATH));
    }
}
