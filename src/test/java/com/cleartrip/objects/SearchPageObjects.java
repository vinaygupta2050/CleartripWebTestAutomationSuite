package com.cleartrip.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author in-vinaykumar.gupta on 19/03/22
 * @project IntelliJ IDEA
 */
public class SearchPageObjects {
    @FindBy(xpath="//h2[normalize-space()='Search flights']")
    public WebElement lblSearchFlightHeader;
    @FindBy(xpath=" //p[normalize-space()='One way']")
    public WebElement radioBtnOneWay;
    @FindBy(xpath="//p[normalize-space()='Round trip']")
    public WebElement radioBtnRoundTrip;
    @FindBy(xpath="//p[normalize-space()='Multi-city']")
    public WebElement radioBtnMultiCity;
    @FindBy(xpath="//h4[normalize-space()='From']/../div[1]/div/div/input")
    public WebElement txtFrom;
    @FindBy(xpath="//h4[normalize-space()='To']/../div[1]/div/div/input")
    public WebElement txtTo;
    @FindBy(xpath="//h4[normalize-space()='From']/../div[1]/div/div/../div[2]/ul/li")
    public WebElement fromSuggestionList;
    @FindBy(xpath="//h4[normalize-space()='To']/../div[1]/div/div/../div[2]/ul/li")
    public WebElement toSuggestionList;
    @FindBy(xpath = "//div[@class='DayPicker-Months']/div[1]")
    public WebElement datePickerFrom;
    @FindBy(xpath = "//div[@class='DayPicker-Months']/div[2]")
    public WebElement datePickerTo;
    @FindBy(xpath = "//h4[normalize-space()='Depart on']/../../div/../../div[3]/div/div/div/div/button")
    public WebElement dateSelector;
    @FindBy(xpath = "//h4[normalize-space()='Adults']/../div/select")
    public WebElement selectorAdults;
    @FindBy(xpath = "//h4[normalize-space()='Children']/../div/select")
    public WebElement selectorChildren;
    @FindBy(xpath = "//h4[normalize-space()='Infants']/../div/select")
    public WebElement selectorInfants;
    @FindBy(xpath = "//button[normalize-space()='Search flights']")
    public WebElement btnSearchFlight;
    @FindBy(css = ".to-ellipsis.o-hidden.ws-nowrap.fs-3.c-white")
    public WebElement errorMessage;
}

