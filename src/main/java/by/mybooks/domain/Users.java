package by.mybooks.domain;

import by.mybooks.util.Util;

public class Users {

    private static final String NO_DATA = "";

    public static User getUserWithValidData() {
        return new User(Util.getValidEmail(), Util.getValidPassword());
    }

    public static User getUserWithInvalidData() {
        return new User(Util.getInvalidEmail(), Util.getRandomPasswordConsistsOfSymbols());
    }

    public static User getUserWithNoData() {
        return new User(NO_DATA, NO_DATA);
    }

    public static User getUserWithValidEmailAndNoPassword() {
        return new User(Util.getValidEmail(), NO_DATA);
    }

    public static User getUserWithNoEmailAndValidPassword() {
        return new User(NO_DATA, Util.getValidPassword());
    }

    public static User getUserWithInvalidEmailAndNoPassword() {
        return new User(Util.getInvalidEmail(), NO_DATA);
    }

    public static User getUserWithNoEmailAndInvalidPassword() {
        return new User(NO_DATA, Util.getRandomPasswordConsistsOfSymbols());
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
