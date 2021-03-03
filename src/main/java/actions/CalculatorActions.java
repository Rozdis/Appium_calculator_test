package actions;

import Pages.Pages;

public class CalculatorActions {

    public Integer addTwoNumbers(int first, int second){
        Pages.calculateBar().clickOnDigital(first);
        Pages.calculateBar().clickOnAdd();
        Pages.calculateBar().clickOnDigital(second);
        return Pages.resultBar().getResult();
    }
}
