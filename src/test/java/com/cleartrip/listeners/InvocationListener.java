package com.cleartrip.listeners;

import com.cleartrip.utils.BaseTest;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.IInvokedMethodListener;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author in-vinaykumar.gupta on 23/03/22
 * @project IntelliJ IDEA
 */
public class InvocationListener implements ITestListener, IInvokedMethodListener {

    @Override
    public void onTestFailure(ITestResult result) {
        // TODO Auto-generated method stub
        BaseTest test = (BaseTest) result.getInstance();
        if(test==null)
        {
            return;
        }
        WebDriver driver = test.driver;
        File screenShot= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        ITestNGMethod method = result.getMethod();
        String methodName= method.getMethodName();
        System.out.println(method.getMethodName());
        System.out.println(method.getInstance());
        try {
            Path path = Paths.get("screenshot",methodName+".png");
            //FileHandler.copy(screenShot, new File("/Users/in-vinaykumar.gupta/Downloads/Projects/CleartripWebTestAutomationSuite/screenshot/"+method.getMethodName()+".png"));
            FileUtils.copyFile(screenShot, new File(path.toString()));
        //"+result.getInstanceName()+".
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        }
    }
}
