package com.mitrais;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Test;
public class CheckSauceLabsHomePageTest {
    @Test
    public void site_header_is_on_home_page() {
        System.setProperty("webdriver.chrome.driver", "D:\\Day 34 - Defect report & Automated test\\chromedriver_win32\\chromedriver.exe");
        WebDriver browser;
        browser = new ChromeDriver();
        browser.get("http://saucelabs.com");
        WebElement header = browser.findElement(By.id("site-header"));
        assertTrue((header.isDisplayed()));
        browser.close();
    }
}