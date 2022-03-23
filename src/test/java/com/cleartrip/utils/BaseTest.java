package com.cleartrip.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

/**
 * @author in-vinaykumar.gupta on 19/03/22
 * @project IntelliJ IDEA
 */
public class BaseTest {
    public WebDriver driver;
    public String baseUrl=Configuration.getConfiguration().getAppUrl();

    @BeforeMethod
    public void setup(){
        getChromeDriver();
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }
    @AfterMethod
    public void tearDown(){
        if(driver!=null){
            driver.quit();
        }
    }
    public void getChromeDriver() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
    }
}
