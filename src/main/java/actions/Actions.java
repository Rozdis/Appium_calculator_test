package actions;

public class Actions {
    private static CalculatorActions calculatorActions;

    public static CalculatorActions calculatorActions(){
        if(calculatorActions == null){
            calculatorActions = new CalculatorActions();
        }
        return calculatorActions;
    }
}
