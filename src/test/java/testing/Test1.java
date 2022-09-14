package testing;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.testng.AssertJUnit.assertEquals;

public class Test1 {

    private final WebDriver driver;

    public Test1(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Given("I am on the Google home page")
    public void I_am_on_the_Google_home_page() {
        driver.get("https://www.google.com");
    }

    @Then("is google open")
    public void is_google_open() {
        assertEquals( "https://www.google.com/" ,  driver.getCurrentUrl());
        System.out.println(driver.getCurrentUrl());
    }



}
