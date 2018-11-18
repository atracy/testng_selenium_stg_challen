package Helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class BrowserFactory {

    static WebDriver driver;

    public static WebDriver startBrowser(String browserName, String url){

        if (browserName.equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
            driver = new ChromeDriver();
            System.out.println("chrome Browser Selected");
        }
        else if (browserName.equalsIgnoreCase("firefox"))
        {
            System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\geckodriver.exe");
            driver = new FirefoxDriver();
            System.out.println("Chrome Browser Selected");
        }
        else if (browserName.equalsIgnoreCase("ie"))
        {
            System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\IEDriverServer32Bit.exe");
            driver = new InternetExplorerDriver();
            System.out.println("IE Browser Selected");
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
        return driver;
    }


}
