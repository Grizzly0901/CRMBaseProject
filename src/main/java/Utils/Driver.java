package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Driver {

    public static final ThreadLocal<WebDriver> drivers = new ThreadLocal<>();

    public static void setDrivers(WebDriver driver) {
        drivers.set(driver);
    }

    public static WebDriver getDrivers() {
        return drivers.get();
    }

    public static WebDriverWait getWebDriverWait() {
        return new WebDriverWait(getDrivers(), Duration.ofSeconds(10));
    }

}
