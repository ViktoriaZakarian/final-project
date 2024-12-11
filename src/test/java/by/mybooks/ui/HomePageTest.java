package by.mybooks.ui;

import by.mybooks.ui.homepage.HomePage;
import by.mybooks.ui.homepage.HomePageMessage;
import by.mybooks.ui.steps.BasketStep;
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

        BasketStep basketStep = new BasketStep();
        basketStep.addBookIntoBasket();

        HomePage homePage  = new HomePage();
        Assertions.assertEquals(HomePageMessage.THE_TITLE_OF_THE_BOOK_IN_THE_BASKET, homePage.getTextBookInTheBasket());
    }
}
