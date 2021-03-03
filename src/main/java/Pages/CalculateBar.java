package Pages;

import conf.Driver;

public class CalculateBar {

    private static final String numberButtonId = "com.google.android.calculator:id/digit_%s";
    private static final String addButtonId = "com.google.android.calculator:id/op_add";
    private static final String equalsButtonId = "com.google.android.calculator:id/eq";

    public void clickOnDigital(int number){
        Driver.getDriver().findElementById(String.format(numberButtonId, number)).click();
    }

    public void clickOnAdd(){
        Driver.getDriver().findElementById(addButtonId).click();
    }

    public void clickOnEquals(){
        Driver.getDriver().findElementById(equalsButtonId);
    }
}
