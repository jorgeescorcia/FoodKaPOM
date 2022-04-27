package setup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebUI {

    protected WebDriver driver;

    protected void setup() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://foodkaqadeploy.web.app/");
    }

    protected void quiteDriver(){
        driver.quit();
    }

}