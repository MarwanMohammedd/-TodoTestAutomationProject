import TestDataClasses.SignUpTestDataProvider;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSignUpPage extends BaseTest {


    @Test(priority = 1)
    @Description("Verify WebSite Access Successfully.")
    public void accessWebSite() {
        logInPage.clickSignUpHyperLink();
        Assert.assertTrue(signUpPage.getSignUpHeader().isDisplayed(), "Does Not Enter Sign Up Page!");
    }

    @Test(priority = 2, dataProviderClass = SignUpTestDataProvider.class, dataProvider = "verifySignUpPageWithValidInputUser_TESTDATA")
    @Description("Verify SignUp With Valid Inputs")
    public void verifySignUpPageWithValidInputUser(String firstName, String lastName, String email, String password, String confirmPassword) {
        logInPage.clickSignUpHyperLink();
        signUpPage.setFirstNameInputField(firstName);
        signUpPage.setLastNameInputField(lastName);
        signUpPage.setEmailInputField(email);
        signUpPage.setPasswordInputField(password);
        signUpPage.setConfirmPasswordInputField(confirmPassword);
        signUpPage.clickOnSignUpButton();
        Assert.assertEquals("No Available Todos", toDoPage.getNoToDosChecker().getText(), "User Not SignUp Successfully!");
        toDoPage.clickOnLogOutButton();
    }

    @Test(priority = 3, dataProviderClass = SignUpTestDataProvider.class, dataProvider = "verifyFirstNameWithTwoCharacters_TESTDATA")
    @Description("Verify First Name With Two Characters Input.")
    public void verifyFirstNameWithTwoCharacters(String firstName, String lastName, String email, String password, String confirmPassword) {
        logInPage.clickSignUpHyperLink();
        signUpPage.setFirstNameInputField(firstName);
        signUpPage.setLastNameInputField(lastName);
        signUpPage.setEmailInputField(email);
        signUpPage.setPasswordInputField(password);
        signUpPage.setConfirmPasswordInputField(confirmPassword);
        signUpPage.clickOnSignUpButton();
        Assert.assertEquals("First Name is required, and it should be more than 3 characters", signUpPage.getErrorMessageFirstNameInputField(), "User Signed Up Successfully!");
    }

    @Test(priority = 4, dataProviderClass = SignUpTestDataProvider.class, dataProvider = "verifyFirstNameWithNumbers_TESTDATA")
    @Description("Verify First Name With Numbers.")
    public void verifyFirstNameWithNumbers(String firstName, String lastName, String email, String password, String confirmPassword) {
        logInPage.clickSignUpHyperLink();
        signUpPage.setFirstNameInputField(firstName);
        signUpPage.setLastNameInputField(lastName);
        signUpPage.setEmailInputField(email);
        signUpPage.setPasswordInputField(password);
        signUpPage.setConfirmPasswordInputField(confirmPassword);
        signUpPage.clickOnSignUpButton();
        Assert.assertTrue(signUpPage.getErrorMessageFirstNameInputField().isDisplayed(), "User Signed Up Successfully!");
    }

    @Test(priority = 5, dataProviderClass = SignUpTestDataProvider.class, dataProvider = "verifyFirstNameWithThreeCharacters_TESTDATA")
    @Description("Verify First Name With Three Characters.")
    public void verifyFirstNameWithThreeCharacters(String firstName, String lastName, String email, String password, String confirmPassword) {
        logInPage.clickSignUpHyperLink();
        signUpPage.setFirstNameInputField(firstName);
        signUpPage.setLastNameInputField(lastName);
        signUpPage.setEmailInputField(email);
        signUpPage.setPasswordInputField(password);
        signUpPage.setConfirmPasswordInputField(confirmPassword);
        signUpPage.clickOnSignUpButton();
        Assert.assertEquals("First Name is required, and it should be more than 3 characters", signUpPage.getErrorMessageFirstNameInputField(), "User Signed Up Successfully!");
        toDoPage.clickOnLogOutButton();
    }

    @Test(priority = 6, dataProviderClass = SignUpTestDataProvider.class, dataProvider = "verifyFirstNameWithFourCharacters_TESTDATA")
    @Description("Verify First Name With Four Characters")
    public void verifyFirstNameWithFourCharacters(String firstName, String lastName, String email, String password, String confirmPassword) {
        logInPage.clickSignUpHyperLink();
        signUpPage.setFirstNameInputField(firstName);
        signUpPage.setLastNameInputField(lastName);
        signUpPage.setEmailInputField(email);
        signUpPage.setPasswordInputField(password);
        signUpPage.setConfirmPasswordInputField(confirmPassword);
        signUpPage.clickOnSignUpButton();
        Assert.assertTrue(toDoPage.getNoToDosChecker().isDisplayed(), "User Signed Up Successfully!");
        toDoPage.clickOnLogOutButton();
    }

    @Test(priority = 7, dataProviderClass = SignUpTestDataProvider.class, dataProvider = "verifyFirstNameWithEmptyValue_TESTDATA")
    @Description("Verify First Name With Empty Value")
    public void verifyFirstNameWithEmptyValue(String firstName, String lastName, String email, String password, String confirmPassword) {
        logInPage.clickSignUpHyperLink();
        signUpPage.setFirstNameInputField(firstName);
        signUpPage.setLastNameInputField(lastName);
        signUpPage.setEmailInputField(email);
        signUpPage.setPasswordInputField(password);
        signUpPage.setConfirmPasswordInputField(confirmPassword);
        signUpPage.clickOnSignUpButton();
        Assert.assertEquals("First Name is required, and it should be more than 3 characters", signUpPage.getErrorMessageFirstNameInputField(), "User Signed Up Successfully!");
        toDoPage.clickOnLogOutButton();
    }

    @Test(priority = 8, dataProviderClass = SignUpTestDataProvider.class, dataProvider = "verifyLastNameWithTwoCharacters_TESTDATA")
    @Description("Verify Last Name With Empty Value")
    public void verifyLastNameWithTwoCharacters(String firstName, String lastName, String email, String password, String confirmPassword) {
        logInPage.clickSignUpHyperLink();
        signUpPage.setFirstNameInputField(firstName);
        signUpPage.setLastNameInputField(lastName);
        signUpPage.setEmailInputField(email);
        signUpPage.setPasswordInputField(password);
        signUpPage.setConfirmPasswordInputField(confirmPassword);
        signUpPage.clickOnSignUpButton();
        Assert.assertEquals("Last Name is required, and it should be more than 3 characters", signUpPage.getErrorMessageLastNameInputField(), "User Signed Up Successfully!");
        toDoPage.clickOnLogOutButton();
    }

    @Test(priority = 9, dataProviderClass = SignUpTestDataProvider.class, dataProvider = "verifyLastNameWithThreeCharacters_TESTDATA")
    @Description("Verify Last Name With Three Characters")
    public void verifyLastNameWithThreeCharacters(String firstName, String lastName, String email, String password, String confirmPassword) {
        logInPage.clickSignUpHyperLink();
        signUpPage.setFirstNameInputField(firstName);
        signUpPage.setLastNameInputField(lastName);
        signUpPage.setEmailInputField(email);
        signUpPage.setPasswordInputField(password);
        signUpPage.setConfirmPasswordInputField(confirmPassword);
        signUpPage.clickOnSignUpButton();
        Assert.assertEquals("No Available Todos", toDoPage.getNoToDosChecker().getText(), "User Not SignUp Successfully!");
        toDoPage.clickOnLogOutButton();
    }

    @Test(priority = 10, dataProviderClass = SignUpTestDataProvider.class, dataProvider = "verifyLastNameWithFourCharacters_TESTDATA")
    @Description("Verify Last Name With Four Characters")
    public void verifyLastNameWithFourCharacters(String firstName, String lastName, String email, String password, String confirmPassword) {
        logInPage.clickSignUpHyperLink();
        signUpPage.setFirstNameInputField(firstName);
        signUpPage.setLastNameInputField(lastName);
        signUpPage.setEmailInputField(email);
        signUpPage.setPasswordInputField(password);
        signUpPage.setConfirmPasswordInputField(confirmPassword);
        signUpPage.clickOnSignUpButton();
        Assert.assertEquals("No Available Todos", toDoPage.getNoToDosChecker().getText(), "User Not SignUp Successfully!");
        toDoPage.clickOnLogOutButton();
    }

    @Test(priority = 11, dataProviderClass = SignUpTestDataProvider.class, dataProvider = "verifyLastNameWithNumbers_TESTDATA")
    @Description("Verify Last Name With Numbers")
    public void verifyLastNameWithNumbers(String firstName, String lastName, String email, String password, String confirmPassword) {
        logInPage.clickSignUpHyperLink();
        signUpPage.setFirstNameInputField(firstName);
        signUpPage.setLastNameInputField(lastName);
        signUpPage.setEmailInputField(email);
        signUpPage.setPasswordInputField(password);
        signUpPage.setConfirmPasswordInputField(confirmPassword);
        signUpPage.clickOnSignUpButton();
        Assert.assertFalse(toDoPage.getNoToDosChecker().isDisplayed(), "User Signed Up Successfully!");
        toDoPage.clickOnLogOutButton();
    }


    @Test(priority = 12, dataProviderClass = SignUpTestDataProvider.class, dataProvider = "verifyLastNameWithEmptyValue_TESTDATA")
    @Description("Verify Last Name With Empty Value")
    public void verifyLastNameWithEmptyValue(String firstName, String lastName, String email, String password, String confirmPassword) {
        logInPage.clickSignUpHyperLink();
        signUpPage.setFirstNameInputField(firstName);
        signUpPage.setLastNameInputField(lastName);
        signUpPage.setEmailInputField(email);
        signUpPage.setPasswordInputField(password);
        signUpPage.setConfirmPasswordInputField(confirmPassword);
        signUpPage.clickOnSignUpButton();
        Assert.assertEquals("Last Name is required, and it should be more than 3 characters", signUpPage.getErrorMessageLastNameInputField(), "User Signed Up Successfully!");
    }

    @Test(priority = 13, dataProviderClass = SignUpTestDataProvider.class, dataProvider = "verifyEmailWithEmptyValue_TESTDATA")
    @Description("Verify Email With Empty Value")
    public void verifyEmailWithEmptyValue(String firstName, String lastName, String email, String password, String confirmPassword) {
        logInPage.clickSignUpHyperLink();
        signUpPage.setFirstNameInputField(firstName);
        signUpPage.setLastNameInputField(lastName);
        signUpPage.setEmailInputField(email);
        signUpPage.setPasswordInputField(password);
        signUpPage.setConfirmPasswordInputField(confirmPassword);
        signUpPage.clickOnSignUpButton();
        Assert.assertEquals("Please Insert a correct Email format", signUpPage.getErrorMessageEmailInputField(), "User Signed Up Successfully!");
    }

    @Test(priority = 14, dataProviderClass = SignUpTestDataProvider.class, dataProvider = "verifyEmailWithInvalidFormat_TESTDATA")
    @Description("Verify Email With Invalid Format")
    public void verifyEmailWithInvalidFormat(String firstName, String lastName, String email, String password, String confirmPassword) {
        logInPage.clickSignUpHyperLink();
        signUpPage.setFirstNameInputField(firstName);
        signUpPage.setLastNameInputField(lastName);
        signUpPage.setEmailInputField(email);
        signUpPage.setPasswordInputField(password);
        signUpPage.setConfirmPasswordInputField(confirmPassword);
        signUpPage.clickOnSignUpButton();
        Assert.assertEquals("Please Insert a correct Email format", signUpPage.getErrorMessageEmailInputField(), "User Signed Up Successfully!");
    }

    @Test(priority = 15, dataProviderClass = SignUpTestDataProvider.class, dataProvider = "verifyEmailWithInValidDomain_TESTDATA")
    @Description("Verify Email With InValid Domain")
    public void verifyEmailWithInValidDomain(String firstName, String lastName, String email, String password, String confirmPassword) {
        logInPage.clickSignUpHyperLink();
        signUpPage.setFirstNameInputField(firstName);
        signUpPage.setLastNameInputField(lastName);
        signUpPage.setEmailInputField(email);
        signUpPage.setPasswordInputField(password);
        signUpPage.setConfirmPasswordInputField(confirmPassword);
        signUpPage.clickOnSignUpButton();
        Assert.assertFalse(toDoPage.getNoToDosChecker().isDisplayed(), "User Signed Up Successfully!");
    }

    @Test(priority = 16, dataProviderClass = SignUpTestDataProvider.class, dataProvider = "verifyEmailWithMaximumCharacterLimit_TESTDATA")
    @Description("Verify Email With Maximum Character Limit")
    public void verifyEmailWithMaximumCharacterLimit(String firstName, String lastName, String email, String password, String confirmPassword) {
        logInPage.clickSignUpHyperLink();
        signUpPage.setFirstNameInputField(firstName);
        signUpPage.setLastNameInputField(lastName);
        signUpPage.setEmailInputField(email);
        signUpPage.setPasswordInputField(password);
        signUpPage.setConfirmPasswordInputField(confirmPassword);
        signUpPage.clickOnSignUpButton();
        Assert.assertFalse(toDoPage.getNoToDosChecker().isDisplayed(), "User Signed Up Successfully!");
    }

    @Test(priority = 17, dataProviderClass = SignUpTestDataProvider.class, dataProvider = "verifyEmailAlreadyExitsInDataBase_TESTDATA")
    @Description("Verify Email Already Exits In DataBase")
    public void verifyEmailAlreadyExitsInDataBase(String firstName, String lastName, String email, String password, String confirmPassword) {
        logInPage.clickSignUpHyperLink();
        signUpPage.setFirstNameInputField(firstName);
        signUpPage.setLastNameInputField(lastName);
        signUpPage.setEmailInputField(email);
        signUpPage.setPasswordInputField(password);
        signUpPage.setConfirmPasswordInputField(confirmPassword);
        signUpPage.clickOnSignUpButton();
        Assert.assertEquals("Email is already exists in the Database", signUpPage.getErrorMessagePanalEmailInputField(), "User Signed Up Successfully!");
    }


    @Test(priority = 18, dataProviderClass = SignUpTestDataProvider.class, dataProvider = "verifyPasswordWithEmpty_TESTDATA")
    @Description("Verify Password With Empty")
    public void verifyPasswordWithEmpty(String firstName, String lastName, String email, String password, String confirmPassword) {
        logInPage.clickSignUpHyperLink();
        signUpPage.setFirstNameInputField(firstName);
        signUpPage.setLastNameInputField(lastName);
        signUpPage.setEmailInputField(email);
        signUpPage.setPasswordInputField(password);
        signUpPage.setConfirmPasswordInputField(confirmPassword);
        signUpPage.clickOnSignUpButton();
        Assert.assertEquals("Password must be Minimum eight characters, at least one uppercase letter, one lowercase letter, one number and one special character", signUpPage.getErrorMessagePasswordInputField(), "User Signed Up Successfully!");
    }

    @Test(priority = 19, dataProviderClass = SignUpTestDataProvider.class, dataProvider = "verifyPasswordInvalidFormat_TESTDATA")
    @Description("Verify Password Invalid Format")
    public void verifyPasswordInvalidFormat(String firstName, String lastName, String email, String password, String confirmPassword) {
        logInPage.clickSignUpHyperLink();
        signUpPage.setFirstNameInputField(firstName);
        signUpPage.setLastNameInputField(lastName);
        signUpPage.setEmailInputField(email);
        signUpPage.setPasswordInputField(password);
        signUpPage.setConfirmPasswordInputField(confirmPassword);
        signUpPage.clickOnSignUpButton();
        Assert.assertEquals("Password must be Minimum eight characters, at least one uppercase letter, one lowercase letter, one number and one special character", signUpPage.getErrorMessagePasswordInputField(), "User Signed Up Successfully!");
    }

    @Test(priority = 20, dataProviderClass = SignUpTestDataProvider.class, dataProvider = "verifyConformationPasswordWithEmpty_TESTDATA")
    @Description("Verify Conformation Password With Empty")
    public void verifyConformationPasswordWithEmpty(String firstName, String lastName, String email, String password, String confirmPassword) {
        logInPage.clickSignUpHyperLink();
        signUpPage.setFirstNameInputField(firstName);
        signUpPage.setLastNameInputField(lastName);
        signUpPage.setEmailInputField(email);
        signUpPage.setPasswordInputField(password);
        signUpPage.setConfirmPasswordInputField(confirmPassword);
        signUpPage.clickOnSignUpButton();
        Assert.assertEquals("Second password does not match the first Password", signUpPage.getErrorMessageConfirmationPasswordInputField(), "User Signed Up Successfully!");
    }

    @Test(priority = 21, dataProviderClass = SignUpTestDataProvider.class, dataProvider = "verifyConformationPasswordNotMatchWithPassword_TESTDATA")
    @Description("Verify Conformation Password Not Match With Password")
    public void verifyConformationPasswordNotMatchWithPassword(String firstName, String lastName, String email, String password, String confirmPassword) {
        logInPage.clickSignUpHyperLink();
        signUpPage.setFirstNameInputField(firstName);
        signUpPage.setLastNameInputField(lastName);
        signUpPage.setEmailInputField(email);
        signUpPage.setPasswordInputField(password);
        signUpPage.setConfirmPasswordInputField(confirmPassword);
        signUpPage.clickOnSignUpButton();
        Assert.assertEquals("Second password does not match the first Password", signUpPage.getErrorMessageConfirmationPasswordInputField(), "User Signed Up Successfully!");
    }

    @Test(priority = 22)
    @Description("Verify User Has An Account")
    public void verifyUserHasAnAccount() {
        signUpPage.clickOnDoYouHaveAccount();
        Assert.assertEquals("LOGIN TO APPLICATION", logInPage.getLogInPageHeaderText(), "User Does Not Navigate To LogIn Page Successfully!");

    }
}