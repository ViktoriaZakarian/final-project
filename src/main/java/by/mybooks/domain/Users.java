package by.mybooks.domain;

import by.mybooks.utils.Util;
import com.github.javafaker.Faker;

public class Users {

    public static User getUserWithValidData() {
        Faker faker = new Faker();
        return new User(faker.internet().emailAddress(), faker.internet().password());
    }

    public static User getUserWithInvalidData() {
        Faker faker = new Faker();
        return new User(faker.name().username(), Util.getRandomPasswordConsistsOfSymbols());
    }

    public static User getUserWithNoData() {
        return new User("", "");
    }

    public static User getUserWithValidEmailAndNoPassword() {
        Faker faker = new Faker();
        return new User(faker.internet().emailAddress(), "");
    }

    public static User getUserWithNoEmailAndValidPassword() {
        Faker faker = new Faker();
        return new User("", faker.internet().password());
    }

    public static User getUserWithInvalidEmailAndNoPassword() {
        Faker faker = new Faker();
        return new User(faker.name().username(), "");
    }

    public static User getUserWithNoEmailAndInvalidPassword() {
        return new User("", Util.getRandomPasswordConsistsOfSymbols());
    }

    public static User getUserWithValidEmail() {
        Faker faker = new Faker();
        return new User(faker.internet().emailAddress());
    }
}
