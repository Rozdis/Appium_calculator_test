package Pages;

import base.BasePage;
import base.BaseTest;
import enums.Genres;
import locators.Locator;
import locators.XPath;
import util.Formatter;
import org.openqa.selenium.By;

public class SideBar extends BasePage {
    private static final Locator genreButton = new XPath("//*[@id=\"sideLeft\"]/div[1]/ul[2]/li/a[contains(text(), '%s')]");



    public void chooseGenre(Genres genre){
        BaseTest.driver.findElement(By.xpath(Formatter.formatXPath("//*[@id=\"sideLeft\"]/div[1]/ul[2]/li/a[contains(text(), '%s')]", genre.getValue().substring(1,5)))).click();
    }

}
