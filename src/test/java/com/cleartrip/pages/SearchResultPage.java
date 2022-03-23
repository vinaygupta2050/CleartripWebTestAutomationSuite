package com.cleartrip.pages;

import com.cleartrip.objects.SearchPageObjects;
import com.cleartrip.objects.SearchResultPageObjects;
import com.cleartrip.utils.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

/**
 * @author in-vinaykumar.gupta on 23/03/22
 * @project IntelliJ IDEA
 */
public class SearchResultPage extends BasePage {
    private SearchResultPageObjects searchResultPageObjects;
    public SearchResultPage(WebDriver driver) {
        super(driver);
        searchResultPageObjects = new SearchResultPageObjects();
        PageFactory.initElements(driver,searchResultPageObjects);
    }
    public SearchResultPage verifySearchResultPage(){
        waitForElement(searchResultPageObjects.lblTotalNumberOfAvailableFlights);
        Assert.assertTrue(searchResultPageObjects.lblTotalNumberOfAvailableFlights.isDisplayed());
        return this;
    }
}
