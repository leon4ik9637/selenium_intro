package test;

public class Intro {
    /*
    NAVIGATION

    The difference between navigate().to(url) & get(url)
    - get(url) is having some implicit wait implemented with
    it, and it will wait for web elements to be loaded
    - navigate().to(url) is caching your browser history and
    might be more useful when you need to keep navigation
    history

    Thread.sleep(millis); // never used for work, only used for demo purposes

    Frontend developers -> ReactJS - Angular
    Backend developers  -> Springboot (Java)



    Testing Framework
    BDD -> Behavior Driven Development Framework
    TDD -> Test Driven Development Framework
    DDD -> Data Driven Development Framework
    Hybrid
    Karate

    SELENIUM
    - Selenium automates browsers
    - It is open source

    RECAP:
    1. Set driver
        System.setProperty("webdriver.chrome.driver", "path")

        WebDriver driver = new ChromeDriver(); // launch browser

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    2. Validation
        driver.get(url); // application url

    3. Teardown
        driver.quit();

    NAVIGATION
    1. driver.navigate().to(url);
    2. driver.navigate().refresh();
    3. driver.navigate().back();
    3. driver.navigate().forward();

    SELENIUM COMPONENTS
    1. Selenium IDE (it can only be used to automate FireFox)
        IDE - Integrated Development Environment
    2. Selenium Grid -> helps with parallel execution and decrease
    the testing time (CAN BE LEARNT ON YOUR OWN)
    3. Selenium RC
    4. Selenium WebDriver -> is used to automate browsers

    NOTE: The language that Selenium IDE uses is Selenese
    NOTE
    Selenium IDE is not safe and reliable to use - we use
    IntelliJ

    SELENIUM WEBDRIVER
    - Selenium is a tool to automate testing for web
    applications























     */
}
