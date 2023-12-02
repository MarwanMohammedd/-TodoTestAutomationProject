package TestDataClasses;

import org.testng.annotations.DataProvider;

import java.util.Random;

public class SignUpTestDataProvider {

    private String randomEmail() {
        String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder(5);
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            sb.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
        }
        return sb.toString();
    }

    @DataProvider
    public Object[][] verifySignUpPageWithValidInputUser_TESTDATA() {
        return new Object[][]{{"Rock", "Rock", randomEmail()+"@gmail.com", "Rock123!", "Rock123!"}};
    }

    @DataProvider
    public Object[][] verifyFirstNameWithTwoCharacters_TESTDATA() {
        return new Object[][]{{"Ro", "Rock", randomEmail()+"@gmail.com", "Rock123!", "Rock123!"}};
    }

    @DataProvider
    public Object[][] verifyFirstNameWithNumbers_TESTDATA() {
        return new Object[][]{{"1234", "Rock",randomEmail()+"@gmail.com", "Rock123!", "Rock123!"}};
    }

    @DataProvider
    public Object[][] verifyFirstNameWithThreeCharacters_TESTDATA() {
        return new Object[][]{{"Roc", "Rock", randomEmail()+"@gmail.com", "Rock123!", "Rock123!"}};
    }

    @DataProvider
    public Object[][] verifyFirstNameWithFourCharacters_TESTDATA() {
        return new Object[][]{{"Rock", "Rock", randomEmail()+"@gmail.com", "Rock123!", "Rock123!"}};
    }

    @DataProvider
    public Object[][] verifyFirstNameWithEmptyValue_TESTDATA() {
        return new Object[][]{{"", "Rock", randomEmail()+"@gmail.com", "Rock123!", "Rock123!"}};
    }

    @DataProvider
    public Object[][] verifyLastNameWithTwoCharacters_TESTDATA() {
        return new Object[][]{{"Rock", "ck", randomEmail()+"@gmail.com", "Rock123!", "Rock123!"}};
    }

    @DataProvider
    public Object[][] verifyLastNameWithThreeCharacters_TESTDATA() {
        return new Object[][]{{"Rock", "ock",randomEmail()+"@gmail.com", "Rock123!", "Rock123!"}};
    }

    @DataProvider
    public Object[][] verifyLastNameWithFourCharacters_TESTDATA() {
        return new Object[][]{{"Rock", "Rock", randomEmail()+"@gmail.com", "Rock123!", "Rock123!"}};
    }

    @DataProvider
    public Object[][] verifyLastNameWithNumbers_TESTDATA() {
        return new Object[][]{{"Rock", "12345", randomEmail()+"@gmail.com", "Rock123!", "Rock123!"}};
    }

    @DataProvider
    public Object[][] verifyLastNameWithEmptyValue_TESTDATA() {
        return new Object[][]{{"Rock", "", randomEmail()+"@gmail.com", "Rock123!", "Rock123!"}};
    }

    @DataProvider
    public Object[][] verifyEmailWithEmptyValue_TESTDATA() {
        return new Object[][]{{"Rock", "Rock", "", "Rock123!", "Rock123!"}};
    }

    @DataProvider
    public Object[][] verifyEmailWithInvalidFormat_TESTDATA() {
        return new Object[][]{{"Rock", "Rock", randomEmail()+"#gmail.com", "Rock123!", "Rock123!"}};
    }


    @DataProvider
    public Object[][] verifyEmailWithInValidDomain_TESTDATA() {
        return new Object[][]{{"Rock", "Rock", randomEmail()+"@gmael.com", "Rock123!", "Rock123!"}};
    }

    @DataProvider
    public Object[][] verifyEmailWithMaximumCharacterLimit_TESTDATA() {
        return new Object[][]{{"Rock", "Rock", "azwsxedcrfvtgbyhnujmikcrfvtgbyhnujmikolp@gmail.com", "Rock123!", "Rock123!"}};
    }

    @DataProvider
    public Object[][] verifyEmailAlreadyExitsInDataBase_TESTDATA() {
        return new Object[][]{{"Rock", "Rock", "rock@gmail.com", "Rock123!", "Rock123!"}};
    }

    @DataProvider
    public Object[][] verifyPasswordWithEmpty_TESTDATA() {
        return new Object[][]{{"Rock", "Rock",randomEmail()+"@gmail.com", "", "Rock123!"}};
    }

    @DataProvider
    public Object[][] verifyPasswordInvalidFormat_TESTDATA() {
        return new Object[][]{{"Rock", "Rock",randomEmail()+"@gmail.com", "rock1#", "Rock123!"}};
    }

    @DataProvider
    public Object[][] verifyConformationPasswordWithEmpty_TESTDATA() {
        return new Object[][]{{"Rock", "Rock", randomEmail()+"@gmail.com", "Rock123!", ""}};
    }

    @DataProvider
    public Object[][] verifyConformationPasswordNotMatchWithPassword_TESTDATA() {
        return new Object[][]{{"Rock", "Rock", randomEmail()+"@gmail.com", "Rock123!", "Rock321!"}};
    }
}
