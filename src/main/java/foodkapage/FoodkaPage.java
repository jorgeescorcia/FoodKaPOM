package foodkapage;

import basepage.BasePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class FoodkaPage extends BasePage {
    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/button[1]")
    private WebElement BTN_MIS_RESERVAS;

    @FindBy(xpath = "//input[@id=':r2:']")
    private WebElement INPUT_MIS_RESERVAS;

    @FindBy(xpath = "//body/div[2]/div[3]/div[1]/div[1]/div[1]/button[2]")
    private WebElement BTN_BUSCAR;

    @FindBy(xpath = "//body/div[2]/div[3]/div[1]/h2[1]/button[1]")
    private WebElement CERRAR_VENTANA;

    public FoodkaPage() {
        super(driver);
    }


    public void navegar_a_foodka(){
        navegarAFoodKa("https://foodkaqadeploy.web.app/");
    }

    public void clickBtnMisReservas(){
        clickElement(BTN_MIS_RESERVAS);
    }
    public void escribirCampoReserva(){
       escribir(INPUT_MIS_RESERVAS,"86ae5c8d-d");
    }

    public void clickBtnBuscar(){
        clickElement(BTN_BUSCAR);
    }
    public void cerrarVentanaReservas(){
        clickElement(CERRAR_VENTANA);
    }



}
