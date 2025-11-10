package Pages;

import org.openqa.selenium.By;
import org.testng.reporters.EmailableReporter2;
import utils.Driver;

public class CreateNewCustomer {
    private final By nameFieldLocator = By.name("j_idt70:name");
    private final By emailCustomerFieldLocator = By.name("j_idt70:email");
    private final By phoneFieldLocator = By.name("j_idt70:phone");
    private final By addressFieldLocator = By.name("j_idt70:address");
    private final By createACustomerButtonLocator = By.name("j_idt70:j_idt80");
    private final By cancelButtonLocator = By.xpath("//a[@class='btn btn-white']");

    public By getNameFieldLocator() {
        return nameFieldLocator;
    }

    public By getEmailCustomerFieldLocator() {
        return emailCustomerFieldLocator;
    }

    public By getPhoneFieldLocator() {
        return phoneFieldLocator;
    }

    public By getAddressFieldLocator() {
        return addressFieldLocator;
    }

    public By getCreateACustomerButtonLocator() {
        return createACustomerButtonLocator;
    }

    public By getCancelButtonLocator() {
        return cancelButtonLocator;
    }

    public void createNewCustomer(String name, String emailCustomer, String phone, String address) {
        enterName(name);
        enterEmailCustomer(emailCustomer);
        enterPhone(phone);
        enterAddress(address);
        clickOnCreateACustomerButton();
        clickOnCanCelButton();
    }

    public void enterName(String name) {
        Driver.WEB_DRIVER.findElement(nameFieldLocator).sendKeys(name);
    }

    public void enterEmailCustomer(String emailCustomer) {
        Driver.WEB_DRIVER.findElement(emailCustomerFieldLocator).sendKeys(emailCustomer);
    }

    public void enterPhone(String phone) {
        Driver.WEB_DRIVER.findElement(phoneFieldLocator).sendKeys(phone);
    }

    public void enterAddress(String address) {
        Driver.WEB_DRIVER.findElement(addressFieldLocator).sendKeys(address);
    }

    public void clickOnCreateACustomerButton() {
        Driver.WEB_DRIVER.findElement(createACustomerButtonLocator).click();
    }

    public void clickOnCanCelButton() {
        Driver.WEB_DRIVER.findElement(cancelButtonLocator).click();
    }
}
