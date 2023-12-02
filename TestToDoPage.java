import TestDataClasses.ToDoTestDataProvider;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestToDoPage extends BaseTest {
    @Test(priority = 1, dataProviderClass = ToDoTestDataProvider.class, dataProvider = "addItem_TESTDATA")
    @Description("Verify That User Can Add Valid Item")
    public void addItem(String itemValue) {
        int i = 0;
        if (i == 0) {
            logInPage.setEmail("marwanrabie@gmail.com");
            logInPage.setPassword("Test123!");
            logInPage.clickLogInButton();
            i++;
        }
        toDoPage.clickOnAddToDosButton();
        toDoPage.addToDoItem(itemValue);
        toDoPage.clickOnCreateToDoItemButton();
        Assert.assertTrue(toDoPage.getTextToDoItemsTask().contains(itemValue), "User Can Not Add A ToDo Task");
    }

    @Test(priority = 2)
    @Description("Verify That User Can Add Valid Item.")
    public void deleteItem() {
        int i = 0;
        if (i == 0) {
            logInPage.setEmail("marwanrabie@gmail.com");
            logInPage.setPassword("Test123!");
            logInPage.clickLogInButton();
            i++;
        }
        toDoPage.clickOnDeleteItem();
        Assert.assertTrue(toDoPage.getNoToDosChecker().isDisplayed());
    }

    @Test(priority = 3, dataProviderClass = ToDoTestDataProvider.class, dataProvider = "testValidUserName_TESTDATA")
    @Description("Verify UserName In ToDo Page Header")
    public void testValidUserName(String userName) throws InterruptedException {
        int i = 0;
        if (i == 0) {
            logInPage.setEmail("marwanrabie@gmail.com");
            logInPage.setPassword("Test123!");
            logInPage.clickLogInButton();
            i++;
        }
        toDoPage.testValueFromLocalStorage(userName);
        Assert.assertTrue(toDoPage.getWelcomeHeaderMessageElement().getText().toLowerCase().contains(userName.toLowerCase()));
    }
}