package WebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
    public LogInPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    WebDriver driver;
    @FindBy(how = How.XPATH, using = "//input[@data-testid='email']")
    WebElement userEmailInputField;
    @FindBy(how = How.XPATH, using = "//input[@data-testid='password']")
    WebElement passwordInputField;
    @FindBy(how = How.XPATH, using = "//button[@data-testid='submit']")
    WebElement logInButton;
    @FindBy(how = How.XPATH, using = "//h2[@class = 'sc-dlnjwi emTkDB']")
    WebElement logInPageHeader;
    //div[@class='MuiAlert-message']
    @FindBy(how = How.XPATH, using = "//div[@class='MuiAlert-message']")
    WebElement inValidLogInPanal;
    @FindBy(how = How.XPATH, using = "//div[@class='MuiAlert-message']")
    WebElement inValidLogInCombination;


    public void setEmail(String userEmail){
        userEmailInputField.sendKeys(userEmail);
    }

    public void setPassword(String userPassword){
        passwordInputField.sendKeys(userPassword);
    }

    public ToDoPage clickLogInButton(){
        logInButton.click();
        return new ToDoPage(driver);
    }

    public WebElement getLogInPageHeader(){
        return logInPageHeader;
    }

    public WebElement getInValidLogInPanal(){
        return inValidLogInPanal;
    }

}