package by.mybooks.ui;

import by.mybooks.ui.homepage.HomePage;
import by.mybooks.ui.homepage.HomePageMessage;
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
    @DisplayName("проверка открытия ссылки 'Оплата и доставка'")
    public void test2() {

        HomePage homePage = new HomePage();
        homePage
                .clickButtonAcceptAllCookies()
                .clickPaymentAndDeliveryLink();

        Assertions.assertEquals(HomePageMessage.PAYMENT_AND_DELIVERY_TEXT, homePage.getTextPaymentAndDelivery());
    }
}
