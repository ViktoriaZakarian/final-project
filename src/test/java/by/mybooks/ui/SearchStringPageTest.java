package by.mybooks.ui;

import by.mybooks.ui.homepage.HomePageXpath;
import by.mybooks.ui.searchstring.SearchStringMessage;
import by.mybooks.ui.searchstring.SearchStringPage;
import by.mybooks.ui.searchstring.SearchStringXpath;
import by.mybooks.ui.steps.BasketStep;
import by.mybooks.util.Books;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SearchStringPageTest extends BaseTest {

    private static final Logger logger = LogManager.getLogger();

    @Test
    @DisplayName("поиск книги 'Гарри Поттер и философский камень', добавление книги в корзину, " +
            "проверка, что книга добавилась в корзину")
    public void testAddBookHarryPotterIntoBasket() {

        logger.info("НАЧАЛО - testAddBookHarryPotterIntoBasket() поиск книги 'Гарри Поттер и философский камень', " +
                "добавление книги в корзину, проверка, что книга добавилась в корзину");

        BasketStep step = new BasketStep();
        step.addBookIntoBasket(Books.HARRY_POTTER, SearchStringXpath.BOOK_HARRY_POTTER_XPATH,
                SearchStringXpath.BUTTON_ADD_BOOK_HARRY_POTTER_INTO_BASKET_XPATH);

        SearchStringPage searchStringPage = new SearchStringPage();
        Assertions.assertEquals(SearchStringMessage.THE_TITLE_HARRY_POTTER,
                searchStringPage.getTextBookInTheBasket(SearchStringXpath.BOOK_HARRY_POTTER_IN_THE_BASKET_XPATH));

        logger.info("КОНЕЦ - testAddBookHarryPotterIntoBasket() поиск книги 'Гарри Поттер и философский камень', " +
                "добавление книги в корзину, проверка, что книга добавилась в корзину");
    }

    @Test
    @DisplayName("поиск книги 'Голодные игры', добавление книги в корзину, " +
            "проверка, что книга добавилась в корзину")
    public void testAddBookTheHungerGamesIntoBasket() {

        logger.info("НАЧАЛО - testAddBookTheHungerGamesIntoBasket() поиск книги 'Голодные игры', " +
                "добавление книги в корзину, проверка, что книга добавилась в корзину");

        BasketStep step = new BasketStep();
        step.addBookIntoBasket(Books.THE_HUNGER_GAMES, SearchStringXpath.BOOK_THE_HUNGER_GAMES_XPATH,
                SearchStringXpath.BUTTON_ADD_BOOK_THE_HUNGER_GAMES_INTO_BASKET_XPATH);

        SearchStringPage searchStringPage = new SearchStringPage();
        Assertions.assertEquals(SearchStringMessage.THE_TITLE_THE_HUNGER_GAMES,
                searchStringPage.getTextBookInTheBasket(SearchStringXpath.BOOK_THE_HUNGER_GAMES_IN_THE_BASKET_XPATH));

        logger.info("КОНЕЦ - testAddBookTheHungerGamesIntoBasket() поиск книги 'Голодные игры', " +
                "добавление книги в корзину, проверка, что книга добавилась в корзину");
    }

    @Test
    @DisplayName("поиск книги 'Бегущий в лабиринте', добавление книги в корзину, " +
            "проверка, что книга добавилась в корзину")
    public void testAddBookTheMazeRunner() {

        logger.info("НАЧАЛО - testAddBookTheMazeRunner() поиск книги 'Бегущий в лабиринте', " +
                "добавление книги в корзину, проверка, что книга добавилась в корзин");

        BasketStep step = new BasketStep();
        step.addBookIntoBasket(Books.THE_MAZE_RUNNER, SearchStringXpath.BOOK_THE_MAZE_RUNNER_XPATH,
                SearchStringXpath.BUTTON_ADD_BOOK_THE_MAZE_RUNNER_INTO_BASKET_XPATH);

        SearchStringPage searchStringPage = new SearchStringPage();
        Assertions.assertEquals(SearchStringMessage.THE_TITLE_THE_MAZE_RUNNER,
                searchStringPage.getTextBookInTheBasket(SearchStringXpath.BOOK_THE_MAZE_RUNNER_IN_THE_BASKET_XPATH));

        logger.info("КОНЕЦ - testAddBookTheMazeRunner() поиск книги 'Бегущий в лабиринте', " +
                "добавление книги в корзину, проверка, что книга добавилась в корзину");
    }

    @Test
    @DisplayName("поиск книги 'Убийство в Восточном Экспрессе', добавление книги в корзину, увеличение количества = 2" +
            "проверка, что 2 книги добавились в корзину")
    public void testAddBookMurderOnTheOrientExpress() {

        logger.info("НАЧАЛО - testAddBookMurderOnTheOrientExpress() поиск книги 'Убийство в Восточном Экспрессе', " +
                "добавление книги в корзину, увеличение количества = 2, проверка, что 2 книги добавились в корзину");

        BasketStep step = new BasketStep();
        step.addBookIntoBasket(Books.MURDER_ON_THE_ORIENT_EXPRESS, SearchStringXpath.BOOK_MURDER_ON_THE_ORIENT_EXPRESS_XPATH,
                SearchStringXpath.BUTTON_ADD_BOOK_MURDER_ON_THE_ORIENT_EXPRESS_INTO_BASKET_XPATH);

        SearchStringPage searchStringPage = new SearchStringPage();
        searchStringPage.clickButtonAddTheSameExtraBook();

        Assertions.assertEquals(SearchStringMessage.THE_TITLE_MURDER_ON_THE_ORIENT_EXPRESS,
                searchStringPage.getTextBookInTheBasket(SearchStringXpath.BOOK_MURDER_ON_THE_ORIENT_EXPRESS_IN_THE_BASKET_XPATH));
        Assertions.assertEquals(SearchStringMessage.THE_AMOUNT_OF_BOOKS_2,
                searchStringPage.getAmountOfBooksInTheBasket(SearchStringXpath.THE_AMOUNT_OF_BOOKS_IN_THE_BASKET_XPATH));

        logger.info("КОНЕЦ - testAddBookMurderOnTheOrientExpress() поиск книги 'Убийство в Восточном Экспрессе', " +
                "добавление книги в корзину, увеличение количества = 2, проверка, что 2 книги добавились в корзину");
    }

    @Test
    @DisplayName("переход по ссылке 'Смысл' в разделе 'Психология', добавление книги 'Диагностика апатии' в корзину, " +
            "проверка, что книга добавилась в корзину")
    public void testAddBookDiagnosisOfApathy() {

        logger.info("НАЧАЛО - testAddBookDiagnosisOfApathy() переход по ссылке 'Смысл' в разделе 'Психология', " +
                "добавление книги 'Диагностика апатии' в корзину, проверка, что книга добавилась в корзину");

        BasketStep step = new BasketStep();
        step.addBookIntoBasketFromTheFirstPageOfCatalog(HomePageXpath.PSYCHOLOGY_LINK_XPATH, SearchStringXpath.SENSE_LINK_XPATH,
                SearchStringXpath.BOOK_DIAGNOSIS_OF_APATHY_XPATH, SearchStringXpath.BUTTON_ADD_BOOK_DIAGNOSIS_OF_APATHY_INTO_BASKET_XPATH);

        SearchStringPage searchStringPage = new SearchStringPage();

        Assertions.assertEquals(SearchStringMessage.THE_TITLE_DIAGNOSIS_OF_APATHY,
                searchStringPage.getTextBookInTheBasket(SearchStringXpath.BOOK_DIAGNOSIS_OF_APATHY_IN_THE_BASKET_XPATH));

        logger.info("КОНЕЦ - testAddBookDiagnosisOfApathy() переход по ссылке 'Смысл' в разделе 'Психология', " +
                "добавление книги 'Диагностика апатии' в корзину, проверка, что книга добавилась в корзину");
    }

    @Test
    @DisplayName("переход по ссылке 'Традиция' в разделе 'История', добавление книги 'Круги на незримой воде' в корзину, " +
            "проверка, что книга добавилась в корзину")
    public void testAddBookCirclesOnInvisibleWater() {

        logger.info("НАЧАЛО - testAddBookCirclesOnInvisibleWater() переход по ссылке 'Традиция' в разделе 'История', " +
                "добавление книги 'Круги на незримой воде' в корзину, проверка, что книга добавилась в корзину");

        BasketStep step = new BasketStep();
        step.addBookIntoBasketFromTheSecondPageOfCatalog(HomePageXpath.HISTORY_LINK_XPATH, SearchStringXpath.TRADITION_LINK_XPATH,
                SearchStringXpath.BOOK_CIRCLES_ON_INVISIBLE_WATER_XPATH, SearchStringXpath.BUTTON_ADD_BOOK_CIRCLES_ON_INVISIBLE_WATER_INTO_BASKET_XPATH);

        SearchStringPage searchStringPage = new SearchStringPage();

        Assertions.assertEquals(SearchStringMessage.THE_TITLE_CIRCLES_ON_INVISIBLE_WATER,
                searchStringPage.getTextBookInTheBasket(SearchStringXpath.BOOK_CIRCLES_ON_INVISIBLE_WATER_IN_THE_BASKET_XPATH));

        logger.info("КОНЕЦ - testAddBookCirclesOnInvisibleWater() переход по ссылке 'Традиция' в разделе 'История', " +
                "добавление книги 'Круги на незримой воде' в корзину, проверка, что книга добавилась в корзину");
    }

    @Test
    @DisplayName("переход по ссылке 'Книги для родителей' в разделе 'Детям и родителям', добавление книги " +
            "'Французские дети не капризничают' в корзину, проверка, что книга добавилась в корзину")
    public void testAddBookFrenchChildrenAreNotNaughty() {

        logger.info("НАЧАЛО - testAddBookFrenchChildrenAreNotNaughty() переход по ссылке 'Книги для родителей' в разделе " +
                "'Детям и родителям', добавление книги 'Французские дети не капризничают' в корзину, проверка, что книга добавилась в корзину");

        BasketStep step = new BasketStep();
        step.addBookIntoBasketFromTheThirdPageOfCatalog(HomePageXpath.FOR_CHILDREN_AND_PARENTS,
                SearchStringXpath.BOOKS_FOR_PARENTS_LINK_XPATH, SearchStringXpath.BOOK_FRENCH_CHILDREN_ARE_NOT_NAUGHTY_XPATH,
                SearchStringXpath.BUTTON_ADD_BOOK_FRENCH_CHILDREN_ARE_NOT_NAUGHTY_INTO_BASKET_XPATH);

        SearchStringPage searchStringPage = new SearchStringPage();

        Assertions.assertEquals(SearchStringMessage.THE_TITLE_FRENCH_CHILDREN_ARE_NOT_NAUGHTY,
                searchStringPage.getTextBookInTheBasket(SearchStringXpath.BOOK_FRENCH_CHILDREN_ARE_NOT_NAUGHTY_IN_THE_BASKET_XPATH));

        logger.info("КОНЕЦ - testAddBookFrenchChildrenAreNotNaughty() переход по ссылке 'Книги для родителей' в разделе " +
                "'Детям и родителям', добавление книги 'Французские дети не капризничают' в корзину, проверка, что книга добавилась в корзину");
    }

    @Test
    @DisplayName("переход по ссылке 'Лабиринт' в разделе 'Гуманитарные издания', добавление книги " +
            "'Жестокий Принц' в корзину, проверка, что книга добавилась в корзину")
    public void testAddBookCruelPrince() {

        logger.info("НАЧАЛО - testAddBookCruelPrince() переход по ссылке 'Лабиринт' в разделе 'Гуманитарные издания', " +
                "добавление книги 'Жестокий Принц' в корзину, проверка, что книга добавилась в корзину");

        BasketStep step = new BasketStep();
        step.addBookIntoBasketFromTheFourthPageOfCatalog(HomePageXpath.HUMANITIES_PUBLISHING_HOUSES_XPATH,
                SearchStringXpath.MAZE_LINK_XPATH, SearchStringXpath.BOOK_CRUEL_PRINCE_XPATH,
                SearchStringXpath.BUTTON_ADD_BOOK_CRUEL_PRINCE_INTO_BASKET_XPATH);

        SearchStringPage searchStringPage = new SearchStringPage();

        Assertions.assertEquals(SearchStringMessage.THE_TITLE_CRUEL_PRINCE,
                searchStringPage.getTextBookInTheBasket(SearchStringXpath.BOOK_CRUEL_PRINCE_IN_THE_BASKET_XPATH));

        logger.info("НАЧАЛО - testAddBookCruelPrince() переход по ссылке 'Лабиринт' в разделе 'Гуманитарные издания', " +
                "добавление книги 'Жестокий Принц' в корзину, проверка, что книга добавилась в корзину");
    }
}
