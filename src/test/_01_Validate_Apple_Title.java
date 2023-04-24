package test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class _01_Validate_Apple_Title {
    /*
    Test Case
    1. Go to "https://www.apple.com/"
    2. Validate the title of the age displayed as "Apple"
     */
    public static void main(String[] args) {



        //1. Set up driver

        System.setProperty("webdriver.chrome.driver", "/Users/leon.kuchman/IdeaProjects/selenium_intro/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //2. Validation
        driver.get("https://www.apple.com/");

        String expectedTitle = "Apple"; // from requirements
        String actualTitle = driver.getTitle(); // from application under development

        if(actualTitle.equals(expectedTitle)) System.out.println("Title validation PASSED");
        else System.out.println("Title validation FAILED!!!");

        //3. Quit driver
        driver.quit();


    }
}
