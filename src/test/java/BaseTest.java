import WebPages.BasePage;
import WebPages.LogInPage;
import WebPages.SignUpPage;
import WebPages.ToDoPage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class BaseTest {

    private final String URL = "http://localhost:3000/";
    BasePage basePage = new BasePage();
    LogInPage logInPage = new LogInPage();
    SignUpPage signUpPage = new SignUpPage();
    ToDoPage toDoPage = new ToDoPage();
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @BeforeMethod
    public void loadAUT() {
        driver.get("http://localhost:3000/");
        basePage.setDriver(driver);
    }

    @AfterMethod
    public void takeScreenShotForFailures(ITestResult testResult) {

        if (ITestResult.FAILURE == testResult.getStatus()) {
            TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
            File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
            File screenShotDirectory = new File(System.getProperty("user.dir") + "\\src\\main\\resources\\ScreenShotImages\\" + testResult.getName() + ".png");
            try {
                FileHandler.copy(source, screenShotDirectory);//In Selenium
            } catch (IOException ioException) {
                System.err.println(ioException.getMessage());
            }
        }

    }

}
