package Locators;

import Utility.Functions;
import org.openqa.selenium.By;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import static Utility.Functions.print;
import Utility.Constants;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Assign_contractor {
    public static WebDriver driver;

    public Assign_contractor(WebDriver driver) {
        Assign_contractor.driver = driver;
    }

    public void assign_contractor() {
        By project_expand = By.xpath("/html/body/div[1]/div/section/section/section/main/div/div/div/div/div[2]/div[2]/div/div/div/div/div/div/table/tbody/tr[1]/td[8]/div/button[3]/span/svg");

        Functions.simpleWait(Constants.wait_2);
        Functions.driver.navigate().refresh();
        try {
            // Function to click on the Expand button to select the contractor name
            Functions.simpleWait(Constants.wait_10);
            if (project_expand != null) {
                WebDriverWait wait = new WebDriverWait(Functions.driver, Duration.ofSeconds(20));
                WebElement PC = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section/section/section/main/div/div/div/div/div[2]/div[2]/div/div/div/div/div/div/table/tbody/tr[1]/td[8]/div/button[3]")));
                PC.click(); // Click on the Expand button to assign the contractor
                Functions.simpleWait(Constants.wait_2);
                print("The user successfully click on the project expand button");
            }
        } catch (Exception e) {
            e.printStackTrace();
            print("*********Test Case Fail***************");
            print("The user was not able to click on the project expand button");
        }
        Functions.simpleWait(Constants.wait_6);
        try {
            // Function go to the Submit and Assign section
            WebElement Assign_Cont = Functions.driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div[2]/div/div[1]/div[1]/div/div[2]"));
            if (Assign_Cont != null) {
                Assign_Cont.click(); // Click on the Assign & Submit button
                print("The user was successfully click on the submit & Assign contractor bar");
                Functions.simpleWait(Constants.wait_2);
            }
        } catch (Exception e) {
            e.printStackTrace();
            print("*********Test Case Fail**************");
            print("The User was not able to click on the submit & assign button");
        }

        Functions.simpleWait(Constants.wait_5);
        // Function to click on the search bar to select the contractor name
        boolean clicked = false;
        for (int i = 0; i < 5; i++) { // Retry up to 5 times to click on the search bar
            try {
                WebElement element = Functions.driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div[2]/div/div[2]/div/div[2]/form/div/div/div[2]/div/div/div/div[1]"));
                element.click();
                clicked = true;
                print("The user was successfully click on the contractor search list");
                break;
            } catch (ElementClickInterceptedException e) {
                Functions.simpleWait(Constants.wait_3);
            }
        }
        if (!clicked) {
            throw new RuntimeException("Unable to click the element after multiple attempts");
        }

        Functions.simpleWait(Constants.wait_2);
        try {
            // Function to select the contractor name
            WebDriverWait wait = new WebDriverWait(Functions.driver, Duration.ofSeconds(10));
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("/html/body/div[2]/div[2]/div/div[2]/div[2]/div/div[2]/div/div[2]/form/div/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div[1]/div/div/div[7]/div")
            ));
            element.click();
            print("The user was successfully select the contractor name");
        }catch (RuntimeException e){
            print("************Test Case Fail**************");
            print("The user not able to cselect the contractor name");
        }catch (Exception e){
            e.printStackTrace();
        }
        Functions.simpleWait(Constants.wait_2);
        try {
            // Function to click on the submit and assign button after select the contractor name
            WebDriverWait wait = new WebDriverWait(Functions.driver,Duration.ofSeconds(10));
            WebElement submit_button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/button")));
            submit_button.click();
            print("The user was successfully click on the Submit and Assign button");
        }catch (RuntimeException e){
            print("*********Test Case Fail***************");
            print("The user was not able to click on the submit and assign button");
        } catch (Exception e){
            e.printStackTrace();
        }

}
}
