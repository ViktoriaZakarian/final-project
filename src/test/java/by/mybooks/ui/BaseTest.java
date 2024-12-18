package by.mybooks.ui;

import by.mybooks.driver.Driver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {

    @BeforeEach
    public void startFromHome() {
        Driver.getDriver().get("https://mybooks.by/");
    }

    @AfterEach
    public void tearDown() {
        Driver.quit();
    }
}
