package com.mitrais;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

public class TestSelenium {
    @Test
    public void testLogin() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Day 34 - Defect report & Automated test\\chromedriver_win32\\chromedriver.exe");
        WebDriver browser;
        browser = new ChromeDriver();
//        ChromeDriver driver = new ChromeDriver();
        browser.get("http://localhost:4200/login");
        WebElement element=browser.findElement(By.xpath("//input[@name='username']"));
        element.sendKeys("someonenotlikeyou2@rocketmail.com");

        WebElement element2=browser.findElement(By.xpath("//input[@id=\"password\"]"));
        element2.sendKeys("password");

        WebElement button=browser.findElement(By.xpath("//button[@name='btnLogin']"));
        button.click();

        Thread.sleep(5000);
        WebElement header = browser.findElement(By.xpath("//img[@name='profpic']"));
        assertTrue((header.isDisplayed()));
        browser.close();
    }
}