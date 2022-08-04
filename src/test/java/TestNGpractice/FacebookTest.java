package TestNGpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FacebookTest {
    // go to facebook.com
public static WebDriver driver;
    @Test
    public void TestTheFacebookPage(){

        String text = driver.findElement(By.xpath("//h2")).getText();
        if (text.equals("Connect with friends and the world around you on Facebook.")){
            System.out.println("succesfull");
        }else {
            System.out.println("failed");
        }


    }

    // SECOND TEST CASE
    // Go to facebook.com
    // make sure create anaccont text is there

    @Test
    public void CreateAccountText(){

        String text= driver.findElement(By.xpath("//a[text()='Create new account']")).getText();
        if (text.equals("Create new account")){
            System.out.println("success");;
        }else {
            System.out.println("failed");
        }

    }
    @BeforeMethod
    public void settingupBroswer(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.fb.com");

    }
    @AfterMethod
    public void quitingTheBrowser(){
        driver.quit();
    }

}
