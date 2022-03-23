package com.cleartrip.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author in-vinaykumar.gupta on 19/03/22
 * @project IntelliJ IDEA
 */
public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 20);
    }

    public WebElement waitForElement(WebElement by) {
        wait.until(ExpectedConditions.elementToBeClickable(by));
        return by;
    }
}
