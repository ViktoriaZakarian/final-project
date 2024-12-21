package by.mybooks.ui;

import by.mybooks.ui.homepage.HomePage;
import by.mybooks.ui.homepage.HomePageMessage;
import by.mybooks.ui.homepage.HomePageXpath;
import by.mybooks.ui.steps.CatalogStep;
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
    @DisplayName("проверка открытия ссылки 'Книги для детей'")
    public void testOpenBooksForChildrenLink() {

        logger.info("НАЧАЛО - Тест testOpenBooksForChildrenLink() проверка открытия ссылки 'Книги для детей'");

        CatalogStep step = new CatalogStep();
        step.goToCatalogSectionLink(HomePageXpath.BOOKS_FOR_CHILDREN_LINK_XPATH);
        HomePage homePage = new HomePage();

        Assertions.assertEquals(HomePageMessage.BOOKS_FOR_CHILDREN_TEXT, homePage.getTextOfTheCatalogSectionTitle());

        logger.info("КОНЕЦ - Тест testOpenBooksForChildrenLink() проверка открытия ссылки 'Книги для детей'");
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
    @DisplayName("проверка открытия ссылки 'Эзотерика'")
    public void testOpenEsotericismLink() {

        logger.info("НАЧАЛО - Тест testOpenEsotericismLink() проверка открытия ссылки 'Эзотерика'");

        CatalogStep step = new CatalogStep();
        step.goToCatalogSectionLink(HomePageXpath.ESOTERICISM_LINK_XPATH);
        HomePage homePage = new HomePage();

        Assertions.assertEquals(HomePageMessage.ESOTERICISM_TEXT, homePage.getTextOfTheCatalogSectionTitle());

        logger.info("КОНЕЦ - Тест testOpenEsotericismLink() проверка открытия ссылки 'Эзотерика'");
    }

    @Test
    @DisplayName("проверка открытия ссылки 'Психология'")
    public void testOpenPsychologyLink() {

        logger.info("НАЧАЛО - Тест testOpenPsychologyLink() проверка открытия ссылки 'Психология'");

        CatalogStep step = new CatalogStep();
        step.goToCatalogSectionLink(HomePageXpath.PSYCHOLOGY_LINK_XPATH);
        HomePage homePage = new HomePage();

        Assertions.assertEquals(HomePageMessage.PSYCHOLOGY_TEXT, homePage.getTextOfTheCatalogSectionTitle());

        logger.info("КОНЕЦ - Тест testOpenPsychologyLink() проверка открытия ссылки 'Психология'");
    }

    @Test
    @DisplayName("проверка открытия ссылки 'Философия. Социология'")
    public void testOpenPhilosophySociologyLink() {

        logger.info("НАЧАЛО - Тест testOpenPhilosophySociologyLink() проверка открытия ссылки 'Философия. Социология'");

        CatalogStep step = new CatalogStep();
        step.goToTheSecondPageOfTheCatalog();
        HomePage homePage = new HomePage();
        homePage.clickCatalogSectionLink(HomePageXpath.PHILOSOPHY_SOCIOLOGY_LINK_XPATH);

        Assertions.assertEquals(HomePageMessage.PHILOSOPHY_SOCIOLOGY_TEXT, homePage.getTextOfTheCatalogSectionTitle());

        logger.info("КОНЕЦ - Тест testOpenPhilosophySociologyLink() проверка открытия ссылки 'Философия. Социология'");
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
    @DisplayName("проверка открытия ссылки 'Уценка'")
    public void testOpenMarkdownLink() {

        logger.info("НАЧАЛО - Тест testOpenMarkdownLink() проверка открытия ссылки 'Уценка'");

        CatalogStep step = new CatalogStep();
        step.goToTheSecondPageOfTheCatalog();
        HomePage homePage = new HomePage();
        homePage.clickCatalogSectionLink(HomePageXpath.MARKDOWN_LINK_XPATH);

        Assertions.assertEquals(HomePageMessage.MARKDOWN_TEXT, homePage.getTextOfTheCatalogSectionTitle());

        logger.info("КОНЕЦ - Тест testOpenMarkdownLink() проверка открытия ссылки 'Уценка'");
    }

    @Test
    @DisplayName("проверка открытия ссылки 'История'")
    public void testOpenHistoryLink() {

        logger.info("НАЧАЛО - Тест testOpenHistoryLink() проверка открытия ссылки 'История'");

        CatalogStep step = new CatalogStep();
        step.goToTheSecondPageOfTheCatalog();
        HomePage homePage = new HomePage();
        homePage.clickCatalogSectionLink(HomePageXpath.HISTORY_LINK_XPATH);

        Assertions.assertEquals(HomePageMessage.HISTORY_TEXT, homePage.getTextOfTheCatalogSectionTitle());

        logger.info("КОНЕЦ - Тест testOpenHistoryLink() проверка открытия ссылки 'История'");
    }

    @Test
    @DisplayName("проверка открытия ссылки 'УРСС наука, образование, юриспруденция'")
    public void testOpenURSSScienceEducationJurisprudenceLink() {

        logger.info("НАЧАЛО - Тест testOpenURSSScienceEducationJurisprudenceLink() проверка открытия ссылки 'УРСС наука, образование, юриспруденция'");

        CatalogStep step = new CatalogStep();
        step.goToTheSecondPageOfTheCatalog();
        HomePage homePage = new HomePage();
        homePage.clickCatalogSectionLink(HomePageXpath.URSS_SCIENCE_EDUCATION_JURISPRUDENCE_LINK_XPATH);

        Assertions.assertEquals(HomePageMessage.URSS_SCIENCE_EDUCATION_JURISPRUDENCE_TEXT, homePage.getTextOfTheCatalogSectionTitle());

        logger.info("КОНЕЦ - Тест testOpenURSSScienceEducationJurisprudenceLink() проверка открытия ссылки 'УРСС наука, образование, юриспруденция'");
    }

    @Test
    @DisplayName("проверка открытия ссылки 'Деловая литература'")
    public void testOpenBusinessLiteratureLink() {

        logger.info("НАЧАЛО - Тест testOpenBusinessLiteratureLink() проверка открытия ссылки 'Деловая литература'");

        CatalogStep step = new CatalogStep();
        step.goToTheThirdPageOfTheCatalog();
        HomePage homePage = new HomePage();
        homePage.clickCatalogSectionLink(HomePageXpath.BUSINESS_LITERATURE_LINK_XPATH);

        Assertions.assertEquals(HomePageMessage.BUSINESS_LITERATURE_TEXT, homePage.getTextOfTheCatalogSectionTitle());

        logger.info("КОНЕЦ - Тест testOpenBusinessLiteratureLink() проверка открытия ссылки 'Деловая литература'");
    }

    @Test
    @DisplayName("проверка открытия ссылки 'Детям и родителям'")
    public void testOpenForChildrenAndParentsLink() {

        logger.info("НАЧАЛО - Тест testOpenForChildrenAndParentsLink() проверка открытия ссылки 'Детям и родителям'");

        CatalogStep step = new CatalogStep();
        step.goToTheThirdPageOfTheCatalog();
        HomePage homePage = new HomePage();
        homePage.clickCatalogSectionLink(HomePageXpath.FOR_CHILDREN_AND_PARENTS_LINK_XPATH);

        Assertions.assertEquals(HomePageMessage.FOR_CHILDREN_AND_PARENTS_TEXT, homePage.getTextOfTheCatalogSectionTitle());

        logger.info("КОНЕЦ - Тест testOpenForChildrenAndParentsLink() проверка открытия ссылки 'Детям и родителям'");
    }

    @Test
    @DisplayName("проверка открытия ссылки 'Учебная литература'")
    public void testOpenEducationalLiteratureLink() {

        logger.info("НАЧАЛО - Тест testOpenEducationalLiteratureLink() проверка открытия ссылки 'Учебная литература'");

        CatalogStep step = new CatalogStep();
        step.goToTheThirdPageOfTheCatalog();
        HomePage homePage = new HomePage();
        homePage.clickCatalogSectionLink(HomePageXpath.EDUCATIONAL_LITERATURE_LINK_XPATH);

        Assertions.assertEquals(HomePageMessage.EDUCATIONAL_LITERATURE_TEXT, homePage.getTextOfTheCatalogSectionTitle());

        logger.info("КОНЕЦ - Тест testOpenEducationalLiteratureLink() проверка открытия ссылки 'Учебная литература'");
    }

    @Test
    @DisplayName("проверка открытия ссылки 'Искусство. Культура'")
    public void testOpenArtCultureLink() {

        logger.info("НАЧАЛО - Тест testOpenArtCultureLink() проверка открытия ссылки 'Искусство. Культура'");

        CatalogStep step = new CatalogStep();
        step.goToTheThirdPageOfTheCatalog();
        HomePage homePage = new HomePage();
        homePage.clickCatalogSectionLink(HomePageXpath.ART_CULTURE_LINK_XPATH);

        Assertions.assertEquals(HomePageMessage.ART_CULTURE_TEXT, homePage.getTextOfTheCatalogSectionTitle());

        logger.info("КОНЕЦ - Тест testOpenArtCultureLink() проверка открытия ссылки 'Искусство. Культура'");
    }

    @Test
    @DisplayName("проверка открытия ссылки 'Компьютерная литература'")
    public void testOpenComputerLiteratureLink() {

        logger.info("НАЧАЛО - Тест testOpenComputerLiteratureLink() проверка открытия ссылки 'Компьютерная литература'");

        CatalogStep step = new CatalogStep();
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

    @Test
    @DisplayName("проверка открытия ссылки 'Нехудожественная литература'")
    public void testOpenNonfictionLink() {

        logger.info("НАЧАЛО - Тест testOpenNonfictionLink() проверка открытия ссылки 'Нехудожественная литература'");

        CatalogStep step = new CatalogStep();
        step.goToTheFourthPageOfTheCatalog();
        HomePage homePage = new HomePage();
        homePage.clickCatalogSectionLink(HomePageXpath.NONFICTION_LINK_XPATH);

        Assertions.assertEquals(HomePageMessage.NONFICTION_TEXT, homePage.getTextOfTheCatalogSectionTitle());

        logger.info("КОНЕЦ - Тест testOpenNonfictionLink() проверка открытия ссылки 'Нехудожественная литература'");
    }

    @Test
    @DisplayName("проверка открытия ссылки 'Гуманитарные издательства'")
    public void testOpenHumanitiesPublishingHousesLink() {

        logger.info("НАЧАЛО - Тест testOpenHumanitiesPublishingHousesLink() проверка открытия ссылки 'Гуманитарные издательства'");

        CatalogStep step = new CatalogStep();
        step.goToTheFourthPageOfTheCatalog();
        HomePage homePage = new HomePage();
        homePage.clickCatalogSectionLink(HomePageXpath.HUMANITIES_PUBLISHING_HOUSES_LINK_XPATH);

        Assertions.assertEquals(HomePageMessage.HUMANITIES_PUBLISHING_HOUSES_TEXT, homePage.getTextOfTheCatalogSectionTitle());

        logger.info("КОНЕЦ - Тест testOpenHumanitiesPublishingHousesLink() проверка открытия ссылки 'Гуманитарные издательства'");
    }

    @Test
    @DisplayName("проверка открытия ссылки 'Прочие товары'")
    public void testOpenOtherProductsLink() {

        logger.info("НАЧАЛО - Тест testOpenOtherProductsLink() проверка открытия ссылки 'Прочие товары'");

        CatalogStep step = new CatalogStep();
        step.goToTheFourthPageOfTheCatalog();
        HomePage homePage = new HomePage();
        homePage.clickCatalogSectionLink(HomePageXpath.OTHER_PRODUCTS_LINK_XPATH);

        Assertions.assertEquals(HomePageMessage.OTHER_PRODUCTS_TEXT, homePage.getTextOfTheCatalogSectionTitle());

        logger.info("КОНЕЦ - Тест testOpenOtherProductsLink() проверка открытия ссылки 'Прочие товары'");
    }

    @Test
    @DisplayName("проверка открытия ссылки 'Домашний круг'")
    public void testOpenHomeCircleLink() {

        logger.info("НАЧАЛО - Тест testOpenHomeCircleLink() проверка открытия ссылки 'Домашний круг'");

        CatalogStep step = new CatalogStep();
        step.goToTheFifthPageOfTheCatalog();
        HomePage homePage = new HomePage();
        homePage.clickCatalogSectionLink(HomePageXpath.HOME_CIRCLE_LINK_XPATH);

        Assertions.assertEquals(HomePageMessage.HOME_CIRCLE_TEXT, homePage.getTextOfTheCatalogSectionTitle());

        logger.info("КОНЕЦ - Тест testOpenHomeCircleLink() проверка открытия ссылки 'Домашний круг'");
    }

    @Test
    @DisplayName("проверка открытия ссылки 'Манн, Иванов И Фербер'")
    public void testOpenMannIvanovAndFerberLink() {

        logger.info("НАЧАЛО - Тест testOpenMannIvanovAndFerberLink() проверка открытия ссылки 'Манн, Иванов И Фербер'");

        CatalogStep step = new CatalogStep();
        step.goToTheFifthPageOfTheCatalog();
        HomePage homePage = new HomePage();
        homePage.clickCatalogSectionLink(HomePageXpath.MANN_IVANOV_FERBER_LINK_XPATH);

        Assertions.assertEquals(HomePageMessage.MANN_IVANOV_FERBER_TEXT, homePage.getTextOfTheCatalogSectionTitle());

        logger.info("КОНЕЦ - Тест testOpenMannIvanovAndFerberLink() проверка открытия ссылки 'Манн, Иванов И Фербер'");
    }
}
