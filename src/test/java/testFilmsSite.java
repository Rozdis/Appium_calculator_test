import actions.Actions;
import base.BaseTest;
import conf.Driver;
import enums.Genres;
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
import Pages.Pages;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import java.net.URL;
import io.appium.java_client.windows.WindowsDriver;

public class testFilmsSite {
    private static final Integer expectedNumberFromAddition = 6;


    @BeforeClass
    public void setup() throws MalformedURLException {
        BaseTest.setup();
    }


    @Test
    public void checkGenreAnime() {
        Pages.sideBar().chooseGenre(Genres.ANIME);
        Assert.assertEquals(Actions.resultChoosePageActions().getNumberOfFilmsWithGenre(Genres.ANIME), Pages.resultChooseGenrePage().getNumberOfElementsOnPage());
    }

    @Test
    public void checkGenreBiography(){
        Pages.sideBar().chooseGenre(Genres.BIOGRAPHY);
        Assert.assertEquals(Actions.resultChoosePageActions().getNumberOfFilmsWithGenre(Genres.BIOGRAPHY), Pages.resultChooseGenrePage().getNumberOfElementsOnPage());
    }

    @Test
    public void checkGenreFights(){
        Pages.sideBar().chooseGenre(Genres.FIGHTERS);
        Assert.assertEquals(Actions.resultChoosePageActions().getNumberOfFilmsWithGenre(Genres.FIGHTERS), Pages.resultChooseGenrePage().getNumberOfElementsOnPage());
    }

    @AfterClass
    public void teardown(){
        BaseTest.teardown();
    }

}
