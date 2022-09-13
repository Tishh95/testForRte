package testing;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

    public ChromeDriver setup(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        return driver;
    }

    @Given("I am on the Google home page")
    public void I_am_on_the_Google_home_page() {
        ChromeDriver driver = this.setup();
        driver.get("https://www.google.com");
        System.out.println("salut");
    }

    @After()
    public void closeBrowser() {
        ChromeDriver driver = this.setup();
        driver.quit();
    }

}
