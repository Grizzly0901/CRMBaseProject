package BasePage;

import Utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    protected WebDriver driver() {
        return Driver.getDrivers();
    }

    protected WebDriverWait getWait() {
        return Driver.getWebDriverWait();
    }

    protected void click(By locator) {
        getWait().until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    protected void type(By locator, String text) {
        getWait().until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(text);
    }

    protected String getText(By locator) {
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(locator)).getText();
    }

}
