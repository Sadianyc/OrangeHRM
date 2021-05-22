package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Config {
    public static WebDriver driver;

    public static WebDriver initDriver (String driverType) {

        if (driverType.equalsIgnoreCase("ch")) {

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (driverType.equalsIgnoreCase("ff")) {

            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();

        }
        return driver;
    }
    }
