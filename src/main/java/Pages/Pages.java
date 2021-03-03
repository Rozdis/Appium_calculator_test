package Pages;

public class Pages {

    private static SideBar sideBar;
    private static ResultChooseGenrePage resultChooseGenrePage;




    public static SideBar sideBar(){
        if(sideBar == null)
            sideBar = new SideBar();
        return sideBar;
    }

    public static ResultChooseGenrePage resultChooseGenrePage(){
        if(resultChooseGenrePage == null)
            resultChooseGenrePage = new ResultChooseGenrePage();
        return resultChooseGenrePage;
    }

}
