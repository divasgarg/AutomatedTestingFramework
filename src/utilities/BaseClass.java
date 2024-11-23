package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.WebDriverException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

    protected WebDriver driver;

    @BeforeClass
    public void setup() {
        String browser = System.getProperty("browser", "chrome");  // Default to chrome if not specified

        switch (browser.toLowerCase()) {
            case "chrome":
                WebDriverManager.chromedriver().setup();  // Auto-download ChromeDriver
                driver = new ChromeDriver();
                break;

            case "firefox":
                WebDriverManager.firefoxdriver().setup();  // Auto-download GeckoDriver
                driver = new FirefoxDriver();
                break;

            case "safari":
                driver = new SafariDriver();  // Safari does not require a separate WebDriver on macOS
                break;

            default:
                throw new WebDriverException("Unsupported browser: " + browser);
        }

        driver.manage().window().maximize();
    }

    @AfterClass
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
