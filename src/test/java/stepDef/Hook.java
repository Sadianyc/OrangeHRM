package stepDef;

import base.Config;
import io.cucumber.java.Before;
import org.testng.util.Strings;

public class Hook extends Config {
    public static String url;
    public static String baseURL = System.getProperty("env");
    public static String browserType = System.getProperty("browser");

    public static String defaultBrowser = "ch";
    public static String defaultEnv = "qa";

    @Before
    public void openBrowser() {

        if (Strings.isNullOrEmpty(browserType)) {
            browserType = defaultBrowser;
        }
        if (Strings.isNullOrEmpty(baseURL)) {
            baseURL = defaultEnv;
        }

        driver = initDriver(browserType);
        switch (baseURL) {
            case "qa":
                url = "https://opensource-demo.orangehrmlive.com/index.php/auth/login";
                break;
            case "stage":
                url = "http://stage.orangehrm.com";
                break;
            case "prod":
                url = "http://taltektc.com";
                break;


        }

        driver.get(url);


    }
}
