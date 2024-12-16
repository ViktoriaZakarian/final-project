package by.mybooks.ui;

import by.mybooks.ui.homepage.HomePage;
import by.mybooks.ui.homepage.HomePageMessage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class HomePageTest extends BaseTest {

    private static final Logger logger = LogManager.getLogger();

    @Test
    @DisplayName("проверка открытия ссылки 'Адрес магазина' и наличия на странице контакных данных")
    public void testOpenAddressOfTheShopLink() {

        logger.info("НАЧАЛО - Тест testOpenAddressOfTheShopLink() " +
                "проверка открытия ссылки 'Адрес магазина' и наличия на странице контакных данных");

        HomePage homePage = new HomePage();
        homePage
                .clickButtonAcceptAllCookies()
                .clickAddressOfTheShopLink();

        Assertions.assertEquals(HomePageMessage.ADDRESS_OF_THE_SHOP_TEXT, homePage.getTextAddressOfTheShop());

        logger.info("КОНЕЦ - Тест testOpenAddressOfTheShopLink() " +
                "проверка открытия ссылки 'Адрес магазина' и наличия на странице контакных данных");
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
    public void testOpenFictionLink() {

        logger.info("НАЧАЛО - Тест testOpenFictionLink() проверка открытия ссылки 'Художественная литература'");

        HomePage homePage = new HomePage();
        homePage
                .clickButtonAcceptAllCookies()
                .clickFictionLink();

        Assertions.assertEquals(HomePageMessage.FICTION_TEXT, homePage.getTextFiction());

        logger.info("КОНЕЦ - Тест testOpenFictionLink() проверка открытия ссылки 'Художественная литература'");
    }

    @Test
    @DisplayName("проверка открытия ссылки 'Новый год'")
    public void testOpenNewYearLink() {

        logger.info("НАЧАЛО - Тест testOpenNewYearLink() проверка открытия ссылки 'Новый год'");

        HomePage homePage = new HomePage();
        homePage
                .clickButtonAcceptAllCookies()
                .clickNewYearLink();

        Assertions.assertEquals(HomePageMessage.NEW_YEAR_TEXT, homePage.getTextNewYear());

        logger.info("КОНЕЦ - Тест testOpenNewYearLink() проверка открытия ссылки 'Новый год'");
    }

    @Test
    @DisplayName("проверка открытия ссылки 'Бестселлеры'")
    public void testOpenBestsellersLink() {

        logger.info("НАЧАЛО - Тест testOpenBestsellersLink() проверка открытия ссылки 'Бестселлеры'");

        HomePage homePage = new HomePage();
        homePage
                .clickButtonAcceptAllCookies()
                .clickButtonNext()
                .clickBestsellersLink();

        Assertions.assertEquals(HomePageMessage.BESTSELLERS_TEXT, homePage.getTextBestsellers());

        logger.info("КОНЕЦ - Тест testOpenBestsellersLink() проверка открытия ссылки 'Бестселлеры'");
    }

    @Test
    @DisplayName("проверка открытия ссылки 'Компьютерная литература'")
    public void testOpenComputerLiteratureLink() {

        logger.info("НАЧАЛО - Тест testOpenComputerLiteratureLink() проверка открытия ссылки 'Компьютерная литература'");

        HomePage homePage = new HomePage();
        homePage
                .clickButtonAcceptAllCookies()
                .clickButtonNext()
                .clickButtonNext()
                .clickComputerLiteratureLink();

        Assertions.assertEquals(HomePageMessage.COMPUTER_LITERATURE_TEXT, homePage.getTextComputerLiterature());

        logger.info("КОНЕЦ - Тест testOpenComputerLiteratureLink() проверка открытия ссылки 'Компьютерная литература'");
    }

    @Test
    @DisplayName("проверка открытия ссылки 'Медицинская литература'")
    public void testOpenMedicalLiteratureLink() {

        logger.info("НАЧАЛО - Тест testOpenMedicalLiteratureLink() проверка открытия ссылки 'Медицинская литература'");

        HomePage homePage = new HomePage();
        homePage
                .clickButtonAcceptAllCookies()
                .clickButtonNext()
                .clickButtonNext()
                .clickButtonNext()
                .clickMedicalLiteratureLink();

        Assertions.assertEquals(HomePageMessage.MEDICAL_LITERATURE_TEXT, homePage.getTextMedicalLiterature());

        logger.info("КОНЕЦ - Тест testOpenMedicalLiteratureLink() проверка открытия ссылки 'Медицинская литература'");
    }
}
