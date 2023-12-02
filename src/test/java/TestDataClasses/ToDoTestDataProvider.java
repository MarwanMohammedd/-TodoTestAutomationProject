package TestDataClasses;
import org.testng.annotations.DataProvider;
public class ToDoTestDataProvider {
    @DataProvider
    public Object[][] addItem_TESTDATA() {
        return new Object[][]{{"asd"}, {"    "}, {"as"}, {"132"}};
    }

    @DataProvider
    public Object[][] testValidUserName_TESTDATA() {
        return new Object[][]{{"user"}, {"  "}, {"Na"}, {"Man"}, {"123"}};
    }
}