package TestDataClasses;


import org.testng.annotations.DataProvider;

public class logInTestDataProvider {

    @DataProvider()
    public Object[][] verifyLogInPageWithValidCredential_TESTDATA(){
        return new Object[][]{{"marwanrabie@gmail.com" , "Test123!"}};
    }

    @DataProvider
    public Object[][] verifyLogInPageWithValidUserNameAndInvalidPassword_TESTDATA(){
        return new Object[][]{{"marwanrabie@gmail.com" , "Test12312345"}};
    }


    @DataProvider
    public Object[][] testLogInPageWithInvalidUserNameAndValidPassword_TESTDATA(){
        return new Object[][]{{"marwan_____@gmail.com" , "Test123!"}};
    }


    @DataProvider
    public Object[][] testLogInPageWithInvalidCredential_TESTDATA(){
        return new Object[][]{{"abie@gmail.com" , "test12312234!"}};
    }

}
