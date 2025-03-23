package com.qa.tests;

import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.pages.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class LoginTest {

    private WebDriver driver;
    private LoginPage loginPage;

    @BeforeEach
public void setUp() {
    WebDriverManager.chromedriver().browserVersion("134.0.6998.118").setup(); // <-- ta version actuelle
    driver = new ChromeDriver();
    driver.get("https://the-internet.herokuapp.com/login");
    loginPage = new LoginPage(driver);
}

    @Test
    @Order(1)
    public void testLoginSuccess() {
        loginPage.login("tomsmith", "SuperSecretPassword!");
        String message = loginPage.getSuccessMessage();
        assertTrue(message.contains("You logged into a secure area!"));
    }

    @Test
    @Order(2)
    public void testLoginFailure() {
        loginPage.login("invalid", "wrong");
        String message = loginPage.getErrorMessage();
        assertTrue(message.contains("Your username is invalid!"));
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
