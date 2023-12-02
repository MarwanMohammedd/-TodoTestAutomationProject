import TestDataClasses.logInTestDataProvider;
import WebPages.ToDoPage;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLogInPage extends BaseTest {

    @Test(priority = 1)
    @Description("Verify WebSite Open Correctly")
    public void VerifyWebSiteOpenCorrectly() {
        Assert.assertEquals(logInPage.getLogInPageHeaderText(), "LOGIN TO APPLICATION", "Fail Because Does Not Navigate to Web Page!");
    }

    @Test(priority = 2, dataProviderClass = logInTestDataProvider.class, dataProvider = "verifyLogInPageWithValidCredential_TESTDATA")
    @Description("Verify LogIn Page With Valid Credential")
    public void verifyLogInPageWithValidCredential(String userName, String userPassword) {
        logInPage.setEmail(userName);
        logInPage.setPassword(userPassword);
        ToDoPage toDoPage = logInPage.clickLogInButton();
        Assert.assertTrue(toDoPage.getNoToDosChecker().isDisplayed(), "Does Not Enter The Home Page!");
        toDoPage.clickOnLogOutButton();
        Assert.assertEquals(logInPage.getLogInPageHeaderText(), "LOGIN TO APPLICATION", "User Cannot LogOut Successfully!");
    }

    @Test(priority = 3, dataProviderClass = logInTestDataProvider.class, dataProvider = "verifyLogInPageWithValidUserNameAndInvalidPassword_TESTDATA")
    @Description("Verify LogIn Page With Valid UserName and Invalid Password")
    public void verifyLogInPageWithValidUserNameAndInvalidPassword(String userName, String userPassword) {
        logInPage.setEmail(userName);
        logInPage.setPassword(userPassword);
        logInPage.clickLogInButton();
        Assert.assertEquals(logInPage.getLogInPageHeaderText(), "LOGIN TO APPLICATION", "User LogIn Correctly!");
    }

    @Test(priority = 4, dataProviderClass = logInTestDataProvider.class, dataProvider = "testLogInPageWithInvalidUserNameAndValidPassword_TESTDATA")
    @Description("Verify LogIn Page With Invalid UserName and valid Password")
    public void testLogInPageWithInvalidUserNameAndValidPassword(String userName, String userPassword) {
        logInPage.setEmail(userName);
        logInPage.setPassword(userPassword);
        logInPage.clickLogInButton();
        Assert.assertEquals(logInPage.getLogInPageHeaderText(), "LOGIN TO APPLICATION", "User LogIn Correctly!");
    }

    @Test(priority = 5, dataProviderClass = logInTestDataProvider.class, dataProvider = "testLogInPageWithInvalidCredential_TESTDATA")
    @Description("Verify LogIn Page With Invalid Credential")
    public void testLogInPageWithInvalidCredential(String userName, String userPassword) {
        logInPage.setEmail(userName);
        logInPage.setPassword(userPassword);
        logInPage.clickLogInButton();
        Assert.assertEquals(logInPage.getLogInPageHeaderText(), "LOGIN TO APPLICATION", "User LogIn Correctly!");
    }
}