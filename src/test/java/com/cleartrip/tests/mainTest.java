package com.cleartrip.tests;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author in-vinaykumar.gupta on 23/03/22
 * @project IntelliJ IDEA
 */
public class mainTest {
    public static void main(String args[])
    {
        Path path = Paths.get("CleartripWebTestAutomationSuite","screenshot","test.txt");
        System.out.println(path);
    }
}
