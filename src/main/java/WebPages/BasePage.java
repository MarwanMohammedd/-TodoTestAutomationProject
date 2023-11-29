package WebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * @Doc Common Actions Between Page Classes.
 */
public class BasePage {
    public static WebDriver driver;
    public static WebDriverWait wait;
    public void setDriver(WebDriver driver) {
        BasePage.driver = driver;
        wait = new WebDriverWait(BasePage.driver , Duration.ofSeconds(5));
    }

    protected WebElement find(By locator) {
        return driver.findElement(locator);
    }

    protected void click(By locator) {
        find(locator).click();
    }

    protected String getText(By locator) {
        return find(locator).getText();
    }

    protected void setData(By locator, String textData) {
        find(locator).sendKeys(textData);
    }
}