package util;


import org.openqa.selenium.WebElement;

import java.util.List;

public class Formatter {

    /**
     * Escape special characters for HTML logs
     *
     * @param string string with unescaped characters
     * @return string with escaped characters
     */
    public static String escapeCharacters(String string) {
        return string.replace("&", "&#38;");
    }

    /**
     * Rounds to 2 digits after point.
     */
    public static float roundFractional(float number) {
        return roundFractional(number, 2);
    }

    public static float roundFractional(float number, int precision) {
        return (float) Math.round(number * (float) Math.pow(10, precision)) / (float) Math.pow(10, precision);
    }

    public static double roundFractional(double number) {
        return roundFractional(number, 2);
    }

    public static double roundFractional(double number, int precision) {
        return Math.round(number * Math.pow(10, precision)) / Math.pow(10, precision);
    }

    public static String unformatPhone(String formatterPhone) {
        return formatterPhone.replace("(", "").replace(")", "").replace("-", "").replace(" ", "");
    }

    public static String formatXPath(String xpath, String wordToInsert){
        return String.format(xpath, wordToInsert);
    }

    public static String unitListToString(List<WebElement> stringList){
        StringBuilder resultString = new StringBuilder();
        for (WebElement string:
             stringList) {
            resultString.append(string.getText()).append(" ");
        }
        return resultString.toString();
    }


}
