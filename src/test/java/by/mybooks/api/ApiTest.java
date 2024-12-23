package by.mybooks.api;

import by.mybooks.domain.Users;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;

public class ApiTest {

    private static final Logger logger = LogManager.getLogger();
    private LoginRequest loginRequest;

    @BeforeEach
    void setUpLoginRequest() {
        loginRequest = new LoginRequest();
    }

    @Test
    @DisplayName("проверка с пустыми полями email и password")
    public void testNoData() {
        logger.info("НАЧАЛО - testNoData() проверка с пустыми полями email и password");

        loginRequest.getResponseForRequest(Users.getUserWithNoData())
                .log().all()
                .statusCode(422)
                .body("errors.email[0]", equalTo(ApiMessage.FIELD_EMAIL_MESSAGE))
                .body("errors.password[0]", equalTo(ApiMessage.FIELD_PASSWORD_MESSAGE));

        logger.info("КОНЕЦ - testNoData() проверка с пустыми полями email и password");
    }

    @Test
    @DisplayName("проверка с заполненными полями email и password (корректные значения)")
    public void testValidData() {
        logger.info("НАЧАЛО - testValidData() проверка с заполненными полями email и password (корректные значения)");

        loginRequest.getResponseForRequest(Users.getUserWithValidData())
                .log().all()
                .statusCode(422)
                .body("errors.email[0]", equalTo(ApiMessage.ERROR_INCORRECT_EMAIL_MESSAGE));

        logger.info("КОНЕЦ - testValidData() проверка с заполненными полями email и password (корректные значения)");
    }

    @Test
    @DisplayName("проверка с заполненными полями email и password (некорректные значения)")
    public void testInvalidData() {
        logger.info("НАЧАЛО - testInvalidData() проверка с заполненными полями email и password (некорректные значения)");

        loginRequest.getResponseForRequest(Users.getUserWithInvalidData())
                .log().all()
                .statusCode(422)
                .body("errors.email[0]", equalTo(ApiMessage.ERROR_INVALID_EMAIL_MESSAGE));

        logger.info("КОНЕЦ - testInvalidData() проверка с заполненными полями email и password (некорректные значения)");
    }

    @Test
    @DisplayName("проверка с заполненным полем email (корректное значение) и с пустым полем password")
    public void testValidEmailAndNoPassword() {
        logger.info("НАЧАЛО - testValidEmailAndNoPassword() проверка с заполненным полем email (корректное значение) " +
                "и с пустым полем password");

        loginRequest.getResponseForRequest(Users.getUserWithValidEmailAndNoPassword())
                .log().all()
                .statusCode(422)
                .body("errors.email[0]", equalTo(ApiMessage.ERROR_INCORRECT_EMAIL_MESSAGE))
                .body("errors.password[0]", equalTo(ApiMessage.FIELD_PASSWORD_MESSAGE));

        logger.info("КОНЕЦ - testValidEmailAndNoPassword() проверка с заполненным полем email (корректное значение) " +
                "и с пустым полем password");
    }

    @Test
    @DisplayName("проверка с заполненным полем email (некорректное значение) и с пустым полем password")
    public void testInvalidEmailAndNoPassword() {
        logger.info("НАЧАЛО - testInvalidEmailAndNoPassword() проверка с заполненным полем email " +
                "(некорректное значение) и с пустым полем password");

        loginRequest.getResponseForRequest(Users.getUserWithInvalidEmailAndNoPassword())
                .log().all()
                .statusCode(422)
                .body("errors.email[0]", equalTo(ApiMessage.ERROR_INVALID_EMAIL_MESSAGE))
                .body("errors.password[0]", equalTo(ApiMessage.FIELD_PASSWORD_MESSAGE));

        logger.info("КОНЕЦ - testInvalidEmailAndNoPassword() проверка с заполненным полем email " +
                "(некорректное значение) и с пустым полем password");
    }

    @Test
    @DisplayName("проверка с пустым полем email и с заполненным полем password (корректное значение)")
    public void testNoEmailAndValidPassword() {
        logger.info("НАЧАЛО - testNoEmailAndValidPassword() проверка с пустым полем email и с заполненным полем " +
                "password (корректное значение)");

        loginRequest.getResponseForRequest(Users.getUserWithNoEmailAndValidPassword())
                .log().all()
                .statusCode(422)
                .body("errors.email[0]", equalTo(ApiMessage.FIELD_EMAIL_MESSAGE));

        logger.info("КОНЕЦ - testNoEmailAndValidPassword() проверка с пустым полем email и с заполненным полем " +
                "password (корректное значение)");
    }

    @Test
    @DisplayName("проверка с пустым полем email и с заполненным полем password (некорректное значение)")
    public void testNoEmailAndInvalidPassword() {
        logger.info("НАЧАЛО - testNoEmailAndInvalidPassword() проверка с пустым полем email и с заполненным полем " +
                "password (некорректное значение)");

        loginRequest.getResponseForRequest(Users.getUserWithNoEmailAndInvalidPassword())
                .log().all()
                .statusCode(422)
                .body("errors.email[0]", equalTo(ApiMessage.FIELD_EMAIL_MESSAGE));

        logger.info("КОНЕЦ - testNoEmailAndInvalidPassword() проверка с пустым полем email и с заполненным полем " +
                "password (некорректное значение)");
    }

    @Test
    @DisplayName("проверка с заполненными полями email и password (корректные значения) без поля token")
    public void testWithoutFieldToken() {
        logger.info("НАЧАЛО - testWithoutFieldToken() проверка с заполненными полями email и password " +
                "(корректные значения) без поля token");

        loginRequest.getResponseForRequestWithoutToken(Users.getUserWithValidData())
                .log().all()
                .statusCode(422)
                .body("errors.email[0]", equalTo(ApiMessage.ERROR_INCORRECT_EMAIL_MESSAGE));

        logger.info("КОНЕЦ - testWithoutFieldToken() проверка с заполненными полями email и password " +
                "(корректные значения) без поля token");
    }

    @Test
    @DisplayName("проверка с заполненным полем email (корректные значения) без поля password")
    public void testWithoutFieldPassword() {
        logger.info("НАЧАЛО - testWithoutFieldPassword() проверка с заполненным полем email (корректные значения) " +
                "без поля password");

        loginRequest.getResponseForRequestWithoutFieldPassword(Users.getUserWithValidEmail())
                .log().all()
                .statusCode(422)
                .body("errors.email[0]", equalTo(ApiMessage.ERROR_INCORRECT_EMAIL_MESSAGE))
                .body("errors.password[0]", equalTo(ApiMessage.FIELD_PASSWORD_MESSAGE));

        logger.info("КОНЕЦ - testWithoutFieldPassword() проверка с заполненным полем email (корректные значения) " +
                "без поля password");
    }

    @Test
    @DisplayName("проверка без полей email и password")
    public void testWithoutFieldsEmailAndPassword() {
        logger.info("НАЧАЛО - testWithoutFieldsEmailAndPassword() проверка без полей email и password");

        loginRequest.getResponseForRequestWithoutFieldEmailWithoutFieldPassword()
                .log().all()
                .statusCode(422)
                .body("errors.email[0]", equalTo(ApiMessage.FIELD_EMAIL_MESSAGE))
                .body("errors.password[0]", equalTo(ApiMessage.FIELD_PASSWORD_MESSAGE));

        logger.info("КОНЕЦ - testWithoutFieldsEmailAndPassword() проверка без полей email и password");
    }
}
