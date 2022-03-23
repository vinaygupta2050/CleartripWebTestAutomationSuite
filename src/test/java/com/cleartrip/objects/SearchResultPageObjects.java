package com.cleartrip.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author in-vinaykumar.gupta on 23/03/22
 * @project IntelliJ IDEA
 */
public class SearchResultPageObjects {
    @FindBy(xpath="//b[@class='fs-inherit c-inherit']")
    public WebElement lblTotalNumberOfAvailableFlights;
}
