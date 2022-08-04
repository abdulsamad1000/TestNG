package Class01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.internal.annotations.IAfterMethod;

public class TestNGannotations {
    // writing down my first test case
    @Test // Test annotation is used to indicate that this is a test case
    public void firstTestCase(){
        System.out.println("Heyy! i am first test case");

        }

        // writing down the second test case
        @Test
    public void secondTestCase(){
            System.out.println("Heyy! i am a second test case");
        }
        @Test
        public void thirdTestCase(){
            System.out.println("Heyy! i am a third test case");
        }
        @BeforeMethod
    public void beforeMethod(){
            System.out.println("Heyy! i am a before method");
        }
        @AfterMethod
    public void afterMEthod(){
            System.out.println("Heyy! i am a after method");
        }

    }

