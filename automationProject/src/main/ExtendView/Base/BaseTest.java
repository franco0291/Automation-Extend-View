package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import java.util.concurrent.TimeUnit;

public class BaseTest {
        public WebDriver driver;

        @BeforeMethod
        public void setup()
        {
            System.out.println("heeellllloooooo");
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Carlos Franco\\IdeaProjects\\chromedriver.exe");
            driver = new ChromeDriver();
          //  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        }

        @AfterMethod
        public void TearDown()

        {
            System.out.println("heeellllo2222");
            driver.quit();
        }

    }



