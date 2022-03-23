package com.cleartrip.pages;

import com.cleartrip.objects.SearchPageObjects;
import com.cleartrip.utils.BasePage;
import com.cleartrip.utils.ErrorMessageConstants;
import com.cleartrip.utils.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

/**
 * @author in-vinaykumar.gupta on 19/03/22
 * @project IntelliJ IDEA
 */
public class SearchPage extends BasePage {
    private SearchPageObjects searchPageObjects;
    public SearchPage(WebDriver driver) {
        super(driver);
        searchPageObjects = new SearchPageObjects();
        PageFactory.initElements(driver,searchPageObjects);
    }
    public SearchPage selectTripTypeAsOneWay()
    {
        searchPageObjects.radioBtnOneWay.click();
        return this;
    }
    public SearchPage selectTripTypeAsRoundTrip()
    {
        searchPageObjects.radioBtnRoundTrip.click();
        return this;
    }

    public SearchPage selectTripTypeAsMultiCity()
    {
        searchPageObjects.radioBtnOneWay.click();
        return this;
    }

    public SearchPage enterFromLocation(String location)
    {
        searchPageObjects.txtFrom.sendKeys(location);
        waitForElement(searchPageObjects.fromSuggestionList);
        driver.findElement(By.xpath("//ul/div[text()='Suggestions']/../li/p[contains(text(),'"+location+"')]")).click();
        //searchPageObjects.suggestionList.click();
        return this;
    }
    public SearchPage enterInvalidFromLocation(String location)
    {
        searchPageObjects.txtFrom.sendKeys(location);
        return this;
    }
    public SearchPage enterInvalidToLocation(String location)
    {
        searchPageObjects.txtTo.sendKeys(location);
        return this;
    }
    public SearchPage enterToLocation(String location)
    {
        searchPageObjects.txtTo.sendKeys(location);
        waitForElement(searchPageObjects.toSuggestionList);
        driver.findElement(By.xpath("//ul/div[text()='Suggestions']/../li/p[contains(text(),'"+location+"')]")).click();
        //searchPageObjects.suggestionList.click();
        return this;
    }

    public SearchPage selectTodaysDate(){
        searchPageObjects.dateSelector.click();
        waitForElement(searchPageObjects.datePickerFrom);
        String date = Helper.getTodaysDate();
        driver.findElement(By.xpath("//div[@aria-label='"+date+"']")).click();
        return this;
    }
    public SearchPage selectFutureDate(int numberOfDaysAhead){
        searchPageObjects.dateSelector.click();
        waitForElement(searchPageObjects.datePickerFrom);
        String date = Helper.getFutureDateWithDifferenceToNumberOfDays(2);
        driver.findElement(By.xpath("//div[@aria-label='"+date+"']")).click();
        return this;
    }
    public SearchPage selectPastDate(){
        searchPageObjects.dateSelector.click();
        waitForElement(searchPageObjects.datePickerFrom);
        String date = Helper.getPastDateWithDifferenceToNumberOfDays(1);
        driver.findElement(By.xpath("//div[@aria-label='"+date+"']")).click();
        return this;
    }

    public SearchPage selectNumberOfAdults(int numberOfAdults){
        Select adultSelector = new Select(searchPageObjects.selectorAdults);
        adultSelector.selectByValue(String.valueOf(numberOfAdults));
        return this;
    }
    public SearchPage selectNumberOfChildren(int numberOfChildren){
        Select childrenSelector = new Select(searchPageObjects.selectorChildren);
        childrenSelector.selectByValue(String.valueOf(numberOfChildren));
        return this;
    }
    public SearchPage selectNumberOfInfants(int numberOfInfants){
        Select infantsSelector = new Select(searchPageObjects.selectorInfants);
        infantsSelector.selectByValue(String.valueOf(numberOfInfants));
        return this;
    }

    public SearchResultPage clickOnSearchFlight(){
        searchPageObjects.btnSearchFlight.click();
        return new SearchResultPage(driver);

    }
    public SearchPage clickOnSearchFlightsInvalidCase(){
        searchPageObjects.btnSearchFlight.click();
        return this;
    }
    public SearchPage verifyInvalidAirportCityMessage(){
        Assert.assertEquals(searchPageObjects.errorMessage.getText(), ErrorMessageConstants.INVALID_CITY_MSG);
        return this;
    }
    public SearchPage verifySameAirportCityMessage(){
        Assert.assertEquals(searchPageObjects.errorMessage.getText(), ErrorMessageConstants.SAME_CITY_MSG);
        return this;
    }

}
