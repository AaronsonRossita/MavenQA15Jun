import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

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
        driver.quit();
    }

    @Test
    public void testEight(){
        WebDriver driver = new ChromeDriver();
        driver.get(Helper.SAUCE);

        WebElement loginBtn = driver.findElement(By.id(Helper.LOGINBTNID));
        loginBtn.click();
        driver.quit();
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
        driver.quit();
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

    @Test
    public void testEleven() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get(Helper.SAUCE);

        WebElement loginField = driver.findElement(By.id(Helper.USERNAMEID));
        WebElement passwordField = driver.findElement(By.id(Helper.PASSWORDID));
        WebElement loginBtn = driver.findElement(By.id(Helper.LOGINBTNID));

        loginField.sendKeys("blah");
        passwordField.sendKeys("blah");
        loginBtn.click();
        Thread.sleep(3000);

//        driver.navigate().refresh();

//        loginField.clear();
//        passwordField.clear();

        loginField.sendKeys("blah blah");

        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void testTwelve() throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get(Helper.SAUCE);

        WebElement loginField = driver.findElement(By.id(Helper.USERNAMEID));
        loginField.sendKeys("blah");

        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); // ctrl + c , copy
        FileUtils.copyFile(file,new File("/Users/aaronsonrossita/Desktop/screenshot.jpg")); // ctrl + v

        driver.quit();
    }

    @Test
    public void testThirteen() throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get(Helper.SAUCE);

        WebElement loginField = driver.findElement(By.id(Helper.USERNAMEID));
        WebElement passwordField = driver.findElement(By.id(Helper.PASSWORDID));
        WebElement loginBtn = driver.findElement(By.id(Helper.LOGINBTNID));

        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File(Helper.BLAHFOLDER + "screenshot1" + Helper.JPG));

        loginField.sendKeys(Helper.STANDARTUSER);
        passwordField.sendKeys(Helper.PASSWORD);
        loginBtn.click();

        file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File(Helper.BLAHFOLDER + "screenshot2" + Helper.JPG));

        driver.quit();
    }

    @Test
    public void testFourteen() throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get(Helper.SAUCE);

        for (int i = 0; i < Helper.USERNAMES.length; i++) { // 0 1 2 3
            WebElement loginField = driver.findElement(By.id(Helper.USERNAMEID));
            WebElement passwordField = driver.findElement(By.id(Helper.PASSWORDID));
            WebElement loginBtn = driver.findElement(By.id(Helper.LOGINBTNID));

            loginField.sendKeys(Helper.USERNAMES[i]);
            passwordField.sendKeys(Helper.PASSWORD);
            loginBtn.click();

            File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file,new File(Helper.BLAHFOLDER + "screen" + i + Helper.JPG));

            driver.navigate().to(Helper.SAUCE);
        }
        driver.quit();
    }

    @Test
    public void testFifteen() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get(Helper.INTERNETURL);
        WebElement element = driver.findElement(By.id(Helper.DROPDOWNID));
        Select dropdown = new Select(element);
        dropdown.selectByIndex(1);
    }

    @Test
    public void testSixteen(){
        WebDriver driver = new ChromeDriver();
        driver.get(Helper.SAUCE);

//        WebElement loginField = driver.findElement(By.cssSelector("#user-name"));
        WebElement loginField = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
        loginField.sendKeys("blah");
    }

}
