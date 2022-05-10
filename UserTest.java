package com.bridgelabz.functionalinterface;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/* Creating test methods for testing code
 * Happy Test method for success case
 * Sad Test method for failure case
 * Parameterized test for more than one parameter's input */

public class UserTest {
   UserDetails user = new UserDetails();

    @Test
    public void firstNameHappyTest() throws InvalidUserDetailsException {
        boolean firstName = user.setfName("Sarvesh");
        Assertions.assertTrue(firstName);
    }

    @Test
    public void firstNameSadTest() throws InvalidUserDetailsException {
        boolean firstName = user.setfName("sarvesh");
        Assertions.assertFalse(firstName);
    }

    @Test
    public void lastNameHappyTest() throws InvalidUserDetailsException{
        boolean lastName = user.setlName("Pednekar");
        Assertions.assertTrue(lastName);
    }

    @Test
    public void lastNameSadTest() throws InvalidUserDetailsException{
        boolean lastName = user.setlName("pednekar");
        Assertions.assertFalse(lastName);
    }

    @Test
    public void emailIdHappyTest() throws InvalidUserDetailsException{
        boolean emailId = user.setEmailId("sarvesh.pednekar30@gmail.com.co");
        Assertions.assertTrue(emailId);
    }

    @Test
    public void emailIdSadTest() throws InvalidUserDetailsException{
        boolean emailId = user.setEmailId("sarvesh@pednekar30@gmail.com.co");
        Assertions.assertFalse(emailId);
    }

    @Test
    public void numberHappyTest() throws InvalidUserDetailsException{
        boolean number = user.setNumber("91 7977293433");
        Assertions.assertTrue(number);
    }

    @Test
    public void numberSadTest() throws InvalidUserDetailsException{
        boolean number = user.setNumber("917977293433");
        Assertions.assertFalse(number);
    }

    @Test
    public void passwordHappyTest() throws InvalidUserDetailsException{
        boolean password = user.setPassword("lunaticAsylum@30");
        Assertions.assertTrue(password);
    }

    @Test
    public void passwordSadTest() throws InvalidUserDetailsException{
        boolean password = user.setPassword("lunaticsylum@30");
        Assertions.assertFalse(password);
    }

    @ParameterizedTest
    @ValueSource(strings = {"abc@yahoo.com","abc-100@yahoo.com","abc.100@yahoo.com","abc111@abc.com","abc-100@abc.net","abc.100@abc.com.au",
                            "abc@1.com","abc@gmail.com.com","abc+100@gmail.com"})
    public void isTrue(String input) throws InvalidUserDetailsException{
        boolean email = user.setEmailId(input);
        Assertions.assertTrue(email);
    }

    @ParameterizedTest
    @ValueSource(strings = {"abc-","abc@.com.my","abc123@gmail.a","abc123@.com","abc123@.com.com",
                            ".abc@abc.com","abc()*@gmail.com","abc@%*.com","abc..2002@gmail.com",
                            "abc@abc@gmail.com","abc@gmail.com.1a","abc@gmail.com.aa.au","abc.@gmail.com"})
    public void isFalse(String input) throws InvalidUserDetailsException{
        boolean email = user.setEmailId(input);
        Assertions.assertFalse(email);
    }
}
