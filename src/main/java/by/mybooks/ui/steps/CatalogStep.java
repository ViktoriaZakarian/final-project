package by.mybooks.ui.steps;

import by.mybooks.ui.homepage.HomePage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CatalogStep {

    private static final Logger logger = LogManager.getLogger();

    public void goToCatalogSectionLink(String catalogSectionLinkXpath) {
        logger.info("CatalogStep - goToCatalogSectionLink():{}", catalogSectionLinkXpath);
        HomePage homePage = new HomePage();
        homePage
                .clickButtonAcceptAllCookies()
                .clickCatalogSectionLink(catalogSectionLinkXpath);
    }

    public void goToTheSecondPageOfTheCatalog() {
        logger.info("CatalogStep - goToTheSecondPageOfTheCatalog()");
        HomePage homePage = new HomePage();
        homePage
                .clickButtonAcceptAllCookies()
                .clickButtonNext();
    }

    public void goToTheSecondPageOfTheCatalog(String catalogSectionLinkXpath) {
        logger.info("CatalogStep - goToTheSecondPageOfTheCatalog() {}", catalogSectionLinkXpath);
        HomePage homePage = new HomePage();
        homePage
                .clickButtonAcceptAllCookies()
                .clickButtonNext()
                .clickCatalogSectionLink(catalogSectionLinkXpath);
    }

    public void goToTheThirdPageOfTheCatalog() {
        logger.info("CatalogStep - goToTheThirdPageOfTheCatalog()");
        HomePage homePage = new HomePage();
        homePage
                .clickButtonAcceptAllCookies()
                .clickButtonNext()
                .clickButtonNext();
    }

    public void goToTheThirdPageOfTheCatalog(String catalogSectionLinkXpath) {
        logger.info("CatalogStep - goToTheThirdPageOfTheCatalog() {}", catalogSectionLinkXpath);
        HomePage homePage = new HomePage();
        homePage
                .clickButtonAcceptAllCookies()
                .clickButtonNext()
                .clickButtonNext()
                .clickCatalogSectionLink(catalogSectionLinkXpath);

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

    public void goToTheFourthPageOfTheCatalog(String catalogSectionLinkXpath) {
        logger.info("CatalogStep - goToTheFourthPageOfTheCatalog() {}", catalogSectionLinkXpath);
        HomePage homePage = new HomePage();
        homePage
                .clickButtonAcceptAllCookies()
                .clickButtonNext()
                .clickButtonNext()
                .clickButtonNext()
                .clickCatalogSectionLink(catalogSectionLinkXpath);
    }

    public void goToTheFifthPageOfTheCatalog() {
        logger.info("CatalogStep - goToTheFifthPageOfTheCatalog()");
        HomePage homePage = new HomePage();
        homePage
                .clickButtonAcceptAllCookies()
                .clickButtonNext()
                .clickButtonNext()
                .clickButtonNext()
                .clickButtonNext();
    }

    public void goToTheFifthPageOfTheCatalog(String catalogSectionLinkXpath) {
        logger.info("CatalogStep - goToTheFifthPageOfTheCatalog() {}", catalogSectionLinkXpath);
        HomePage homePage = new HomePage();
        homePage
                .clickButtonAcceptAllCookies()
                .clickButtonNext()
                .clickButtonNext()
                .clickButtonNext()
                .clickButtonNext()
                .clickCatalogSectionLink(catalogSectionLinkXpath);
    }
}
