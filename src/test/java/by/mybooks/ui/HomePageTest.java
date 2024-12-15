package by.mybooks.ui;

import by.mybooks.ui.homepage.HomePage;
import by.mybooks.ui.homepage.HomePageMessage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class HomePageTest extends BaseTest {

    @Test
    @DisplayName("проверка открытия ссылки 'Адрес магазина' и наличия на странице контакных данных")
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

    @Test
    @DisplayName("проверка открытия ссылки 'Художественная литература'")
    public void test3() {

        HomePage homePage = new HomePage();
        homePage
                .clickButtonAcceptAllCookies()
                .clickFictionLink();

        Assertions.assertEquals(HomePageMessage.FICTION_TEXT, homePage.getTextFiction());
    }

    @Test
    @DisplayName("проверка открытия ссылки 'Новый год'")
    public void test4() {

        HomePage homePage = new HomePage();
        homePage
                .clickButtonAcceptAllCookies()
                .clickNewYearLink();

        Assertions.assertEquals(HomePageMessage.NEW_YEAR_TEXT, homePage.getTextNewYear());
    }

    @Test
    @DisplayName("проверка открытия ссылки 'Бестселлеры'")
    public void test5() {

        HomePage homePage = new HomePage();
        homePage
                .clickButtonAcceptAllCookies()
                .clickButtonNext()
                .clickBestsellersLink();

        Assertions.assertEquals(HomePageMessage.BESTSELLERS_TEXT, homePage.getTextBestsellers());
    }

    @Test
    @DisplayName("проверка открытия ссылки 'Компьютерная литература'")
    public void test6() {

        HomePage homePage = new HomePage();
        homePage
                .clickButtonAcceptAllCookies()
                .clickButtonNext()
                .clickButtonNext()
                .clickComputerLiteratureLink();

        Assertions.assertEquals(HomePageMessage.COMPUTER_LITERATURE_TEXT, homePage.getTextComputerLiterature());
    }

    @Test
    @DisplayName("проверка открытия ссылки 'Медицинская литература'")
    public void test7() {

        HomePage homePage = new HomePage();
        homePage
                .clickButtonAcceptAllCookies()
                .clickButtonNext()
                .clickButtonNext()
                .clickButtonNext()
                .clickMedicalLiteratureLink();

        Assertions.assertEquals(HomePageMessage.MEDICAL_LITERATURE_TEXT, homePage.getTextMedicalLiterature());
    }
}
