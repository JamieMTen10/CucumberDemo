package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    private static final By SIGN_IN_MESSAGE_LOC = By.xpath("//h1");
    private static final By USERNAME_BOX = By.xpath("//*[@id=\"username\"]");
    private static final By PASSWORD_BOX = By.xpath("//*[@id=\"password\"]");
    private static final By SUBMIT_BOX = By.xpath("//input[@type='submit']");

    public String findSignInMessage(){
        return driver.findElement(SIGN_IN_MESSAGE_LOC).getText();
    }
    public void enterUsername(String username){
        findAndType(USERNAME_BOX,username);
    }
    public void enterPassword(String password){
        findAndType(PASSWORD_BOX,password);
    }
    public void clickSubmit(){
        driver.findElement(SUBMIT_BOX).click();
    }


}
