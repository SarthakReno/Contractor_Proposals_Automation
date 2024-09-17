package Locators;
import Utility.Functions;
import Utility.Constants;
import static Utility.Functions.print;

import org.apache.commons.io.input.WindowsLineEndingInputStream;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalField;
import java.time.temporal.WeekFields;
import java.util.Locale;


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
        By design_milestone = By.xpath("//*[@id=\"milestoneType\"]/label[1]/span[2]");
        By milestone_name = By.xpath("//*[@id=\"name\"]");
        By create_milestone_button = By.xpath("/html/body/div[3]/div[2]/div/div[2]/div[3]/button/span");

        Functions.simpleWait(Constants.wait_2);
        // when user click on the milestone button
        try{
            WebElement milestone = Functions.driver.findElement(milestone_click);
            milestone.click();
            print("The user was successfully click on the milestone button");
        }catch (Exception e){
            print("************ Test Case Fail **************");
            print("The user was not able to click on create mileStone button");
        }
        Functions.simpleWait(Constants.wait_2);

        // When user click on the design milestone button
        try{
            WebElement Design_milestone = Functions.driver.findElement(design_milestone);
            Design_milestone.click();
            print("The user was successfully click on the design milestone");
        }catch (Exception e){
            print("************ Test Case Fail **************");
            print("The user was not able to click on the design milestone");
        }
        Functions.simpleWait(Constants.wait_2);

        try{
            if (milestone_name!= null){
                WebElement name = Functions.driver.findElement(milestone_name);
                name.sendKeys("MileStone Number 1");
                print("The user was successfully give our MileStone Name");
            }
        }catch(Exception e){
            print("************ Test Case Fail **************");
            print("The user not gives our milestone name");
        }
        Functions.simpleWait(Constants.wait_3);

        try{
            WebDriverWait wait = new WebDriverWait(Functions.driver, Duration.ofSeconds(5));
            WebElement description = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div[2]/div/div[2]/div[2]/form/div[2]/div[2]/div/div[1]/div[2]/div[1]/div/span/textarea")));
           description.sendKeys("Test");
           print("The user was successfully give the milestone description");
        }catch (Exception e){
            e.printStackTrace();
        }
        Functions.simpleWait(Constants.wait_3);

        LocalDate today = LocalDate.now();
        LocalDate nextDate = today.plusDays(1);
        String nextDateFormatted = nextDate.format(DateTimeFormatter.ofPattern("MMM dd, yyyy", Locale.ENGLISH));
        // Get week and day of week for the next date
        WeekFields weekFields = WeekFields.of(DayOfWeek.MONDAY, 1);
        TemporalField weekOfMonth = weekFields.weekOfMonth();
        int weekOfMonthValue = nextDate.get(weekOfMonth);
        int dayOfWeekValue = nextDate.getDayOfWeek().getValue();
        WebElement calendarButton = Functions.driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[2]/div[2]/form/div[3]/div[1]/div/div/div[2]/div/div/div/div/input"));
        calendarButton.click();
        print("The user successfully click on the calendar option section");
        Functions.simpleWait(Constants.wait_3);
        try {
            WebElement tableBody = Functions.driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div[1]/div[2]/table/tbody"));
            WebElement dateElement = tableBody.findElement(By.xpath(".//tr[" + weekOfMonthValue + "]//td[" + (dayOfWeekValue + 1) + "]"));
            ((JavascriptExecutor) Functions.driver).executeScript("arguments[0].scrollIntoView(true);", dateElement);
            dateElement.click();
        }catch (Exception e){
            e.printStackTrace();
        }
        Functions.simpleWait(Constants.wait_5);
        WebElement endtime = Functions.driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[2]/div[2]/form/div[3" +
                "]/div[2]/div/div[1]/div[2]/div[1]/div/div/div/input"));
        endtime.click();
        WebElement select_end_date = Functions.driver.findElement(By.xpath("/html/body/div[5]/div/div/div/div/div[1]/div[2]/table/tbody/tr[5]/td[2]/div"));
        select_end_date.click();
        Functions.simpleWait(Constants.wait_3);


        try{
            WebElement create_button = Functions.driver.findElement(create_milestone_button);
            create_button.click();
            print("The user was successfully click on the create button");
        }catch (Exception e){
            print("************ Test Case Fail **************");
            print("The user was not able to click on the create milestone button");
        }
    }
    public void budget_creation(){
        By budget = By.xpath("//*[@id=\"rc-tabs-1-tab-3\"]/span");
        By see_more = By.xpath("//*[@id=\"rc-tabs-1-panel-3\"]/div/div[1]/div/div/div/span/div");
        By save_continue = By.xpath("//*[@id=\"rc-tabs-1-panel-3\"]/div/div[2]/div[2]/button[2]/span");


        try {
            WebElement budget_button = Functions.driver.findElement(budget);
            budget_button.click();
            print("The user was successfully click on the budget section");
        }catch (Exception e){
            print("************ Test Case Fail **************");
            print("The user was not able to click on budget selection button");
        }
        Functions.simpleWait(Constants.wait_2);
        try{
            if (see_more !=null){
                WebElement button = Functions.driver.findElement(see_more);
                button.click();
            }
        }catch (Exception e){
            print("************ Test Case Fail **************");
            print("The user was not able to click on the See More button comes in budget");
        }

        Functions.simpleWait(Constants.wait_2);
        String add_budget_button = "//*[@id=\"rc-tabs-1-panel-3\"]/div/div[1]/div/div/div[2]/div/div/button/span[2]";
        String materialType = "//*[@id=\"materialType\"]";
        String materialUnitDropdown = "/html/body/div[4]/div[2]/div/div[2]/div[2]/div/form/div[3]/div[1]/div/div/div[2]/div/div/div/div[1]/span[1]/input";
        String quantity = "//*[@id=\"materialQuantity\"]";
        String description = "/html/body/div[4]/div[2]/div/div[2]/div[2]/div/form/div[5]/div/div/div/div[2]/div/div/textarea";

        for (int i = 0; i < 2; i++) {
            try {
                // add button xpath
                WebElement element = Functions.driver.findElement(By.xpath(add_budget_button));

                // Scroll to the element
                JavascriptExecutor js = (JavascriptExecutor) Functions.driver;
                js.executeScript("arguments[0].scrollIntoView(true);", element);

                // Interact with the element
                element.click();
            } catch (NoSuchElementException e) {
                print("Element not found");
            }
            // Wait for the budget name section
            Functions.simpleWait(Constants.wait_2);
            WebDriverWait wait = new WebDriverWait(Functions.driver, Duration.ofSeconds(10));
            WebElement budget_name = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/div[2]/div/div[2]/div[2]/div/form/div[1]/div/div/div/div[2]/div/div/input")));
            budget_name.sendKeys("Budget Number "+ (i + 1));

            Functions.simpleWait(Constants.wait_2);
            // When user give our material type name
            Functions.driver.findElement(By.xpath(materialType)).sendKeys("Material Type " + (i + 1));

            // When user click on the dropdown button to select the unit value in dropdown
            WebElement dropdown = Functions.driver.findElement(By.xpath(materialUnitDropdown));
            dropdown.click();
            Functions.simpleWait(Constants.wait_2);
            WebDriverWait wait1 = new WebDriverWait(Functions.driver, Duration.ofSeconds(20));
            WebElement option = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/div[2]/div/div[2]/div[2]/div/form/div[3]/div[1]" +
                    "/div/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div[1]/div/div")));
            option.click();
            Functions.simpleWait(Constants.wait_2);
            Functions.driver.findElement(By.xpath(quantity)).sendKeys(String.valueOf(i + 1));
            Functions.simpleWait(Constants.wait_2);
            // Enter the unit price
            WebElement unitPrice = Functions.driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[2]/div[2]/div/form/div[3]/div[2]/div/div[1]/div[2]/div[1]/div/input"));
            unitPrice.sendKeys(String.valueOf(200 + (i * 100)));
            Functions.simpleWait(Constants.wait_2);
            Functions.driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[2]/div[2]/div/form/div[4]/div[1]/div/div/div[2]/div/div/input")).sendKeys("500");
            Functions.simpleWait(Constants.wait_2);
            int[] daysValues = {20, 25, 30};
            Functions.driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[2]/div[2]/div/form/div[4]/div[2]/div/div/div[2]/div/div/input")).sendKeys(String.valueOf(daysValues[i % 3]));
            Functions.simpleWait(Constants.wait_2);
            Functions.driver.findElement(By.xpath(description)).sendKeys("Description " + (i + 1));
            Functions.simpleWait(Constants.wait_2);
            WebElement createButton = Functions.driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[2]/div[3]/button/span"));
            createButton.click();
            Functions.simpleWait(Constants.wait_2);
        }
        Functions.simpleWait(Constants.wait_2);
        try{   // When user click on the save & continue button to save the budget items
            WebElement submitbutton = Functions.driver.findElement(save_continue);
            submitbutton.click();
            print("The user was successfully click on the save and continue");
        }catch (Exception e){
            print("*********** Test Case Fail ***************");
            print("The user not able to click on the save & continue button");
        }
        Functions.simpleWait(Constants.wait_2);
    }

    public void payment_group (){
        By add_payment_group = By.xpath("/html/body/div[2]/div[3]/div/div/div[2]/div/div/div[2]/div/div[4]/div/div[1]/div/button/span[2]");
        By payment_name = By.xpath("/html/body/div[5]/div[2]/div/div[2]/div[2]/form/div[1]/div/div/div/div[2]/div/div/input");
        By add_payment_group_button = By.xpath("/html/body/div[5]/div[2]/div/div[2]/div[3]/button/span");
        By save_and_continue = By.xpath("//*[@id=\"rc-tabs-1-panel-4\"]/div/div[2]/div[2]/button[2]/span");
        try{
            Functions.simpleWait(Constants.wait_2);
            WebElement payment_group = Functions.driver.findElement(add_payment_group);
            payment_group.click();
            print("The user successfully click on the add payment group button");
        }catch (Exception e){
            print("************ Test Case Fail **************");
            print("The user not able to click on the add payment group button");
        }
        Functions.simpleWait(Constants.wait_2);
        try{
            WebElement add_payment_name = Functions.driver.findElement(payment_name);
            add_payment_name.sendKeys("Test Payment 1");
            print("The user was successfully give the payment name");
        }catch (Exception e) {
            print("********** Test Case Fail **********");
            print("The user not able to give the payment name");
        }
        Functions.simpleWait(Constants.wait_2);
        try {
            WebElement checkbox = Functions.driver.findElement(By.xpath("//input[@class='ant-checkbox-input']"));
                checkbox.click();
                print("The user was successfully click on the payment checkbox");

        }catch (Exception e){
            e.printStackTrace();

        }
        Functions.simpleWait(Constants.wait_2);
        try{
            WebElement submit_button = Functions.driver.findElement(add_payment_group_button);
            submit_button.click();
            print("The user successfully click on the submit button");
        }catch (Exception e){
            print("********** Test Case Fail **********");
            print("The user not able to not able to click on the submit button");
        }
        Functions.simpleWait(Constants.wait_2);
        try {
            WebElement save_button = Functions.driver.findElement(save_and_continue);
            save_button.click();
            print("The user was able to click on the save and continue button");
        }catch (Exception e){
            print("********** Test Case Fail **********");
            print("The user not able to not able to click on the Save and Continue button");
        }
    }
    public void summary (){
        By save_button = By.xpath("//*[@id=\"rc-tabs-1-panel-5\"]/div/div[2]/div[2]/button[2]");
        Functions.simpleWait(Constants.wait_2);
        try{
            WebElement button = Functions.driver.findElement(save_button);
            button.click();
            print("The user was able to click on the save button on summary screen");
        }catch (Exception e){
            print("********** Test Case Fail **********");
            print("The user was not able to click on the summary's save button");

        }
    }
}
