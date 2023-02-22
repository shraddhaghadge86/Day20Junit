package com.bridgelabz;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertEquals;


public class UserRegistrationTest {
    public void firstNameTest_ShouldReturnTrue() {
        boolean value = UserRegistration.checkFirstName("Shraddha");
        //test output
        assertEquals(true, value);
    }

    public void lastNameTest2_ShouldReturnTrue() {
        boolean value = UserRegistration.checkLastName("Ghadge");
        assertEquals(true, value);
    }

    public void emailTest3_ShouldReturnTrue() {
        boolean value = UserRegistration.checkEmail("shraddhaghadge86@gmail.com");
        assertEquals(true, value);
    }

    public void numberTest4_ShouldReturnTrue() {
        boolean value = UserRegistration.phoneNumber("91 8605512168");
        assertEquals(true, value);
    }

    public void passWordTest5_ShouldReturnTrue() {
        boolean value = UserRegistration.passWord("Shraddha@123");
        assertEquals(true, value);
    }
}
