package org.example;;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.time.Duration;
public class DriverManager extends Utils {
    LoadProp loadProp = new LoadProp();
    String browser = loadProp.getProperty("browser");
    public void closeBrowser() {
        driver.close();//to close browser
    }

    public void openBrowser() {
        //  String browser = loadProp.getProperty("browser");

        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Please type correct browser name");
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get(loadProp.getProperty("url"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
    }
}
