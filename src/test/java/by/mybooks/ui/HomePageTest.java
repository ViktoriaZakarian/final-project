package by.mybooks.ui;

import by.mybooks.ui.homepage.HomePage;
import by.mybooks.ui.homepage.HomePageMessage;
import by.mybooks.ui.homepage.HomePageXpath;
import by.mybooks.ui.steps.CatalogStep;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.checkerframework.checker.units.qual.C;
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
    public void testOpenPaymentAndDeliveryLink() {

        logger.info("НАЧАЛО - testOpenPaymentAndDeliveryLink() проверка открытия ссылки 'Оплата и доставка'");

        HomePage homePage = new HomePage();
        homePage
                .clickButtonAcceptAllCookies()
                .clickPaymentAndDeliveryLink();

        Assertions.assertEquals(HomePageMessage.PAYMENT_AND_DELIVERY_TEXT, homePage.getTextPaymentAndDelivery());

        logger.info("КОНЕЦ - testOpenPaymentAndDeliveryLink() проверка открытия ссылки 'Оплата и доставка'");
    }

    @Test
    @DisplayName("проверка открытия ссылки 'В наличии'")
    public void testOpenInStockLink() {

        logger.info("НАЧАЛО - Тест testOpenInStockLink() проверка открытия ссылки 'В наличии'");

        CatalogStep step = new CatalogStep();
        step.goToCatalogSectionLink(HomePageXpath.IN_STOCK_LINK_XPATH);
        HomePage homePage = new HomePage();

        Assertions.assertEquals(HomePageMessage.IN_STOCK_TEXT, homePage.getTextOfTheCatalogSectionTitle());

        logger.info("КОНЕЦ - Тест testOpenInStockLink() проверка открытия ссылки 'В наличии'");
    }

    @Test
    @DisplayName("проверка открытия ссылки 'Новый год'")
    public void testOpenNewYearLink() {

        logger.info("НАЧАЛО - Тест testOpenNewYearLink() проверка открытия ссылки 'Новый год'");

        CatalogStep step = new CatalogStep();
        step.goToCatalogSectionLink(HomePageXpath.NEW_YEAR_LINK_XPATH);
        HomePage homePage = new HomePage();

        Assertions.assertEquals(HomePageMessage.NEW_YEAR_TEXT, homePage.getTextOfTheCatalogSectionTitle());

        logger.info("КОНЕЦ - Тест testOpenNewYearLink() проверка открытия ссылки 'Новый год'");
    }

    @Test
    @DisplayName("проверка открытия ссылки 'Новый год'")
    public void testOpenNewProductsLink() {

        logger.info("НАЧАЛО - Тест testOpenNewProductsLink() проверка открытия ссылки 'Новинки'");

        CatalogStep step = new CatalogStep();
        step.goToCatalogSectionLink(HomePageXpath.NEW_PRODUCTS_LINK_XPATH);
        HomePage homePage = new HomePage();

        Assertions.assertEquals(HomePageMessage.NEW_PRODUCTS_TEXT, homePage.getTextOfTheCatalogSectionTitle());

        logger.info("КОНЕЦ - Тест testOpenNewProductsLink() проверка открытия ссылки 'Новинки'");
    }

    @Test
    @DisplayName("проверка открытия ссылки 'Художественная литература'")
    public void testOpenFictionLink() {

        logger.info("НАЧАЛО - Тест testOpenFictionLink() проверка открытия ссылки 'Художественная литература'");

        CatalogStep step = new CatalogStep();
        step.goToCatalogSectionLink(HomePageXpath.FICTION_LINK_XPATH);
        HomePage homePage = new HomePage();

        Assertions.assertEquals(HomePageMessage.FICTION_TEXT, homePage.getTextOfTheCatalogSectionTitle());

        logger.info("КОНЕЦ - Тест testOpenFictionLink() проверка открытия ссылки 'Художественная литература'");
    }

    @Test
    @DisplayName("проверка открытия ссылки 'Бестселлеры'")
    public void testOpenBestsellersLink() {

        logger.info("НАЧАЛО - Тест testOpenBestsellersLink() проверка открытия ссылки 'Бестселлеры'");

        CatalogStep step = new CatalogStep();
        step.goToTheSecondPageOfTheCatalog();
        HomePage homePage = new HomePage();
        homePage.clickCatalogSectionLink(HomePageXpath.BESTSELLERS_LINK_XPATH);

        Assertions.assertEquals(HomePageMessage.BESTSELLERS_TEXT, homePage.getTextOfTheCatalogSectionTitle());

        logger.info("КОНЕЦ - Тест testOpenBestsellersLink() проверка открытия ссылки 'Бестселлеры'");
    }

    @Test
    @DisplayName("проверка открытия ссылки 'Компьютерная литература'")
    public void testOpenComputerLiteratureLink() {

        logger.info("НАЧАЛО - Тест testOpenComputerLiteratureLink() проверка открытия ссылки 'Компьютерная литература'");

        CatalogStep step =new CatalogStep();
        step.goToTheThirdPageOfTheCatalog();
        HomePage homePage = new HomePage();
        homePage.clickCatalogSectionLink(HomePageXpath.COMPUTER_LITERATURE_LINK_XPATH);

        Assertions.assertEquals(HomePageMessage.COMPUTER_LITERATURE_TEXT, homePage.getTextOfTheCatalogSectionTitle());

        logger.info("КОНЕЦ - Тест testOpenComputerLiteratureLink() проверка открытия ссылки 'Компьютерная литература'");
    }

    @Test
    @DisplayName("проверка открытия ссылки 'Медицинская литература'")
    public void testOpenMedicalLiteratureLink() {

        logger.info("НАЧАЛО - Тест testOpenMedicalLiteratureLink() проверка открытия ссылки 'Медицинская литература'");

        CatalogStep step = new CatalogStep();
        step.goToTheFourthPageOfTheCatalog();
        HomePage homePage = new HomePage();
        homePage.clickCatalogSectionLink(HomePageXpath.MEDICAL_LITERATURE_LINK_XPATH);

        Assertions.assertEquals(HomePageMessage.MEDICAL_LITERATURE_TEXT, homePage.getTextOfTheCatalogSectionTitle());

        logger.info("КОНЕЦ - Тест testOpenMedicalLiteratureLink() проверка открытия ссылки 'Медицинская литература'");
    }
}
