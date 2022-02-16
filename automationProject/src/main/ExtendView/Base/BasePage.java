package Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Base.BaseTest;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class BasePage {

    public WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void waitForWebElement(WebElement webelement)
    {
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOf(webelement));

    }

    public void waitForInvisibility(WebElement webelement)
    {
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.invisibilityOf(webelement));

    }

    public void waitForClickability(WebElement webelement){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(webelement));

    }
}

//    public void initializeDriver() throws IOException
//    {
//        Properties prop = new Properties();
//        FileInputStream fis = new FileInputStream("C:\\Users\\Carlos Franco\\IdeaProjects\\automationPractice\\src\\main\\ExtendView\\Resources\\data.properties");
//
//        prop.load(fis);
//        String browserName = prop.getProperty("browser");
//        System.out.println(browserName);
//        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
////        String driverpath= System.getProperty("user.dir")+"/exe/chromedriver";
//
////        driver = new ChromeDriver();
//
//        if (browserName.equals("Chrome"))
//        {
//      //      System.setProperty("webdriver.chrome.driver", driverpath);
//    //        DesiredCapabilities dcap = DesiredCapabilities.chrome();
//
//  //          URL gamelan = new URL("http://localhost:49154/ws/hub");
////            driver = new RemoteWebDriver(gamelan,dcap);
//            driver = new ChromeDriver();
//        }
////
////        else if (browserName.equals("firefox"))
////        {
////            driver = new FirefoxDriver();
////        }






//
//    }
//}

