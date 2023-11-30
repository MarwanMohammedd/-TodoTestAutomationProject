package WebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;

public class ToDoPage extends BasePage {
    private final By noAvailableToDosLocator = By.xpath("/html/body/div/div[2]/div/div/h4");
    private final By addToDosButtonLocator = By.xpath("//button[@class = 'MuiButtonBase-root MuiIconButton-root'] ");
    private final By createToDoHeaderLocator = By.xpath("//h2[@data-testid='header']");
    private final By toDoItemInputFieldLocator = By.xpath("//input[@data-testid='new-todo']");
    private final By createToDoTaskButtonLocator = By.xpath("//button[@data-testid='submit-newTask']");
    private final By goBackToDoListLocator = By.xpath("//h2[@data-testid='back']");
    private final By logOutButtonLocator = By.xpath("/html/body/div/div[1]/div/div/button/span[1]");
    private final By welcomeHeaderMessageLocator = By.xpath("//h2[@data-testid='welcome']");
    private final By checkToDoTask = By.xpath("//input[@data-testid='complete-task']");
    private final By deleteToDoTask = By.xpath("//button[@data-testid='delete']");
    private final By toDoItemsTacks = By.xpath("//h2[@data-testid = 'todo-text']");
    private final By getErrorMessage = By.xpath("//*[@id=\"root\"]/div[2]/div/div/div/p");
    public WebElement getNoToDosChecker() {
        return find(noAvailableToDosLocator);
    }

    public void clickOnAddToDosButton() {
        click(addToDosButtonLocator);
    }

    public void clickOnLogOutButton() {
        click(logOutButtonLocator);
    }

    public void testValueFromLocalStorage(String value) throws InterruptedException {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        String values = (String) javascriptExecutor.executeScript("return window.localStorage.getItem('user')");
        String returnedResult = values.replace("Marwan", value);
        javascriptExecutor.executeScript(String.format("window.localStorage.setItem('user' , '%s')", returnedResult));
       // Thread.sleep(3000);
        driver.navigate().refresh();
    }

    public void addToDoItem(String toDoItem) {
        setData(toDoItemInputFieldLocator, toDoItem);
    }

    public void clickOnCreateToDoItemButton() {
        click(createToDoTaskButtonLocator);
    }

    public void clickOnDeleteItem() {
        click(deleteToDoTask);
    }

    public void clickOnCompleteItemsUnChecked() {
        if (!find(checkToDoTask).isSelected()) {
            click(checkToDoTask);
        }
    }

    public void clickOnCompleteItemsChecked() {
        if (find(checkToDoTask).isSelected()) {
            click(checkToDoTask);
        }
    }

    public String getTextToDoItemsTask() {
        return getText(toDoItemsTacks);
    }

    public WebElement getErrorMessage(){
        return find(getErrorMessage);

    }
public WebElement getWelcomeHeaderMessageElement(){
        return find(welcomeHeaderMessageLocator);
}

}