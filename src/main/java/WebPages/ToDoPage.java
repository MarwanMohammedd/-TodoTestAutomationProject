package WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ToDoPage {
    ToDoPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver , this);
    }
    WebDriver driver ;
    @FindBy(how =How.XPATH , using = "//h4[@data-testid='no-todos']")
    WebElement noToDosChecker;

    public WebElement getNoToDosChecker(){
        return noToDosChecker;
    }


}