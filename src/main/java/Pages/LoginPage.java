package Pages;

import BasePage.BasePage;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    private final By emailLocator = By.id("campaigntypeform:email");
    private final By passLocator = By.id("campaigntypeform:pass");
    private final By loginLocator = By.name("campaigntypeform:j_idt14");


    public void Login(String email, String password) {
        type(emailLocator,email);
        type(passLocator, password);
        click(loginLocator);
    }


}
