package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class _02_Validate_Apple_URL {
    public static void main(String[] args) throws InterruptedException {

        /*
        TEST CASE
        1. Go to "https://www.apple.com/"
        2. Validate the URL
         */

        // 1. Set up driver
        System.setProperty("webdriver.chrome.driver", "/Users/leon.kuchman/IdeaProjects/selenium_intro/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //2. Validate driver
        driver.get("https://www.apple.com/");

        String expectedURL = "https://www.apple.com/";
        String actualURL = driver.getCurrentUrl();

        if(expectedURL.equals(actualURL)) System.out.println("URL validation PASSED!");
        else System.out.println("URL validation FAILED!!!");

        // 3. quit driver
        Thread.sleep(3000);
        driver.quit();


    }
}
