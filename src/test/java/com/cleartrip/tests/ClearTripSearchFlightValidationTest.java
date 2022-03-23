package com.cleartrip.tests;

import com.cleartrip.pages.SearchPage;
import com.cleartrip.utils.BaseTest;
import org.testng.annotations.Test;

/**
 * @author in-vinaykumar.gupta on 22/03/22
 * @project IntelliJ IDEA
 */
public class ClearTripSearchFlightValidationTest extends BaseTest {


    @Test(description = "Verify error message is displayed if user try to search flight with invalid location.")
    public void verifyFlightSearchResultWithInvalidLocations() {
        SearchPage searchPage = new SearchPage(driver);
        searchPage.selectTripTypeAsOneWay().enterInvalidFromLocation("23434").enterInvalidToLocation("adadad").clickOnSearchFlightsInvalidCase().verifyInvalidAirportCityMessage();
    }
    @Test(description = "Verify error message is displayed if user try to search flight with same location.")
    public void verifyFlightSearchResultWithSameSourceAndDestination(){
        SearchPage searchPage = new SearchPage(driver);
        searchPage.selectTripTypeAsOneWay().enterFromLocation("Pune").enterToLocation("Pune").clickOnSearchFlightsInvalidCase().verifySameAirportCityMessage();
    }
    //wip
    @Test(description = "Verify user should not be able to search flight on the basis of past date")
    public void verifyFlightPastDateIsDisabledWhenUserTriesToSelectPastDate(){

    }
}
