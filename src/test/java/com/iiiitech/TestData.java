package com.iiiitech;

import com.github.javafaker.Faker;

public class TestData {
    private static final Faker faker = new Faker();
    public static String
            firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            company = faker.company().name(),
            jobPosition = faker.job().position(),
            email = faker.internet().emailAddress(),
            phoneNumber = faker.phoneNumber().subscriberNumber(10),
            question = faker.lebowski().quote();
}
