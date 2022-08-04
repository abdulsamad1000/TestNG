package Class01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testAnnotaionExample {
    public static WebDriver driver;

    // go to facebook.com
    // enter the password
    // enter the username
    // click login
    // make sure the error is there
    @Test
    public void testingForfbText(){
        String text = driver.findElement(By.xpath("//h2")).getText();
        if(text.equals("Connect with friends and the world around you on Facebook.")){
            System.out.println("succesfull");
        }
        else
        {
            System.out.println("failed");
        }

    }
    // go to facebook.com
    // make sure create account text is there
    @Test
    public void createAccountText(){

        String text = driver.findElement(By.xpath("//a[text()='Create new account']")).getText();
        if (text.equals("Create new account")) {
            System.out.println("success");
        } else {
            System.out.println("failure");

           }

        }
        @BeforeMethod
    public void settingUpBrowser(){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
//        getting the particular url
            driver.get("https://fb.com");
        }

        @AfterMethod
    public void quitingThebrowser(){
        driver.quit();
        }
    }


