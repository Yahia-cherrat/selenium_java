package com.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    public static WebDriver driver;

    public void setDriver(WebDriver driver) {
        BasePage.driver = driver;
    }

    protected WebElement findByLocator(By locator) {
        return driver.findElement(locator);
    }

    protected void set(By locator, String text) {
        findByLocator(locator).clear();
        findByLocator(locator).sendKeys(text);
    }

    protected void click(By locator) {
        findByLocator(locator).click();
    }

    public static void delay(int milliSec) {
        try{
            Thread.sleep(milliSec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
