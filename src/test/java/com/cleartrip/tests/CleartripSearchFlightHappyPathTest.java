package com.cleartrip.tests;

import com.cleartrip.pages.SearchPage;
import com.cleartrip.utils.BaseTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * @author in-vinaykumar.gupta on 21/03/22
 * @project IntelliJ IDEA
 */
@Listeners(com.cleartrip.listeners.InvocationListener.class)
public class CleartripSearchFlightHappyPathTest extends BaseTest {
    @Test(description = "Verify whether user is able to book a one way flight on the same date.")
    public void verifyWithValidCityAndValidTodaysDate() {
        SearchPage searchPage = new SearchPage(driver);
        searchPage.selectTripTypeAsOneWay().enterFromLocation("Pune").enterToLocation("Mumbai").
                selectTodaysDate().selectNumberOfAdults(1).clickOnSearchFlight().verifySearchResultPage();
    }
    @Test(description = "Verify whether user is able to book a one way flight on the future date.")
    public void verifyWithValidCityAndValidFutureDate(){
        SearchPage searchPage = new SearchPage(driver);
        searchPage.selectTripTypeAsOneWay().enterFromLocation("Pune").enterToLocation("Mumbai").
                selectFutureDate(1).selectNumberOfAdults(1).clickOnSearchFlight().verifySearchResultPage();
    }
    @Test(description = "Verify whether user is able to book a one way flight with maximum number of passenger i.e 9")
    public void verifySearchResultWithMaximumNumberOfPassengersWithAdult(){
        SearchPage searchPage = new SearchPage(driver);
        searchPage.selectTripTypeAsOneWay().enterFromLocation("Pune").enterToLocation("Mumbai").
                selectFutureDate(1).selectNumberOfAdults(9).clickOnSearchFlight().verifySearchResultPage();
    }
    @Test(description = "Verify whether user is able to book a one way flight with maximum number of passenger i.e 9 which includes 7 adult and 2 children")
    public void verifySearchResultWithMaximumNumberOfPassengersWithAdultAndChildren(){
        SearchPage searchPage = new SearchPage(driver);
        searchPage.selectTripTypeAsOneWay().enterFromLocation("Pune").enterToLocation("Mumbai").
                selectFutureDate(1).selectNumberOfAdults(7).selectNumberOfChildren(2).clickOnSearchFlight().verifySearchResultPage();
    }

}
