package Pages;

public class Pages {
    private static CalculateBar calculateBar;
    private static ResultBar resultBar;

    public static CalculateBar calculateBar(){
        if (calculateBar == null){
            calculateBar = new CalculateBar();
        }
        return calculateBar;
    }

    public static ResultBar resultBar(){
        if (resultBar == null){
            resultBar = new ResultBar();
        }
        return resultBar;
    }
}
