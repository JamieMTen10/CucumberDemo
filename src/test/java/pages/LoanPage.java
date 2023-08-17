package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoanPage extends BasePage {
    //selectors to the entry boxes
    private final static By FULL_NAME_BOX = By.xpath("//*[@id=\"name\"]");
    private final static By AGE_BOX = By.xpath("//*[@id=\"age\"]");
    private final static By ADDRESS_1_BOX = By.xpath("//*[@id=\"addressLine1\"]");
    private final static By ADDRESS_2_BOX = By.xpath("//*[@id=\"addressLine2\"]");
    private final static By ADDRESS_3_BOX = By.xpath("//*[@id=\"addressLine3\"]");
    private final static By ADDRESS_4_BOX = By.xpath("//*[@id=\"addressLine4\"]");
    private final static By POSTCODE_BOX = By.xpath("//*[@id=\"postCode\"]");
    private final static By EMAIL_BOX = By.xpath("//*[@id=\"email\"]");
    private final static By LOAN_AMOUNT_BOX = By.xpath("//*[@id=\"amount\"]");
    //selector for the submit button
    private final static By SUBMIT_BUTTON = By.xpath("//*[@type=\"submit\"]");
    private final static By IDENTIFIER = By.xpath("//h1");

    public LoanPage(WebDriver driver) {
        super(driver);
    }

    public void fillName(By elementSelector,String name){
        findAndType(FULL_NAME_BOX,name);
    }
    public void fillAge(String age){
        findAndType(AGE_BOX,age);
    }
    public void fillAddress1(String address){
        findAndType(ADDRESS_1_BOX,address);
    }
    public void fillAddress2(String address){
        findAndType(ADDRESS_2_BOX,address);
    }
    public void fillAddress3(String address){
        findAndType(ADDRESS_3_BOX,address);
    }
    public void fillAddress4(String address){
        findAndType(ADDRESS_4_BOX,address);
    }
    public void fillPostCode(String postcode){
        findAndType(POSTCODE_BOX,postcode);
    }
    public void fillEmail(String email){
        findAndType(EMAIL_BOX,email);
    }
    public void fillLoanAmount(String amount){
        findAndType(LOAN_AMOUNT_BOX,amount);
    }
    public void fillBox(By selector, String keys){
        findAndType(selector,keys);

    }
    public void clickSubmit(){
        waitAndClick(SUBMIT_BUTTON);
    }



}
