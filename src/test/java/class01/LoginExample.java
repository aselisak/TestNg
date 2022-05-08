package class01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginExample {
    public static WebDriver driver;
    // login to syntax HRMS application with following credentials'
    //username: Admin
    //Password: 15155
    @Test(priority = 2)
    public void invalidCredentials1(){
     driver.findElement(By.id("txtUsername")).sendKeys("Admin");
     driver.findElement(By.id("txtPassword")).sendKeys("12345");
     driver.findElement(By.id("btnLogin")).click();
     String text = driver.findElement(By.id("spanMessage")).getText();
        System.out.println(text);
        System.out.println("A");
    }

    /*
    login into syntax HRMS application with following credentials
    userName: NoAdmin
    Password : 12345
     */
    @Test(priority = 1)
    public void invalidCredentials2(){
        driver.findElement(By.id("txtUsername")).sendKeys("NoAdmin");
        driver.findElement(By.id("txtPassword")).sendKeys("123456");
        driver.findElement(By.id("btnLogin")).click();
        String text = driver.findElement(By.id("spanMessage")).getText();
        System.out.println(text);
        System.out.println("B");

    }

    //precondition--> open browser and navigate to the url
    @BeforeMethod
    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
     driver = new ChromeDriver();
     driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
    }
    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }

}
