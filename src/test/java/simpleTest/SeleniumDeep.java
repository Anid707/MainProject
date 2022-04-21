package simpleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class SeleniumDeep {

    private String username = "koeluser06@testpro.io";
    private String password = "te$t$tudent";
    private WebDriver driver;

    @BeforeMethod
    public void startUp(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver = new ChromeDriver();
//        driver.manage().window().maximize();
        driver.get("https://bbb.testpro.io");
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();
    }

    @Test
    public void WebDriverXX() throws InterruptedException {
        driver.get("https://bbb.testpro.io");
        String title = driver.getTitle();
        System.out.println(title);
        String url = driver.getCurrentUrl();
        System.out.println(url);

        Thread.sleep(2000);
        driver.navigate().refresh();

        By emailFieldLocator = By.xpath("//*[@type='email1']");

//        WebElement emailField = driver.findElement(emailFieldLocator);
        List<WebElement> emailFields = driver.findElements(emailFieldLocator);
        System.out.println(emailFields.size());

        String source = driver.getPageSource();
        System.out.println(source);
    }

    @Test
    public void WebElementXX(){
        driver.get("https://bbb.testpro.io/");
        By emailFieldLocator = By.xpath("//form");
        WebElement forma = driver.findElement(emailFieldLocator);

        boolean isDisplayed= forma.isDisplayed();
        System.out.println(isDisplayed);
        boolean isSelected = forma.isSelected();
        System.out.println(isSelected);
        boolean isDisabled = forma.isEnabled();
        System.out.println(isDisabled);

        WebElement loginButton = forma.findElement(By.xpath("//*[@type='submit']"));
        String elementInnerText = loginButton.getText();
        System.out.println(elementInnerText);
        String textFromForma = forma.getText();
        System.out.println(textFromForma);

        String css = loginButton.getCssValue("font-size");
        System.out.println(css);

        String attr = loginButton.getAttribute("type");
        System.out.println(attr);

    }
    @Test
    public void testSpeed(){
        for (int i = 0;true;i++){
            System.out.println(i);
        }
    }
}
