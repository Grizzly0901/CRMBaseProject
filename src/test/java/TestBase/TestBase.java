package TestBase;

import Utils.Driver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestBase {

    @BeforeMethod
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--guest");
        Driver.setDrivers(new ChromeDriver(options));
        Driver.getDrivers().manage().window().maximize();
        Driver.getDrivers().get("http://14.176.232.213:8080/CRMweb/faces/login.xhtml");
        WebDriverWait wait = new WebDriverWait(Driver.getDrivers(), Duration.ofSeconds(5));
    }


    @AfterMethod
    public void cleanUp() {
        Driver.getDrivers().close();
    }
}
