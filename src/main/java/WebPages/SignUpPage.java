package WebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SignUpPage extends BasePage {
    private final By firstNameInputFieldLocator = By.xpath("//input[@data-testid='first-name']");
    private final By lastNameInputFieldLocator = By.xpath("//input[@data-testid='last-name']");
    private final By emailInputFieldLocator = By.xpath("//input[@data-testid='email']");
    private final By passwordInputFieldLocator = By.xpath("//input[@data-testid='password']");
    private final By confirmPasswordInputFieldLocator = By.xpath("//input[@data-testid='confirm-password']");
    private final By signUpButtonLocator = By.xpath("//button[@data-testid='submit']");
    private final By signUpHeaderLocator = By.xpath("//h2[@data-testid='header']");
    private final By errorMessageFirstNameLocator = By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[1]/p");
    private final By errorMessageLastNameLocator = By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[2]/p");

    private final By errorMessageEmailLocator = By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[3]/p");

    private final By errorMessagePanalEmailLocator = By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[6]/div[2]");

    private final By errorMessagePasswordLocator = By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[4]/p");


    private final By errorMessageConfirmationPasswordLocator = By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[5]/p");

    private final By hyperLinkGoToLogInPageLocator = By.xpath("//h2[@data-testid='go-login']");

    public void setFirstNameInputField(String firstName) {
        setData(firstNameInputFieldLocator, firstName);
    }

    public void setLastNameInputField(String lastName) {
        setData(lastNameInputFieldLocator, lastName);
    }

    public void setEmailInputField(String email) {
        setData(emailInputFieldLocator, email);
    }

    public void setPasswordInputField(String password) {
        setData(passwordInputFieldLocator, password);
    }


    public WebElement getErrorMessageFirstNameInputField() {
        return find(errorMessageFirstNameLocator);
    }

    public String getErrorMessagePasswordInputField() {
        return getText(errorMessagePasswordLocator);
    }

    public String getErrorMessageLastNameInputField() {
        return getText(errorMessageLastNameLocator);
    }

    public String getErrorMessageEmailInputField() {
        return getText(errorMessageEmailLocator);
    }

    public String getErrorMessagePanalEmailInputField() {
        return getText(errorMessagePanalEmailLocator);
    }

    public String getErrorMessageConfirmationPasswordInputField() {
        return getText(errorMessageConfirmationPasswordLocator);
    }

    public void setConfirmPasswordInputField(String confirmPassword) {
        setData(confirmPasswordInputFieldLocator, confirmPassword);
    }


    public WebElement getSignUpHeader() {
        return find(signUpHeaderLocator);
    }

    public void clickOnSignUpButton() {
        click(signUpButtonLocator);
    }

    public void clickOnDoYouHaveAccount() {
        click(hyperLinkGoToLogInPageLocator);
    }
}