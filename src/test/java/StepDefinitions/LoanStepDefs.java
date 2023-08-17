package StepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import pages.LoanPage;

import java.util.Map;

import static StepDefinitions.Hooks.driver;
import static org.apache.commons.text.CaseUtils.toCamelCase;

public class LoanStepDefs {
    LoanPage loanPage = new LoanPage(driver);
    @Then("I can see the loan application message")
    public void iCanSeeTheLoanApplicationMessage() {

    }

    @Then("I fill out the loan")
    public void iFillOutTheLoan(DataTable table) {
        Map<String,String> map = table.transpose().asMap(String.class,String.class);
        for (Map.Entry<String,String> entry: map.entrySet()) {
            String key = entry.getKey();
            String camKey = toCamelCase(entry.getKey(),false);
            String xpath = "//*[@id=\""+ camKey + "\"]";
            By selector = By.xpath(xpath);
            String value = entry.getValue();
            System.out.println(camKey);
            loanPage.fillBox(selector,value);
            System.out.println("I fill out the " + key + " box with " + value);
        }
    }

    @Then("I submit the loan")
    public void iSubmitTheLoan() {
        loanPage.clickSubmit();
        System.out.println("I submit the loan");
    }
}
