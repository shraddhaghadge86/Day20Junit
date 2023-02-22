package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    static UserRegistration userRegistration;

    @BeforeAll
    public static void init() {
        userRegistration = new UserRegistration();
    }

    @Test
    public void firstNmeShouldBeTrue() {
        boolean value = userRegistration.checkFirstName("Shraddha");
        Assertions.assertEquals(true, value);
    }

    @Test
    public void firstNmeShouldBeFalse() {
        boolean value = userRegistration.checkFirstName("Shraddha");
        Assertions.assertEquals(false, value);
    }

    @Test
    public void lastNameTest2_ShouldReturnTrue() {
        boolean value = userRegistration.checkLastName("Ghadge");
        Assertions.assertEquals(true, value);
    }

    @Test
    public void lastNameTest2_ShouldReturnFalse() {
        boolean value = userRegistration.checkLastName("Ghadge");
        Assertions.assertEquals(false, value);
    }

    @Test
    public void emailTest3_ShouldReturnTrue() {
        boolean value = userRegistration.checkEmail("shraddhaghadge86@gmail.com");
        Assertions.assertEquals(true, value);
    }

    @Test
    public void emailTest3_ShouldReturnFalse() {
        boolean value = userRegistration.checkEmail("shraddhaghadge86@gmail.com");
        Assertions.assertEquals(false, value);
    }

    @Test
    public void numberTest4_ShouldReturnTrue() {
        boolean value = userRegistration.phoneNumber("91 8605512168");
        Assertions.assertEquals(true, value);
    }

    @Test
    public void numberTest4_ShouldReturnFalse() {
        boolean value = userRegistration.phoneNumber("91 8605512168");
        Assertions.assertEquals(false, value);
    }

    @Test
    public void passWordTest5_ShouldReturnTrue() {
        boolean value = userRegistration.passWord("Shraddha@123");
        Assertions.assertEquals(true, value);
    }

    @Test
    public void passWordTest5_ShouldReturnFalse() {
        boolean value = userRegistration.passWord("Shraddha@123");
        Assertions.assertEquals(false, value);
    }
}
