package Locators;

import Utility.Functions;
import org.openqa.selenium.*;

import static Utility.Functions.print;
import Utility.Constants;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Assign_contractor {
    public static WebDriver driver;

    public Assign_contractor(WebDriver driver) {
        Assign_contractor.driver = driver;
    }

    public void assign_contractor() {

        Functions.simpleWait(Constants.wait_2);
        Functions.driver.navigate().refresh();
        Functions.simpleWait(Constants.wait_10);

        // Function to click on the action dropdown button
        boolean Action_button_clicked = false;
        for (int i = 0; i < 5; i++) { // Retry up to 5 times to click on the Action dots
            try {
                WebDriverWait wait = new WebDriverWait(Functions.driver, Duration.ofSeconds(10));
                WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("/html/body/div[1]/div/section/section/section/main/div/div/div/div/div[2]/div[2]/div/div/div/div/div/div/table/tbody/tr[1]/td[8]/div/button")));
                dropdown.click();
                Action_button_clicked = true;
                print("The user was successfully click on the action dropdown button");
                break;
            } catch (ElementClickInterceptedException e) {
                Functions.simpleWait(Constants.wait_3);
            }
        }
        if (!Action_button_clicked) {
            throw new RuntimeException("Unable to click on the action dropdown button");
        }

        // Function to click on the Assign contractor button in Action dropdown
        try{
            WebElement Assign_Contractors_button = Functions.driver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[3]"));
            Assign_Contractors_button.click();
            print("The user was able to click on the assign contractor");
        }catch (RuntimeException e){
            print("************* Test Case Fail ***************");
            print("The user was not able to click on the assign contractor");
        }catch (Exception e){
            e.printStackTrace();
        }

        Functions.simpleWait(Constants.wait_3);
        try {
            // Function go to the Submit and Assign section
            WebDriverWait wait = new WebDriverWait(Functions.driver, Duration.ofSeconds(10));
            WebElement Assign_And_Submit = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("/html/body/div[3]/div[2]/div/div[2]/div[2]/div/div[1]/div[1]/div/div[2]")));
            Assign_And_Submit.click();
            print("The user was successfully click on the submit & Assign contractor bar");
            Functions.simpleWait(Constants.wait_2);
        }catch (RuntimeException e){
            print("*********Test Case Fail**************");
            print("The User was not able to click on the submit & assign button");
        }catch (Exception e) {
            e.printStackTrace();
        }

        Functions.simpleWait(Constants.wait_6);
        // Function to click on the search bar to select the contractor name
        boolean clicked = false;
        for (int i = 0; i < 5; i++) { // Retry up to 5 times to click on the search bar
            try {
                WebDriverWait wait = new WebDriverWait(Functions.driver, Duration.ofSeconds(10));
                WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("/html/body/div[3]/div[2]/div/div[2]/div[2]/div/div[2]/div/div[2]/form/div/div/div[2]/div/div/div/div")));
                element.click();
                clicked = true;
                print("The user was successfully click on the contractor search list");
                break;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (!clicked) {
            throw new RuntimeException("Unable to click the element after multiple attempts");
        }

        Functions.simpleWait(Constants.wait_5);

        try {
            // Function to select the contractor name
            WebDriverWait wait = new WebDriverWait(Functions.driver, Duration.ofSeconds(10));
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("/html/body/div[3]/div[2]/div/div[2]/div[2]/div/div[2]/div/div[2]/form/div/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div[1]/div/div/div[7]")
            ));
            element.click();
            print("The user was successfully select the contractor name");
        }catch (Exception e){
            e.printStackTrace();
        }

        Functions.simpleWait(Constants.wait_3);

        try {
            // Function to click on the submit and assign button after select the contractor name
            WebDriverWait wait = new WebDriverWait(Functions.driver,Duration.ofSeconds(10));
            WebElement submit_button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div[2]/div/div[2]/div[3]/div/div[2]/button/span")));
            submit_button.click();
            print("The user was successfully click on the Submit and Assign button");

        } catch (Exception e){
            e.printStackTrace();
        }

}
}
