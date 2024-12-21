package by.mybooks.api;

import by.mybooks.domain.Users;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.equalTo;

public class ApiTest {

    @Test
    @DisplayName("проверка с пустыми полями email и password")
    public void test1() {
        LoginRequest loginRequest = new LoginRequest();
        loginRequest.getResponseForRequest(Users.getUserWithNoData())
                .log().all()
                .statusCode(422)
                .body("errors.email[0]", equalTo(ApiMessage.FIELD_EMAIL_MESSAGE))
                .body("errors.password[0]", equalTo(ApiMessage.FIELD_PASSWORD_MESSAGE));
    }

    @Test
    @DisplayName("проверка с заполненными полями email и password (корректные значения)")
    public void test2() {
        LoginRequest loginRequest = new LoginRequest();
        loginRequest.getResponseForRequest(Users.getUserWithValidData())
                .log().all()
                .statusCode(422)
                .body("errors.email[0]", equalTo(ApiMessage.ERROR_INCORRECT_EMAIL_MESSAGE));
    }

    @Test
    @DisplayName("проверка с заполненными полями email и password (некорректные значения)")
    public void test3() {
        LoginRequest loginRequest = new LoginRequest();
        loginRequest.getResponseForRequest(Users.getUserWithInvalidData())
                .log().all()
                .statusCode(422)
                .body("errors.email[0]", equalTo(ApiMessage.ERROR_INVALID_EMAIL_MESSAGE));
    }

    @Test
    @DisplayName("проверка с заполненным полем email (корректное значение) и с пустым полем password")
    public void test4() {
        LoginRequest loginRequest = new LoginRequest();
        loginRequest.getResponseForRequest(Users.getUserWithValidEmailAndNoPassword())
                .log().all()
                .statusCode(422)
                .body("errors.email[0]", equalTo(ApiMessage.ERROR_INCORRECT_EMAIL_MESSAGE))
                .body("errors.password[0]", equalTo(ApiMessage.FIELD_PASSWORD_MESSAGE));
    }

    @Test
    @DisplayName("проверка с заполненным полем email (некорректное значение) и с пустым полем password")
    public void test5() {
        LoginRequest loginRequest = new LoginRequest();
        loginRequest.getResponseForRequest(Users.getUserWithInvalidEmailAndNoPassword())
                .log().all()
                .statusCode(422)
                .body("errors.email[0]", equalTo(ApiMessage.ERROR_INVALID_EMAIL_MESSAGE))
                .body("errors.password[0]", equalTo(ApiMessage.FIELD_PASSWORD_MESSAGE));
    }

    @Test
    @DisplayName("проверка с пустым полем email и с заполненным полем password (корректное значение)")
    public void test6() {
        LoginRequest loginRequest = new LoginRequest();
        loginRequest.getResponseForRequest(Users.getUserWithNoEmailAndValidPassword())
                .log().all()
                .statusCode(422)
                .body("errors.email[0]", equalTo(ApiMessage.FIELD_EMAIL_MESSAGE));
    }

    @Test
    @DisplayName("проверка с пустым полем email и с заполненным полем password (некорректное значение - ")
    public void test7() {
        LoginRequest loginRequest = new LoginRequest();
        loginRequest.getResponseForRequest(Users.getUserWithNoEmailAndInvalidPassword())
                .log().all()
                .statusCode(422)
                .body("errors.email[0]", equalTo(ApiMessage.FIELD_EMAIL_MESSAGE));
    }

    @Test
    @DisplayName("проверка с заполненными полями email и password (корректные значения) без поля token")
    public void test8() {
        LoginRequest loginRequest = new LoginRequest();
        loginRequest.getResponseForRequestWithoutToken(Users.getUserWithValidData())
                .log().all()
                .statusCode(422)
                .body("errors.email[0]", equalTo(ApiMessage.ERROR_INCORRECT_EMAIL_MESSAGE));
    }

    @Test
    @DisplayName("проверка с заполненным полем email (корректные значения) без поля password")
    public void test9() {
        LoginRequest loginRequest = new LoginRequest();
        loginRequest.getResponseForRequestWithoutFieldPassword(Users.getUserWithValidEmail())
                .log().all()
                .statusCode(422)
                .body("errors.email[0]", equalTo(ApiMessage.ERROR_INCORRECT_EMAIL_MESSAGE))
                .body("errors.password[0]", equalTo(ApiMessage.FIELD_PASSWORD_MESSAGE));
    }

    @Test
    @DisplayName("проверка без полей email и password")
    public void test10() {
        LoginRequest loginRequest = new LoginRequest();
        loginRequest.getResponseForRequestWithoutFieldEmailWithoutFieldPassword()
                .log().all()
                .statusCode(422)
                .body("errors.email[0]", equalTo(ApiMessage.FIELD_EMAIL_MESSAGE))
                .body("errors.password[0]", equalTo(ApiMessage.FIELD_PASSWORD_MESSAGE));
    }
}
