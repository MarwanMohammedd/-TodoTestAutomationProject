package WebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LogInPage extends BasePage {

    private final By userEmailInputFieldLocator = By.xpath("//input[@data-testid='email']");
    private final By passwordInputFieldLocator = By.xpath("//input[@data-testid='password']");
    private final By logInButtonLocator = By.xpath("//button[@data-testid='submit']");
    private final By logInPageHeaderLocator = By.xpath("//h2[@class = 'sc-dlnjwi emTkDB']");
    private final By inValidLogInPanalLocator = By.xpath("//div[@class='MuiAlert-message']");
    private final By inValidLogInCombinationLocator = By.xpath("//div[@class='MuiAlert-message']");
    private final By signUpHyperLinkLocator = By.xpath("//h2[@data-testid='signup']");

    private final By inValidPasswordMessage = By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[2]/p");
    private final By invalidMessagePanal = By.xpath("//div[@data-testid='error-alert']");

    private final By signUpButtonLocator = By.linkText("Login");
    public void setEmail(String userEmail) {
        setData(userEmailInputFieldLocator, userEmail);
    }

    public void setPassword(String userPassword) {
        setData(passwordInputFieldLocator, userPassword);
    }

    public ToDoPage clickLogInButton() {
        click(logInButtonLocator);
        return new ToDoPage();
    }

    public String getLogInPageHeaderText() {
        return getText(logInPageHeaderLocator);
    }

    public WebElement getInValidLogInPanal() {
        return find(inValidLogInPanalLocator);
    }

    public String getinvalidMessagePanal() {
        return getText(invalidMessagePanal);
    }

    public String getInvalidPasswordMessage() {
        return getText(inValidPasswordMessage);
    }

    public WebElement getLogInHeaderElement() {
        return find(logInPageHeaderLocator);
    }

    public void clickOnSignUpButtonLocator(){
        click(signUpButtonLocator);
    }

    public void clickSignUpHyperLink() {
        click(signUpHyperLinkLocator);
    }
}