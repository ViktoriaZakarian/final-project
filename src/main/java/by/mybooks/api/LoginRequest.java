package by.mybooks.api;

import by.mybooks.domain.User;
import io.restassured.response.ValidatableResponse;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class LoginRequest {

    public static final String URL = "https://mybooks.by/user/auth?t=1732962500148";

    public static String getBody(User user) {
        return "login=login&type=email_password&email=" + user.getEmail() + "&password=" + user.getPassword()
                + "&_token=hMCvGBpDCHxdUgigTEtZXzz8UBxCGLVBx2kFiBSD";
    }

    public static String getBodyWithoutToken(User user) {
        return "login=login&type=email_password&email=" + user.getEmail() + "&password=" + user.getPassword();
    }

    public static String getBodyWithoutFieldPassword(User user) {
        return "login=login&type=email_password&email=" + user.getEmail()
                + "&_token=hMCvGBpDCHxdUgigTEtZXzz8UBxCGLVBx2kFiBSD";
    }

    public static String getBodyWithoutFieldEmailWithoutFieldPassword() {
        return "login=login&type=email_password&_token=hMCvGBpDCHxdUgigTEtZXzz8UBxCGLVBx2kFiBSD";
    }

    public static Map<String, String> getHeaders() {
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
        headers.put("accept", "application/json, text/javascript, */*; q=0.01");
        return headers;
    }

    public ValidatableResponse getResponseForRequest(User user) {
        ValidatableResponse response = given()
                .headers(LoginRequest.getHeaders())
                .body(LoginRequest.getBody(user))
                .when()
                .post(LoginRequest.URL)
                .then();
        return response;
    }

    public ValidatableResponse getResponseForRequestWithoutToken(User user) {
        ValidatableResponse response = given()
                .headers(LoginRequest.getHeaders())
                .body(LoginRequest.getBodyWithoutToken(user))
                .when()
                .post(LoginRequest.URL)
                .then();
        return response;
    }

    public ValidatableResponse getResponseForRequestWithoutFieldPassword(User user) {
        ValidatableResponse response = given()
                .headers(LoginRequest.getHeaders())
                .body(LoginRequest.getBodyWithoutFieldPassword(user))
                .when()
                .post(LoginRequest.URL)
                .then();
        return response;
    }

    public ValidatableResponse getResponseForRequestWithoutFieldEmailWithoutFieldPassword() {
        ValidatableResponse response = given()
                .headers(LoginRequest.getHeaders())
                .body(LoginRequest.getBodyWithoutFieldEmailWithoutFieldPassword())
                .when()
                .post(LoginRequest.URL)
                .then();
        return response;
    }
}
