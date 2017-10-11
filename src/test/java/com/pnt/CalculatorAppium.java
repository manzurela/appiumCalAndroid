package com.pnt;

import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class CalculatorAppium {
    AndroidDriver driver;

    @Test
    public void addingTwoNo()throws Exception{
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("automationName","Appium");
        caps.setCapability("platformName","Android");
        caps.setCapability("platformVersion","6.0.1");
        caps.setCapability("deviceName","Galaxy S5");
        caps.setCapability("app","/Users/manzurelahi/Desktop/testingApk/app-debug.apk");
        //caps.setCapability("appPackage","com.example.nikonorov.gleb.simplecalculator");
        //caps.setCapability("appActivity",".MainActivity");
        AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(120L, TimeUnit.SECONDS);

        driver.findElement(By.id("nineButton")).click();
        driver.findElement(By.id("adButton")).click();
        driver.findElement(By.id("sixButton")).click();
        driver.findElement(By.id("equalsButton")).click();
        Assert.assertEquals("15",driver.findElement(By.id("outputLabel")).getText());
        Thread.sleep(10000);
        driver.quit();



    }


}

