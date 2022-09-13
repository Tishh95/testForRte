package testing;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.testng.AssertJUnit.assertEquals;

public class Test2 {
    private final WebDriver driver;

    public Test2(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Given("open google")
    public void I_am_on_the_Google_home_page() {
        driver.get("https://www.google.com/");
    }

    @Then("google is open")
    public void google_is_open() {
        assertEquals( "https://www.google.com/" ,  driver.getCurrentUrl());
        System.out.println(driver.getCurrentUrl());
    }

    @When("I click on accept")
    public void clickaccept() {
        driver.findElement(By.id("L2AGLb")).click();
    }

   @Then("I enter the url as \"(.*)\"$")
    public void enterUrl(String arg1) {
       driver.findElement(By.name("q")).sendKeys(arg1,Keys.ENTER);
    }


}
