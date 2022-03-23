package com.cleartrip.utils;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 * @author in-vinaykumar.gupta on 22/03/22
 * @project IntelliJ IDEA
 */
public class Helper {
    public static String getPastDateWithDifferenceToNumberOfDays(int numberOfDays){
        LocalDate today = LocalDate.now();
        LocalDate pastDate = today.minus(Period.ofDays(numberOfDays));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE MMM dd yyyy");
        return pastDate.format(formatter);
    }
    public static String getFutureDateWithDifferenceToNumberOfDays(int numberOfDays){
        LocalDate today = LocalDate.now();
        LocalDate futureDate = today.plus(Period.ofDays(numberOfDays));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE MMM dd yyyy");
        return futureDate.format(formatter);
    }
    public static String getTodaysDate(){
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE MMM dd yyyy");
        return today.format(formatter);
    }

}
