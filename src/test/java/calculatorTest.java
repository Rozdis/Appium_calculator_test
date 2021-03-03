import actions.Actions;
import conf.Driver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import java.net.URL;
import io.appium.java_client.windows.WindowsDriver;

public class calculatorTest {
    private static AndroidDriver driver = null;
    private static final Integer expectedNumberFromAddition = 6;
    private static final String numberSizButtonId = "com.android.calculator2:id/digit_6";


    @BeforeClass
    public void setup() throws MalformedURLException {
        Driver.setup();
    }


    @Test(testName = "CalculatorAdditionTest")
    public void testAddition(){
        Assert.assertEquals(Actions.calculatorActions().addTwoNumbers(5, 1), expectedNumberFromAddition);
    }

    @AfterClass
    public void teardown(){
        Driver.teardown();
    }

}
