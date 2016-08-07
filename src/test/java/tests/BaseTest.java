package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;



public class BaseTest {
    public static WebDriver driver;

    @BeforeSuite
    public void initEnv() {
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver\\chromedriver.exe"); //Chrome driver
        /*WebDriver webDriver*/ this.driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    @AfterSuite(alwaysRun = true)
    public void evnSgut() {
        if (driver != null)
            driver.quit();
    }
}

