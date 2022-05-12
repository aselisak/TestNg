package class03;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest {
    WebDriver driver;
    @BeforeMethod(alwaysRun = true)
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
    }
    @Test(groups = "regression")
    public void VerifyCredentials() {

        SoftAssert soft = new SoftAssert();

        String expectedText = "Invalid credentials";
        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("123456");
        boolean displayed =username.isDisplayed();
        driver.findElement(By.id("txtPassword")).sendKeys("123456");
        driver.findElement(By.id("btnLogin")).click();
        String text = driver.findElement(By.id("spanMessage")).getText();
        soft.assertEquals(text,expectedText);


        //validate to display is true or not
        System.out.println("Hello world");
        soft.assertTrue(displayed);

        //check all assertions

        soft.assertAll();

    }


    @Test(groups = "regression")
    public void VerifyCredentials1() throws InterruptedException {

        SoftAssert soft = new SoftAssert();

        String expectedText = "Invalid credentials";
        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("123456");
        Thread.sleep(2000);
        boolean displayed =username.isDisplayed();
        driver.findElement(By.id("txtPassword")).sendKeys("123456");
        Thread.sleep(2000);
        driver.findElement(By.id("btnLogin")).click();
        Thread.sleep(2000);
        String text = driver.findElement(By.id("spanMessage")).getText();
        soft.assertEquals(text,expectedText);


        //validate to display is true or not
        System.out.println("Hello world");
        soft.assertTrue(displayed);

        //check all assertions

        soft.assertAll();

    }

    @AfterMethod(alwaysRun = true)
    public void closeBrowser1() {
        driver.quit();
    }
}


