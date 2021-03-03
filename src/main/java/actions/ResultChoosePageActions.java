package actions;


import entities.Film;
import enums.Genres;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import Pages.Pages;

public class ResultChoosePageActions {

    public List<Film> getAllFilmsOnPage(){
        List<Film> resultList = new ArrayList<>();
        for (int i = 1; i <= Pages.resultChooseGenrePage().getNumberOfElementsOnPage(); i++) {
            resultList.add(Pages.resultChooseGenrePage().getFilmByIndex(i));
        }
        return resultList;
    }

    public int getNumberOfFilmsWithGenre(Genres genre){
        int numberOfFilmsWithGenre = 0;
        for (int i = 1; i <= Pages.resultChooseGenrePage().getNumberOfElementsOnPage() ; i++) {
            if (Pages.resultChooseGenrePage().getFilmByIndex(i).getGenre().contains(genre.getValue().substring(1, 4).toLowerCase(Locale.ROOT))){
                numberOfFilmsWithGenre++;
            }
        }
        return numberOfFilmsWithGenre;
    }

}
