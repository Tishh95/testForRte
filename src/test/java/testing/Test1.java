package testing;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

    private final WebDriver driver;

    public Test1(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Given("I am on the Google home page")
    public void I_am_on_the_Google_home_page() {
        driver.get("https://www.google.com");
        System.out.println("salut");
    }



}
