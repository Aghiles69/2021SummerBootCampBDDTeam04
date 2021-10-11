package pom;

import baseAPI.BaseClass;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass {
    public HomePage(){
        PageFactory.initElements(driver, this);
    }
}
