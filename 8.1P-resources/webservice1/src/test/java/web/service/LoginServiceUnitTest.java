package web.service;

import org.junit.Assert;
import org.junit.Test;

public class LoginServiceUnitTest {

    @Test
    public void testValidLogin() {
        // Arrange
        String username = "Gayani";
        String password = "Gayani_pass";
        String dob = "1999-10-20";

        // Act
        boolean result = LoginService.login(username, password, dob);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void testInvalidUsername() {
        // Arrange
        String username = "invalid_user";
        String password = "Gayani_pass";
        String dob = "1999-10-20";

        // Act
        boolean result = LoginService.login(username, password, dob);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void testInvalidPassword() {
        // Arrange
        String username = "Gayani";
        String password = "invalid_password";
        String dob = "1999-10-20";

        // Act
        boolean result = LoginService.login(username, password, dob);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void testInvalidDOB() {
        // Arrange
        String username = "Gayani";
        String password = "Gayani_pass";
        String dob = "01/01/1990"; // Invalid date format

        // Act
        boolean result = LoginService.login(username, password, dob);

        // Assert
        Assert.assertFalse(result);
    }
}
