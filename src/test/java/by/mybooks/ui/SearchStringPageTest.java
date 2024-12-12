package by.mybooks.ui;

import by.mybooks.ui.searchstring.SearchStringMessage;
import by.mybooks.ui.searchstring.SearchStringPage;
import by.mybooks.ui.searchstring.SearchStringXpath;
import by.mybooks.ui.steps.BasketStep;
import by.mybooks.util.Books;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SearchStringPageTest extends BaseTest {

    @Test
    @DisplayName("поиск книги 'Гарри Поттер и философский камень', добавление книги в корзину, " +
            "проверка, что книга добавилась в корзину")
    public void test1() {

        BasketStep step = new BasketStep();
        step.addBookIntoBasket(Books.HARRY_POTTER, SearchStringXpath.BOOK_HARRY_POTTER_XPATH,
                SearchStringXpath.BUTTON_ADD_BOOK_HARRY_POTTER_INTO_BASKET_XPATH);

        SearchStringPage searchStringPage = new SearchStringPage();
        Assertions.assertEquals(SearchStringMessage.THE_TITLE_HARRY_POTTER,
                searchStringPage.getTextBookInTheBasket(SearchStringXpath.BOOK_HARRY_POTTER_IN_THE_BASKET_XPATH));
    }

    @Test
    @DisplayName("поиск книги 'Голодные игры', добавление книги в корзину, " +
            "проверка, что книга добавилась в корзину")
    public void test2() {

        BasketStep step = new BasketStep();
        step.addBookIntoBasket(Books.THE_HUNGER_GAMES, SearchStringXpath.BOOK_THE_HUNGER_GAMES_XPATH,
                SearchStringXpath.BUTTON_ADD_BOOK_THE_HUNGER_GAMES_INTO_BASKET_XPATH);

        SearchStringPage searchStringPage = new SearchStringPage();
        Assertions.assertEquals(SearchStringMessage.THE_TITLE_THE_HUNGER_GAMES,
                searchStringPage.getTextBookInTheBasket(SearchStringXpath.BOOK_THE_HUNGER_GAMES_IN_THE_BASKET_XPATH));
    }

    @Test
    @DisplayName("поиск книги 'Бегущий в лабиринте', добавление книги в корзину, " +
            "проверка, что книга добавилась в корзину")
    public void test3() {

        BasketStep step = new BasketStep();
        step.addBookIntoBasket(Books.THE_MAZE_RUNNER, SearchStringXpath.BOOK_THE_MAZE_RUNNER_XPATH,
                SearchStringXpath.BUTTON_ADD_BOOK_THE_MAZE_RUNNER_INTO_BASKET_XPATH);

        SearchStringPage searchStringPage = new SearchStringPage();
        Assertions.assertEquals(SearchStringMessage.THE_TITLE_THE_MAZE_RUNNER,
                searchStringPage.getTextBookInTheBasket(SearchStringXpath.BOOK_THE_MAZE_RUNNER_IN_THE_BASKET_XPATH));
    }
}
