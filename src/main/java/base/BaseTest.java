package base;

import io.appium.java_client.android.AndroidDriver;
import util.Constants;
import util.reporter.Reporter;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;


public class BaseTest  {

    public static AndroidDriver driver = null;

public static void setup() throws MalformedURLException {
        DesiredCapabilities caps = DesiredCapabilities.android();
        caps.setCapability("appiumVersion", "1.20.2");
        caps.setCapability("deviceName","Google Pixel 3 XL GoogleAPI Emulator");
        caps.setCapability("deviceOrientation", "portrait");
        caps.setCapability("browserName", "Chrome");
        caps.setCapability("platformVersion","9.0");
        caps.setCapability("platformName","Android");
    //caps.setCapability("app","storage:filename=calc.apk");

//    DesiredCapabilities capabilities = new DesiredCapabilities();
//    capabilities.setCapability("platformName", "android");
//    capabilities.setCapability("deviceName", "pixel");
//    capabilities.setCapability("appiumVersion", "1.20.2");
//    capabilities.setCapability("platformVersion", "9.0");
//    capabilities.setCapability("udid", "emulator-5554");
//    capabilities.setCapability("browserName", "Chrome");


    //driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);

    driver = new AndroidDriver(new URL("https://testttttssss:49ed0b4a-7b35-4941-98ba-87f2771323f2@ondemand.eu-central-1.saucelabs.com:443/wd/hub"), caps);
    driver.get("https://kinokrad.co/");
}

    public static AndroidDriver getDriver(){
        return driver;
    }


    public static void teardown(){
        driver.quit();
    }



    }




