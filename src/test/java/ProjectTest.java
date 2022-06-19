import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ProjectTest {

    @BeforeClass
    public static void setupClass(){
        WebDriverManager.chromedriver().setup();
    }

    @Test
    public void testOne(){
        WebDriver driver = new ChromeDriver();
    }

    @Test
    public void testTwo() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void testThree() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Thread.sleep(2000);
        driver.get("https://www.google.com/");
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void testFour() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Thread.sleep(2000);
        driver.get(Helper.GOOGLEURL);
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void testFive() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get(Helper.GOOGLEURL);
        Thread.sleep(2000);
        driver.navigate().to(Helper.GITHUBURL);
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        driver.quit();
    }

    @Test
    public void testSix() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get(Helper.GOOGLEURL);
        driver.manage().window().fullscreen();
        Thread.sleep(5000);
        driver.manage().window().minimize();
        Thread.sleep(4000);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.quit();
    }

}
