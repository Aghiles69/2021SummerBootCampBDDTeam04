package home;


import common.WebAPI;
import org.openqa.selenium.support.PageFactory;

import static home.WebElement.*;

public class HomePgFindBy extends WebAPI {
    public static HomePgFindBy homePgFindBy;
 public static void init(){
     homePgFindBy= PageFactory.initElements(driver,HomePgFindBy.class);
 }

}
