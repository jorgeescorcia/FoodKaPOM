package basepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    protected static WebDriver driver;
    private static WebDriverWait wait;

    static {
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();



    }

    //Constructor para crear la instacia del driver una sola vez
    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
        PageFactory.initElements(driver,this);
        driver.manage().window().maximize();

    }


    public static void navegarAFoodKa(String url) {
        driver.get(url);
    }

    private WebElement Find(String locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    //Metodo click
    public void clickElement(WebElement webElement){
        webElement.click();
    }

    //Metodo Para Escrbir en los campos
    public void escribir(WebElement webElement, String texto){
        webElement.clear(); //Limpiar el campo de texto
        webElement.sendKeys(texto);
    }
    //Metodo cerra navegador
    public void cerrarNavegador(){
        driver.quit();

    }

    public String textFromElement(WebElement webElement){
        return webElement.getText();
    }
}
