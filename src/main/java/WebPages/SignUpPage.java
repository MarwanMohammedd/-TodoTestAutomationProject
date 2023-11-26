package WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
    SignUpPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    WebDriver driver;
    @FindBy(how = How.XPATH , using = "//input[@data-testid='first-name']")
    WebElement firstNameInputField;
    @FindBy(how = How.XPATH , using = "//input[@data-testid='last-name']")
    WebElement lastNameInputField;
    @FindBy(how = How.XPATH , using = "//input[@data-testid='email']")
    WebElement emailInputField;
    @FindBy(how = How.XPATH , using = "//input[@data-testid='password']")
    WebElement passwordInputField;
    @FindBy(how = How.XPATH , using = "//input[@data-testid='confirm-password']")
    WebElement confirmPasswordInputField;
    @FindBy(how = How.XPATH , using = "//input[@data-testid='submit']")
    WebElement signUpButton;

    public void setFirstNameInputField(String firstName){
        firstNameInputField.sendKeys(firstName);
    }

    public void setLastNameInputField(String lastName){
        lastNameInputField.sendKeys(lastName);
    }

    public void setPasswordInputField(String password){
        passwordInputField.sendKeys(password);
    }

    public void setConfirmPasswordInputField(String confirmPassword){
        confirmPasswordInputField.sendKeys(confirmPassword);
    }

    public ToDoPage clickOnSignUpButton(){
        signUpButton.click();
        return new ToDoPage(driver);
    }



}