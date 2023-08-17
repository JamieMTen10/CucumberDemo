package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }
    //change to the address of the loan application
    public final static String address = "http://13.40.132.213:8080/";
    //assigning selectors to the links on the page
    private final static By LOAN_APPLICATION_LINK = By.xpath("//a[text()='Loan Application']");
    private final static By ADMIN_PAGE_LINK = By.xpath("//a[text()='Admin page']");
    private final static By SEARCH_PAGE_LINK = By.xpath("//a[text()='Search page']");
    private final static By ABOUT_PAGE_LINK = By.xpath("//a[text()='About page']");
    private final static By SIGN_OUT_LINK = By.xpath("//a[text()='Sign Out']");
    private final static By LOGGED_IN_USER = By.xpath("//footer/span");
    private final static By IDENTIFIER_LOC = By.xpath("//body");
    public final static String IDENTIFIER ="This system is the be used by bank branch staff to complete applications for loans.";

    public void navigateToHomePage(){
        System.out.println("Navigating to Home page");
        driver.get(address);

    }
    public String getHomePageIdentifier(){
        return driver.findElement(IDENTIFIER_LOC).getText();
    }
    public void clickLoanApplication(){
        waitAndClick(LOAN_APPLICATION_LINK);
    }
    public void clickAdminPage(){
        waitAndClick(ADMIN_PAGE_LINK);
    }
    public void clickSearchPage(){
        waitAndClick(SEARCH_PAGE_LINK);
    }
    public void clickAboutPage(){
        waitAndClick(ABOUT_PAGE_LINK);
    }
    public void clickSignOut(){
        waitAndClick(SIGN_OUT_LINK);
    }
    public String getUsername(){
        return driver.findElement(LOGGED_IN_USER).getText();
    }

    public CharSequence HOME_PAGE_MESSAGE() {
        return IDENTIFIER;
    }
}
