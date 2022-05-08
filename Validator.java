package com.bridgelabz.functionalinterface;

import java.util.regex.Pattern;

/* Creating validator class to create and match regex pattern for user details*/
public class Validator {
    // Creating private variables for and storing regex pattern
    private final String FIRST_NAME_PATTERN = "^[A-Z][a-z]{2,}$";
    private final String LAST_NAME_PATTERN = "^[A-Z][a-z]{2,}$";
    private final String EMAIL_PATTERN = "^[a-z0-9]+([._-][a-z0-9]+)?@[a-z]{2,5}[.][a-z]{2,3}([.][a-z]{2,3})?$";
    private final String NUMBER_PATTERN = "^[0-9]{2}[\\s][0-9][0-9]{9}$";

    /* Creating method for validating user details with regex pattern */

    public boolean validateFirstName(String fName) {
        boolean result = Pattern.matches(FIRST_NAME_PATTERN, fName);
        return result;
    }

    public boolean validateLastName(String lName) {
        boolean result = Pattern.matches(LAST_NAME_PATTERN, lName);
        return result;
    }

    public boolean validateEmailId(String email) {
        boolean result = Pattern.matches(EMAIL_PATTERN, email);
        return result;
    }

    public boolean validateNumber(String number) {
        boolean result = Pattern.matches(NUMBER_PATTERN, number);
        return result;
    }
}
