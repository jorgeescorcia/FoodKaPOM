package foodkapage;

import basepage.BasePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FoodkaPage extends BasePage {
    @FindBy(xpath = "//input[@name=\"username\"]")
    private WebElement username;
    @FindBy (xpath = "//input[@name=\"password\"]")
    private WebElement password;
    @FindBy (xpath = "//input[@class='button' and @value='Log In']")
    private WebElement btnLogin;

    @FindBy (xpath = "//h1[contains(text(),'Accounts Overview')]")
    private WebElement textValidateLogin;
    @FindBy (xpath = "//p[contains(text(),'Please enter a username and password.')]")
    private WebElement textValidateLoginFailed;

    public void navegar_a_foodka(){
        navegarAFoodKa("https://www.google.com");
    }

    public FoodkaPage() {
        super(driver);
    }
}
