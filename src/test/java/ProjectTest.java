import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
//        driver.get(Helper.GITHUBURL);
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

    @Test
    public void testSeven(){
        WebDriver driver = new ChromeDriver();
        driver.get(Helper.SAUCE);

        WebElement loginField = driver.findElement(By.id(Helper.USERNAMEID));
        WebElement passwordField = driver.findElement(By.id(Helper.PASSWORDID));

        loginField.sendKeys(Helper.STANDARTUSER);
        passwordField.sendKeys(Helper.PASSWORD);
    }

    @Test
    public void testEight(){
        WebDriver driver = new ChromeDriver();
        driver.get(Helper.SAUCE);

        WebElement loginBtn = driver.findElement(By.id(Helper.LOGINBTNID));
        loginBtn.click();
    }

    @Test
    public void testNine() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get(Helper.SAUCE);

        WebElement loginField = driver.findElement(By.id(Helper.USERNAMEID));
        WebElement passwordField = driver.findElement(By.id(Helper.PASSWORDID));
        WebElement loginBtn = driver.findElement(By.id(Helper.LOGINBTNID));

        loginField.sendKeys(Helper.STANDARTUSER);
        Thread.sleep(3000);
        passwordField.sendKeys(Helper.PASSWORD);
        Thread.sleep(3000);
        loginBtn.click();
    }

    @Test
    public void testTen() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get(Helper.SAUCE);

        WebElement loginField = driver.findElement(By.id(Helper.USERNAMEID));
        WebElement passwordField = driver.findElement(By.id(Helper.PASSWORDID));
        WebElement loginBtn = driver.findElement(By.id(Helper.LOGINBTNID));

        Thread.sleep(3000);

        loginField.sendKeys(Helper.LOCKEDOUTUSER);
        passwordField.sendKeys(Helper.PASSWORD);
        loginBtn.click();

        Thread.sleep(3000);

        loginField.clear();
        passwordField.clear();
    }

}
