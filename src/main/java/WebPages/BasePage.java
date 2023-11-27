package WebPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
/**
 * @Doc Common Actions Between Page Classes.*/
public class BasePage {
    static WebDriver driver ;
    public void setDriver(WebDriver driver){
        BasePage.driver = driver;
    }
    WebElement find(By locator){
        return  driver.findElement(locator);
    }
    void click(By locator){
        find(locator).click();
    }
    String getText(By locator){
        return find(locator).getText();
    }
    void setData(By locator , String textData){
        find(locator).sendKeys(textData);
    }
}