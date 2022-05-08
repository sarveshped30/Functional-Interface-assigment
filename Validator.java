package com.bridgelabz.functionalinterface;

import java.util.regex.Pattern;

public class Validator {
    private final String FIRST_NAME_PATTERN = "^[A-Z][a-z]{2,}$";
    private static final String LAST_NAME_PATTERN = "^[A-Z][a-z]{2,}$";

    public boolean validateFirstName(String fName) {
        boolean result = Pattern.matches(FIRST_NAME_PATTERN, fName);
        return result;
    }

    public boolean validateLastName(String lName) {
        boolean result = Pattern.matches(FIRST_NAME_PATTERN, lName);
        return result;
    }
}
