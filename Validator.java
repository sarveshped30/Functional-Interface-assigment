package com.bridgelabz.functionalinterface;

import java.util.regex.Pattern;

public class Validator {
    private final String FIRST_NAME_PATTERN = "^[A-Z][a-z]{2,}$";

    public boolean validateFirstName(String fName) {
        boolean result = Pattern.matches(FIRST_NAME_PATTERN, fName);
        return result;
    }
}
