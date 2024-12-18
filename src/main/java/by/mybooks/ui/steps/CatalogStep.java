package by.mybooks.ui.steps;

import by.mybooks.ui.homepage.HomePage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CatalogStep {

    private static final Logger logger = LogManager.getLogger();

    public void goToTheSecondPageOfTheCatalog() {
        logger.info("CatalogStep - goToTheSecondPageOfTheCatalog()");
        HomePage homePage = new HomePage();
        homePage
                .clickButtonAcceptAllCookies()
                .clickButtonNext();
    }

    public void goToTheThirdPageOfTheCatalog() {
        logger.info("CatalogStep - goToTheThirdPageOfTheCatalog()");
        HomePage homePage = new HomePage();
        homePage
                .clickButtonAcceptAllCookies()
                .clickButtonNext()
                .clickButtonNext();
    }

    public void goToTheFourthPageOfTheCatalog() {
        logger.info("CatalogStep - goToTheFourthPageOfTheCatalog()");
        HomePage homePage = new HomePage();
        homePage
                .clickButtonAcceptAllCookies()
                .clickButtonNext()
                .clickButtonNext()
                .clickButtonNext();
    }
}
