package Pages;

import base.BasePage;
import entities.Film;
import locators.Locator;
import locators.XPath;

public class ResultChooseGenrePage extends BasePage {
    private static final Locator filmGenre = new XPath("//*/div/div[3]/div[3]/span[2]");
    private static final Locator filmTitles = new XPath("//*/div/div[1]/h2/a");

    public Film getFilmByIndex(int index){
        String genres = BasePage.getElements(filmGenre).get(index - 1).getText();
        String title = BasePage.getElements(filmTitles).get(index - 1).getText();
        return new Film(title, genres);
    }

    public int getNumberOfElementsOnPage(){
        return BasePage.getElements(filmGenre).size();
    }
}
