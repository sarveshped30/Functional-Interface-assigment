package com.bridgelabz.functionalinterface;

import java.util.regex.Pattern;

/* Creating validator class to create and match regex pattern for user details*/
public class Validator {
    // Creating protected variables for and storing regex pattern.
    protected final String FIRST_NAME_PATTERN = "^[A-Z][a-z]{2,}$";
    protected final String LAST_NAME_PATTERN = "^[A-Z][a-z]{2,}$";
    protected final String EMAIL_PATTERN = "^[a-z0-9]+([._+-][a-z0-9]+)?@[a-z0-9]{1,5}[.][a-z]{2,3}([.][a-z]{2,3})?$";
    protected final String NUMBER_PATTERN = "^[0-9]{2}[\\s][0-9][0-9]{9}$";
    protected final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])([@#$%^&+=]?)(?=\\S+$).{8,20}$";

    public boolean validateUserDetails(String data, String pattern) {
        boolean result = Pattern.matches(pattern,data);
        return result;
    }
}
