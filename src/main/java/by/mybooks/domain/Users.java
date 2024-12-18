package by.mybooks.domain;

import by.mybooks.util.Util;
import com.github.javafaker.Faker;

public class Users {

    public static User getUserWithValidData() {
        return new User(Util.getValidEmail(), Util.getValidPassword());
    }

    public static User getUserWithInvalidData() {
        return new User(Util.getInvalidEmail(), Util.getRandomPasswordConsistsOfSymbols());
    }

    public static User getUserWithNoData() {
        return new User("", "");
    }

    public static User getUserWithValidEmailAndNoPassword() {
        return new User(Util.getValidEmail(), "");
    }

    public static User getUserWithNoEmailAndValidPassword() {
        return new User("", Util.getValidPassword());
    }

    public static User getUserWithInvalidEmailAndNoPassword() {
        return new User(Util.getInvalidEmail(), "");
    }

    public static User getUserWithNoEmailAndInvalidPassword() {
        return new User("", Util.getRandomPasswordConsistsOfSymbols());
    }

    public static User getUserWithValidEmailAndInvalidPassword() {
        return new User(Util.getValidEmail(), Util.getRandomPasswordConsistsOfSymbols());
    }

    public static User getUserWithInvalidEmailAndValidPassword() {
        return new User(Util.getInvalidEmail(), Util.getValidPassword());
    }

    public static User getUserWithValidEmail() {
        return new User(Util.getValidEmail());
    }
}
