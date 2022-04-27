package basepage;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BasePage {


    protected  WebDriver driver;
    private static WebDriverWait wait;


/*ublic static void setUp() {
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
       //wait = new WebDriverWait(driver,10);

    }*/

    //Constructor para crear la instacia del driver una sola vez
    public BasePage() {
        this.driver = WebDriverManager.chromedriver().create();
        PageFactory.initElements(driver,this);
        //driver.manage().window().maximize();
       //wait = new WebDriverWait(driver, 10);
    }

    public void navegarAFoodKa(String url) {
        driver.get(url);
    }

    private WebElement Find(String locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }



    //Metodo Para Escrbir en los campos
    public void escribir(WebElement webElement, String texto){
        webElement.clear(); //Limpiar el campo de texto
        webElement.sendKeys(texto);
    }

    //Metodo click
    public void clickElement(WebElement webElement){
        webElement.click();
    }

    //Metodo cerra navegador
    public void cerrarNavegador(){
        driver.close();

    }

    public String textFromElement(WebElement webElement){
        return webElement.getText();
    }
}
