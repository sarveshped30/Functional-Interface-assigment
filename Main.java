/* Assignment on user registration using functional interface and lambada expression
 * RFP assignment
 * Author: sarvesh pednekar */

package com.bridgelabz.functionalinterface;

@FunctionalInterface
/* User entry interface contains one abstract method which validates and sets user details */
interface UserEntry {
    boolean setUserDetails(String data,String pattern) throws InvalidUserDetailsException;
}

/* Creating custom exception class which extends exception */
class InvalidUserDetailsException extends Exception {
    public InvalidUserDetailsException(String message) {
        super(message);
    }
}

/* Creating pojo class for userDetails */
class UserDetails {
    /* Creating user details variables and making them private*/
    private String fName;
    private String lName;
    private String emailId;
    private String number;
    private String password;

    /* Creating object of validator class*/
    Validator validate =  new Validator();

    /* implementing method of functional interface by creating object */

    UserEntry fNameEntry = (data,pattern)-> {
        // Validating fName
       if(validate.validateUserDetails(data,pattern)) {
           this.fName = data;
           System.out.println("Valid fName");
           return true;
       } else {
           // Throws an object of user defined exception
           throw new InvalidUserDetailsException("Invalid fName");
       }
    };

    UserEntry lNameEntry = (data,pattern)-> {
        if(validate.validateUserDetails(data,pattern)) {
            // Validating lName
            this.lName = data;
            System.out.println("Valid lName");
            return true;
        } else {
            // Throws an object of user defined exception
            throw new InvalidUserDetailsException("Invalid lName");
        }
    };

    UserEntry emailEntry = (data,pattern)-> {
        // Validating email
        if(validate.validateUserDetails(data,pattern)) {
            this.emailId = data;
            System.out.println("Valid emailId");
            return true;
        } else {
            // Throws an object of user defined exception
            throw new InvalidUserDetailsException("Invalid emailId");
        }
    };

    UserEntry numberEntry = (data,pattern)-> {
        // Validating number
        if(validate.validateUserDetails(data,pattern)) {
            this.number = data;
            System.out.println("Valid number");
            return true;
        } else {
            // Throws an object of user defined exception
            throw new InvalidUserDetailsException("Invalid number");
        }
    };

    UserEntry passwordEntry = (data,pattern)-> {
        // Validating password
        if(validate.validateUserDetails(data,pattern)) {
            this.password = data;
            System.out.println("Valid password");
            return true;
        } else {
            // Throws an object of user defined exception
            throw new InvalidUserDetailsException("Invalid password");
        }
    };

    public String getFName() {
        return fName;
    }
    public String getLName() {
        return lName;
    }
    public String getEmailId() {
        return emailId;
    }
    public String getNumber() {
       return number;
    }
    public String getPassword() {
        return password;
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating object of user details class
        UserDetails user = new UserDetails();
        Validator validator = new Validator();
        // Calling methods
        try {
            user.fNameEntry.setUserDetails("Sarvesh", validator.FIRST_NAME_PATTERN);
        } catch(InvalidUserDetailsException ex) {
            // printing the message from InvalidUserDetailsException object
            System.out.println("Exception occurred: " + ex);
        }

        try {
            user.lNameEntry.setUserDetails("Pednekar", validator.LAST_NAME_PATTERN);
        } catch(InvalidUserDetailsException ex) {
            // printing the message from InvalidUserDetailsException object
            System.out.println("Exception occurred: " + ex);
        }

        try {
            user.emailEntry.setUserDetails("sarvesh@gmail.com", validator.EMAIL_PATTERN);
        } catch(InvalidUserDetailsException ex) {
            // printing the message from InvalidUserDetailsException object
            System.out.println("Exception occurred: " + ex);
        }

        try {
            user.numberEntry.setUserDetails("91 7977293433", validator.NUMBER_PATTERN);
        } catch(InvalidUserDetailsException ex) {
            // printing the message from InvalidUserDetailsException object
            System.out.println("Exception occurred: " + ex);
        }

        try {
            user.passwordEntry.setUserDetails("lunaticAsylum@30", validator.PASSWORD_PATTERN);
        } catch(InvalidUserDetailsException ex) {
            // printing the message from InvalidUserDetailsException object
            System.out.println("Exception occurred: " + ex);
        }

        System.out.println(user.getFName());
        System.out.println(user.getLName());
        System.out.println(user.getEmailId());
        System.out.println(user.getNumber());
        System.out.println(user.getPassword());
    }
}
