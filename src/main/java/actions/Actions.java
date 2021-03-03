package actions;

public class Actions {

    private static ResultChoosePageActions resultChoosePageActions;




    public static ResultChoosePageActions resultChoosePageActions() {
        if (resultChoosePageActions == null) {
            resultChoosePageActions = new ResultChoosePageActions();
        }
        return resultChoosePageActions;
    }
}

