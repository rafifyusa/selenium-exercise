/*
package com.mitrais;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "D:\\Day 34 - Defect report & Automated test\\chromedriver_win32\\chromedriver.exe");
        WebDriver browser;
        browser = new ChromeDriver();
//        ChromeDriver driver = new ChromeDriver();
        browser.get("http://localhost:4200/login");
        WebElement element=browser.findElement(By.xpath("//input[@name='username']"));
        element.sendKeys("someonenotlikeyou2@rocketmail.com");

        WebElement element2=browser.findElement(By.xpath("//input[@name='password']"));
        element.sendKeys("password");

        WebElement button=browser.findElement(By.xpath("//button[@name='btnLogin']"));
        button.click();
    }
}*/
