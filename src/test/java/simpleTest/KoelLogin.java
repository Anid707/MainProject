package simpleTest;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class KoelLogin {
    private String username = "koeluser06@testpro.io";
    private String password = "te$t$tudent";
    private WebDriver driver;
    private WebDriverWait wait;
    private FluentWait<WebDriver> fluentWait;

    @BeforeMethod
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10, 200);
        fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(200))
                .ignoring(NoSuchElementException.class)
                .ignoring(ElementClickInterceptedException.class)
                .ignoring(StaleElementReferenceException.class);
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://bbb.testpro.io");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();
    }

    @Test
    public void loginToKoel() throws InterruptedException {
        By emailFieldLocator = By.xpath("//*[@type='email']");
        WebElement emailField = driver.findElement(emailFieldLocator);

        By passwordFieldLocator = By.cssSelector("[type='password']");
        WebElement passwordField = driver.findElement(passwordFieldLocator);

        By loginButtonLocator = By.tagName("button");
        WebElement loginButton = driver.findElement(loginButtonLocator);

        emailField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();


        By homeIconLocator = By.className("home");


//        wait.until(ExpectedConditions.visibilityOfElementLocated(homeIconLocator));
        //---------------------------------------------------
        boolean check = true;
        for (int i=0;i<50;i++){
            try{
                System.out.println(i);
                if(driver.findElement(homeIconLocator).isDisplayed()){
                    check = false;
                    break;
                }
            } catch (NoSuchElementException | StaleElementReferenceException err){
                Thread.sleep(50);
            }
        }
        if(check){
            throw new NoSuchElementException("Element NOT FOUND");
        }


        //---------------------------------------------------

        WebElement homeIcon = driver.findElement(homeIconLocator);
        Assert.assertTrue(homeIcon.isDisplayed());
    }

    @Test
    public void loginToKoel_incorrectCredentials() throws InterruptedException {

        By emailFieldLocator = By.xpath("//*[@type='email']");
        WebElement emailField = driver.findElement(emailFieldLocator);

        By passwordFieldLocator = By.cssSelector("[type='password']");
        WebElement passwordField = driver.findElement(passwordFieldLocator);

        By loginButtonLocator = By.tagName("button");
        WebElement loginButton = driver.findElement(loginButtonLocator);

        emailField.sendKeys(username);
        passwordField.sendKeys("wrongPassword");
        loginButton.click();

        By errorLocator = By.cssSelector(".error");
        fluentWait.until(x->x.findElement(errorLocator).isDisplayed());

        Assert.assertTrue(driver.findElement(errorLocator).isDisplayed());
    }
}
