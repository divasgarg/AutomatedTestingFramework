package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BaseClass;

public class LoginTest extends BaseClass {

    @Test
    public void verifyLogin() {
        // Navigate to the live website's login page
        driver.get("https://example.com/login");

        // Find the username, password fields, and login button
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("loginButton"));

        // Enter the login credentials
        usernameField.sendKeys("yourUsername");  // Replace with a valid username
        passwordField.sendKeys("yourPassword");  // Replace with a valid password

        // Click the login button
        loginButton.click();

        // Check if login was successful (e.g., by verifying the presence of a welcome message)
        WebElement welcomeMessage = driver.findElement(By.id("welcomeMessage"));
        Assert.assertTrue(welcomeMessage.isDisplayed(), "Login Failed!");

        // Optionally, log the page title or URL for verification
        System.out.println("Page title is: " + driver.getTitle());
        System.out.println("Current URL is: " + driver.getCurrentUrl());
    }
}