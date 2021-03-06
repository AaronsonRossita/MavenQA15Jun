import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;

public class Helper {

    public static final String GOOGLEURL = "https://www.google.com/";
    public static final String MAKOURL = "https://www.mako.co.il/";
    public static final String GITHUBURL = "https://github.com/AaronsonRossita";

    public static final String SAUCE = "https://www.saucedemo.com/";

    public static final String USERNAMEID = "user-name";
    public static final String PASSWORDID = "password";
    public static final String LOGINBTNID = "login-button";

    public static final String PASSWORD = "secret_sauce";
    public static final String STANDARTUSER = "standard_user";
    public static final String LOCKEDOUTUSER = "locked_out_user";
    public static final String[] USERNAMES = {"standard_user","locked_out_user","problem_user","performance_glitch_user"};

    public static final String BLAHFOLDER = "/Users/aaronsonrossita/Desktop/blah/";
    public static final String JPG = ".jpg";

//    -------------------------------------    -------------------------------------
    public static final String INTERNETURL = "https://the-internet.herokuapp.com/dropdown";

    public static final String DROPDOWNID = "dropdown";

    public WebElement[] elements = new WebElement[3];


    public static WebElement findElement(WebDriver driver,String elementId){
//        WebElement element = driver.findElement(By.id(elementId));
//        return element;
        return driver.findElement(By.id(elementId));
    }

    public static WebElement[] findElements(WebDriver driver){
        WebElement[] arr = new WebElement[3];
        arr[0] = findElement(driver,USERNAMEID);
        arr[1] = findElement(driver,PASSWORDID);
        arr[2] = findElement(driver,LOGINBTNID);
        return arr;
    }

    public static void screenShot(WebDriver driver, String fileName) throws IOException {
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File(BLAHFOLDER + fileName + JPG));
    }


}
