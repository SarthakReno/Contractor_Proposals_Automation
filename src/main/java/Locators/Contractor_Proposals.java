package Locators;
import Utility.Functions;
import Utility.Constants;
import static Utility.Functions.print;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Contractor_Proposals {
    public static WebDriver driver;

    public Contractor_Proposals(WebDriver driver) {
        Contractor_Proposals.driver = driver;
    }

    public void ContractorProposal() {
        Functions.simpleWait(Constants.wait_2);
        By ContractorProposalTab = By.xpath("//*[@id=\"root\"]/div/section/section/div/aside" +
                "/div/div[2]/div[1]/ul/li[6]/span[2]/span"); // Contractor Tab click
        By CreateProposal = By.xpath("//*[@id=\"root\"]/div/section/section/section/main/div/div/div/div/button"); // create proposal button
        By select_project_type = By.xpath("//*[@id=\"type\"]");
        By Project_name = By.xpath("//*[@id=\"projectName\"]");
        By description = By.xpath("//*[@id=\"description\"]");
        By Customer_name = By.xpath("//*[@id=\"customerName\"]");
        By Scope_of_work = By.xpath("//*[@id=\"scopeOfWork\"]");
        By save_continue = By.xpath("//*[@id=\"rc-tabs-1-panel-1\"]/div/div[2]/div[2]/button/span");





        // When user click on the contractor proposal tab in admin portal
        try {
            WebElement CP_tab = Functions.driver.findElement(ContractorProposalTab);
            if (CP_tab != null) {
                CP_tab.click();
                print("user click on the contractor Proposal");
            }
        } catch (Exception e) {
            print("********** Test Case Fail *************");
            print("The user was not able to click on the contractor Proposal");
        }
        Functions.simpleWait(Constants.wait_5);

         // When user click on the create proposal button
        try{
            WebElement CP_button = Functions.driver.findElement(CreateProposal);
            if (CP_button != null){
                CP_button.click();
                print("The user was successfully click on the the create proposal button");
            }
        }catch (Exception e){
            print("*********** Test Case Fail ************");
            print("The user was not able to click on the create proposal button");
        }

        Functions.simpleWait(Constants.wait_2);

        // When user select the project Type
        try {
            WebElement dropdown = Functions.driver.findElement(select_project_type);
            dropdown.click();
            Functions.simpleWait(Constants.wait_2);
            WebDriverWait wait = new WebDriverWait(Functions.driver, Duration.ofSeconds(20));
            WebElement option = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"rc-tabs-1-panel-1\"]/div/div[1]/form/d" +
                    "iv[1]/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div[1]/div/div")));
            option.click();
            print("The user was successfully select the project type");
        }catch (Exception e){
            print("************** Test Case Fail ***************");
            print("The user not able to select the project type");
        }

        Functions.simpleWait(Constants.wait_2);

        // When user give the Project name
        try{
            WebElement project_name = Functions.driver.findElement(Project_name);
            project_name.sendKeys("Test Project 1");
            print("The user was successfully give the project type");
        }catch (Exception e){
            print("************ Test Case Fail **************");
            print("The user was not able to give the project Name");
        }
        Functions.simpleWait(Constants.wait_2);

        // When user gives the Description
        try{
            WebElement Description = Functions.driver.findElement(description);
            Description.sendKeys("This is renovation project");
            print("The user was successfully give the description for project");
        }catch (Exception e){
            print("************ Test Case Fail **************");
            print("The user was not able to give the description");
        }
        Functions.simpleWait(Constants.wait_2);

        // When user give the customer name
        try{
            WebElement customer_name = Functions.driver.findElement(Customer_name);
            customer_name.sendKeys("Sarthak Test");
            print("The use was successfully give the customer name");
        }catch (Exception e){
            print("************ Test Case Fail **************");
            print("The user was not able to give the customer name");
        }
        Functions.simpleWait(Constants.wait_2);

        // When user give Email ID
        try{
            Functions.RandomEmailGenerator();
            print("The user was successfully give our Email ID");
        }catch (Exception e){
            print("************ Test Case Fail **************");
            print("The user was not able to give the customer Email ID");
        }
        Functions.simpleWait(Constants.wait_2);

        // When user give the Scope of work
        try{
            WebElement scope_of_work = Functions.driver.findElement(Scope_of_work);
            scope_of_work.sendKeys("The scope of the project is Automation");
            print("The user was successfully give the scope of the project");
        }catch (Exception e){
            print("************ Test Case Fail **************");
            print("The user was not able to give the scope of the project");
        }
        Functions.simpleWait(Constants.wait_2);

        try{
            WebElement save_button = Functions.driver.findElement(save_continue);
            save_button.click();
            print("The user was successfully click on the save and continue");
        }catch (Exception e){
            print("************ Test Case Fail **************");
            print("The user was not able to click on the save and continue button");
        }
    }
    public void MileStone_Creation(){
        By milestone_click = By.xpath("//*[@id=\"rc-tabs-1-panel-2\"]/div/div[1]/button/span[2]");


        // when user click on the milestone button
        try{
            WebElement milestone = Functions.driver.findElement(milestone_click);
            milestone.click();
            print("The user was successfully click on the milestone button");
        }catch (Exception e){
            print("************ Test Case Fail **************");
            print("The user was not able to click on create mileStone button");
        }

    }
}
