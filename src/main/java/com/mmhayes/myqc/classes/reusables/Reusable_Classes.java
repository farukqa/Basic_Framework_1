package com.mmhayes.myqc.classes.reusables;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class Reusable_Classes {
    // all the reusable classes (like click, send keys, right click, taking screenshot etc will be listed in this class
    //getting a screenshot if the test case fails
    public static void getScreenshot(WebDriver driver, ExtentTest logger, String screenshotName) throws InterruptedException, IOException {

        String path = "C:\\Users\\fhasan\\eclipse-workspace\\MYQC_Final_Regression\\src\\Test_Results\\Selenium_Screenshots";
        String fileName = screenshotName + getDateTime() + ".jpeg";
        Thread.sleep(2000);
        File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(sourceFile, new File(path + fileName));
        String image = logger.addScreenCapture(path + fileName);
        logger.log(LogStatus.FAIL, "", image);

    }
}

