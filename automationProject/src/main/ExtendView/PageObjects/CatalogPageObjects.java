package PageObjects;

import Base.BasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CatalogPageObjects extends BasePage {
    @FindBy(xpath="//b[text()='My Workouts']")
    WebElement MyworkoutButton;




    public CatalogPageObjects(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void ClickOnMyworkoutButton()
    {

        waitForWebElement(MyworkoutButton);
        MyworkoutButton.click();
        }

}
