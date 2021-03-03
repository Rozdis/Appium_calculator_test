package Pages;

import conf.Driver;

public class ResultBar {
    private static final String resultField = "com.google.android.calculator:id/result_preview";

    public Integer getResult(){
        return Integer.parseInt(Driver.getDriver().findElementById(resultField).getText());
    }

}
