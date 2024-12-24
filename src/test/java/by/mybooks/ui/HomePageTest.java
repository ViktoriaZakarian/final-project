package by.mybooks.ui;

import by.mybooks.ui.homepage.HomePage;
import by.mybooks.ui.homepage.HomePageMessage;
import by.mybooks.ui.homepage.HomePageXpath;
import by.mybooks.ui.steps.CatalogStep;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomePageTest extends BaseTest {

    private static final Logger logger = LogManager.getLogger();
    private HomePage homePage;
    private CatalogStep step;

    @BeforeEach
    void setUpHomePage() {
        homePage = new HomePage();
        step = new CatalogStep();
    }

    static Stream<Arguments> provideFirstCatalogSectionLinks() {
        return Stream.of(
                Arguments.of("В наличии", HomePageXpath.IN_STOCK_LINK_XPATH, HomePageMessage.IN_STOCK_TEXT),
                Arguments.of("Новый год", HomePageXpath.NEW_YEAR_LINK_XPATH, HomePageMessage.NEW_YEAR_TEXT),
                Arguments.of("Новинки", HomePageXpath.NEW_PRODUCTS_LINK_XPATH, HomePageMessage.NEW_PRODUCTS_TEXT),
                Arguments.of("Книги для детей", HomePageXpath.BOOKS_FOR_CHILDREN_LINK_XPATH,
                        HomePageMessage.BOOKS_FOR_CHILDREN_TEXT),
                Arguments.of("Художественная литература", HomePageXpath.FICTION_LINK_XPATH,
                        HomePageMessage.FICTION_TEXT),
                Arguments.of("Эзотерика", HomePageXpath.ESOTERICISM_LINK_XPATH, HomePageMessage.ESOTERICISM_TEXT),
                Arguments.of("Психология", HomePageXpath.PSYCHOLOGY_LINK_XPATH, HomePageMessage.PSYCHOLOGY_TEXT)
        );
    }

    @ParameterizedTest
    @MethodSource("provideFirstCatalogSectionLinks")
    @DisplayName("Проверка открытия ссылок в каталоге")
    void testFirstCatalogSectionLinks(String testName, String linkXpath, String expectedText) {
        logger.info("НАЧАЛО - Тест проверки открытия ссылки на первой странице каталога '{}'", testName);

        step.goToCatalogSectionLink(linkXpath);

        assertEquals(expectedText, homePage.getTextOfTheCatalogSectionTitle());

        logger.info("КОНЕЦ - Тест проверки открытия ссылки на первой странице каталога'{}'", testName);
    }

    static Stream<Arguments> provideSecondCatalogSectionLinks() {
        return Stream.of(
                Arguments.of("Философия. Социология", HomePageXpath.PHILOSOPHY_SOCIOLOGY_LINK_XPATH,
                        HomePageMessage.PHILOSOPHY_SOCIOLOGY_TEXT),
                Arguments.of("Бестселлеры", HomePageXpath.BESTSELLERS_LINK_XPATH, HomePageMessage.BESTSELLERS_TEXT),
                Arguments.of("Уценка", HomePageXpath.MARKDOWN_LINK_XPATH, HomePageMessage.MARKDOWN_TEXT),
                Arguments.of("История", HomePageXpath.HISTORY_LINK_XPATH, HomePageMessage.HISTORY_TEXT),
                Arguments.arguments("УРСС наука, образование, юриспруденция", HomePageXpath.URSS_SCIENCE_EDUCATION_JURISPRUDENCE_LINK_XPATH,
                        HomePageMessage.URSS_SCIENCE_EDUCATION_JURISPRUDENCE_TEXT)
        );
    }

    @ParameterizedTest
    @MethodSource("provideSecondCatalogSectionLinks")
    @DisplayName("Проверка открытия ссылок в каталоге")
    void testSecondCatalogSectionLinks(String testName, String linkXpath, String expectedText) {
        logger.info("НАЧАЛО - Тест проверки открытия ссылки на второй странице каталога '{}'", testName);

        step.goToTheSecondPageOfTheCatalog(linkXpath);

        assertEquals(expectedText, homePage.getTextOfTheCatalogSectionTitle());

        logger.info("КОНЕЦ - Тест проверки открытия ссылки на второй странице каталога '{}'", testName);
    }

    static Stream<Arguments> provideThirdCatalogSectionLinks() {
        return Stream.of(
                Arguments.of("Деловая литература", HomePageXpath.BUSINESS_LITERATURE_LINK_XPATH,
                        HomePageMessage.BUSINESS_LITERATURE_TEXT),
                Arguments.of("Детям и родителям", HomePageXpath.FOR_CHILDREN_AND_PARENTS_LINK_XPATH,
                        HomePageMessage.FOR_CHILDREN_AND_PARENTS_TEXT),
                Arguments.of("Учебная литература", HomePageXpath.EDUCATIONAL_LITERATURE_LINK_XPATH,
                        HomePageMessage.EDUCATIONAL_LITERATURE_TEXT),
                Arguments.of("Искусство. Культура", HomePageXpath.ART_CULTURE_LINK_XPATH,
                        HomePageMessage.ART_CULTURE_TEXT),
                Arguments.of("Компьютерная литература", HomePageXpath.COMPUTER_LITERATURE_LINK_XPATH,
                        HomePageMessage.COMPUTER_LITERATURE_TEXT)
        );
    }

    @ParameterizedTest
    @MethodSource("provideThirdCatalogSectionLinks")
    @DisplayName("Проверка открытия ссылок в каталоге")
    void testThirdCatalogSectionLinks(String testName, String linkXpath, String expectedText) {
        logger.info("НАЧАЛО - Тест проверки открытия ссылки на третьей странице каталога '{}'", testName);

        step.goToTheThirdPageOfTheCatalog(linkXpath);

        assertEquals(expectedText, homePage.getTextOfTheCatalogSectionTitle());

        logger.info("КОНЕЦ - Тест проверки открытия ссылки на третьей странице каталога '{}'", testName);
    }

    static Stream<Arguments> provideFourthCatalogSectionLinks() {
        return Stream.of(
                Arguments.of("Медицинская литература", HomePageXpath.MEDICAL_LITERATURE_LINK_XPATH,
                        HomePageMessage.MEDICAL_LITERATURE_TEXT),
                Arguments.of("Нехудожественная литература", HomePageXpath.NONFICTION_LINK_XPATH,
                        HomePageMessage.NONFICTION_TEXT),
                Arguments.of("Гуманитарные издательства", HomePageXpath.HUMANITIES_PUBLISHING_HOUSES_LINK_XPATH,
                        HomePageMessage.HUMANITIES_PUBLISHING_HOUSES_TEXT),
                Arguments.of("Прочие товарыа", HomePageXpath.OTHER_PRODUCTS_LINK_XPATH,
                        HomePageMessage.OTHER_PRODUCTS_TEXT)
        );
    }

    @ParameterizedTest
    @MethodSource("provideFourthCatalogSectionLinks")
    @DisplayName("Проверка открытия ссылок в каталоге")
    void testFourthCatalogSectionLinks(String testName, String linkXpath, String expectedText) {
        logger.info("НАЧАЛО - Тест проверки открытия ссылки на четвертой странице каталога '{}'", testName);

        step.goToTheFourthPageOfTheCatalog(linkXpath);

        assertEquals(expectedText, homePage.getTextOfTheCatalogSectionTitle());

        logger.info("КОНЕЦ - Тест проверки открытия ссылки на четвертой странице каталога '{}'", testName);
    }

    static Stream<Arguments> provideFifthCatalogSectionLinks() {
        return Stream.of(
                Arguments.of("Домашний круг", HomePageXpath.HOME_CIRCLE_LINK_XPATH, HomePageMessage.HOME_CIRCLE_TEXT),
                Arguments.of("Манн, Иванов И Фербер", HomePageXpath.MANN_IVANOV_FERBER_LINK_XPATH,
                        HomePageMessage.MANN_IVANOV_FERBER_TEXT)
        );
    }

    @ParameterizedTest
    @MethodSource("provideFifthCatalogSectionLinks")
    @DisplayName("Проверка открытия ссылок на пятой странице каталога")
    void testFifthCatalogSectionLinks(String testName, String linkXpath, String expectedText) {
        logger.info("НАЧАЛО - Тест проверки открытия ссылки на пятой странице каталога '{}'", testName);

        step.goToTheFifthPageOfTheCatalog(linkXpath);

        assertEquals(expectedText, homePage.getTextOfTheCatalogSectionTitle());

        logger.info("КОНЕЦ - Тест проверки открытия ссылки на пятой странице каталога '{}'", testName);
    }

    @Test
    @DisplayName("проверка открытия ссылки 'Адрес магазина' и наличия на странице контакных данных")
    public void testOpenAddressOfTheShopLink() {

        logger.info("НАЧАЛО - Тест testOpenAddressOfTheShopLink() " +
                "проверка открытия ссылки 'Адрес магазина' и наличия на странице контакных данных");

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

        homePage
                .clickButtonAcceptAllCookies()
                .clickPaymentAndDeliveryLink();

        Assertions.assertEquals(HomePageMessage.PAYMENT_AND_DELIVERY_TEXT, homePage.getTextPaymentAndDelivery());

        logger.info("КОНЕЦ - testOpenPaymentAndDeliveryLink() проверка открытия ссылки 'Оплата и доставка'");
    }
}
