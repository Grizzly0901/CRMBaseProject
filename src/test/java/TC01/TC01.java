package TC01;

import Pages.CreateNewCustomer;
import Pages.CustomerListView;
import TestBase.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import utils.Driver;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class TC01 extends TestBase {

    @Test
    public void verifyCreateCustomerPageElements() {
        // 1. Navigate to "Create Customer" page
        CustomerListView customerListView = new CustomerListView();
        customerListView.clickOnNewCustomerButton();

        // 2. Initialize Page Object for CreateNewCustomer
        CreateNewCustomer createCustomerPage = new CreateNewCustomer();

        SoftAssert softAssert = new SoftAssert();

        //Wait for loading
        WebDriverWait wait = new WebDriverWait(Driver.WEB_DRIVER, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(createCustomerPage.getNameFieldLocator()));

        System.out.println("Verify 'Create Customer' page is displayed");

        // 3. Verify all fields are Enabled & Blank by default
        WebElement nameField = Driver.WEB_DRIVER.findElement(createCustomerPage.getNameFieldLocator());
        WebElement emailField = Driver.WEB_DRIVER.findElement(createCustomerPage.getEmailCustomerFieldLocator());
        WebElement phoneField = Driver.WEB_DRIVER.findElement(createCustomerPage.getPhoneFieldLocator());
        WebElement addressField = Driver.WEB_DRIVER.findElement(createCustomerPage.getAddressFieldLocator());

        System.out.println("Verify all fields are Enabled & Blank by default");

        // 3.1. Name Field: Enabled & Blank by default
        softAssert.assertTrue(nameField.isEnabled(), "Name field is NOT enabled.");
        softAssert.assertEquals(nameField.getAttribute("value"), "", "Name field is NOT blank.");

        // 3.2. Email Field: Enabled & Blank by default
        softAssert.assertTrue(emailField.isEnabled(), "Email field is NOT enabled.");
        softAssert.assertEquals(emailField.getAttribute("value"), "", "Email field is NOT blank.");

        // 3.3. Phone Field: Enabled & Blank by default
        softAssert.assertTrue(phoneField.isEnabled(), "Phone field is NOT enabled.");
        softAssert.assertEquals(phoneField.getAttribute("value"), "", "Phone field is NOT blank.");

        // 3.4. Address Field: Enabled & Blank by default
        softAssert.assertTrue(addressField.isEnabled(), "Address field is NOT enabled.");
        softAssert.assertEquals(addressField.getAttribute("value"), "", "Address field is NOT blank.");

        // 4. Verify "Create a Customer" and "Cancel" buttons are Clickable
        WebElement createButton = Driver.WEB_DRIVER.findElement(createCustomerPage.getCreateACustomerButtonLocator());
        WebElement cancelButton = Driver.WEB_DRIVER.findElement(createCustomerPage.getCancelButtonLocator());

        System.out.println("Verify 'Create a Customer' and 'Cancel' buttons are Clickable");

        // 4.1. "Create a Customer" button is Clickable
        softAssert.assertTrue(createButton.isEnabled(), "'Create a Customer' button is NOT clickable (enabled).");

        // 4.2. "Cancel" button is Clickable (Enabled)
        softAssert.assertTrue(cancelButton.isEnabled(), "'Cancel' button is NOT clickable (enabled).");

        System.out.println("Passed");
    }
}

