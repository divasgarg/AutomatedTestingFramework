package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;  // For Chrome
import org.openqa.selenium.safari.SafariDriver;  // For Safari
import org.openqa.selenium.firefox.FirefoxDriver;  // For Firefox
import org.openqa.selenium.WebDriverException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.time.Duration;

public class BaseClass {
    protected WebDriver driver;

    @BeforeClass
    public void setup() {
        String browser = System.getProperty("browser", "safari");  // Default to Chrome if no browser specified

        switch (browser.toLowerCase()) {
            case "chrome":
                // Set up ChromeDriver
                System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");  // Optional: Provide path to chromedriver if needed
                driver = new ChromeDriver();
                break;

            case "safari":
                // SafariDriver doesn't need a path, it's included in macOS by default
                driver = new SafariDriver();
                break;

            default:
                throw new WebDriverException("Unsupported browser: " + browser);
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @AfterClass
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
