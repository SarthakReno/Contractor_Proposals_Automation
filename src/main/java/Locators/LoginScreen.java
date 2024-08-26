package Locators;
import Utility.Functions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static Utility.Functions.print;
import Utility.Constants;



public class LoginScreen {

    public static WebDriver driver;
    public LoginScreen(WebDriver driver) {
        LoginScreen.driver = driver;
    }

    public void Reno_Admin_login() throws InterruptedException {

        By Reno_email_id = By.xpath("//*[@id=\"email\"]");    // Reno email id
        By Reno_password = By.xpath("//*[@id=\"password\"]"); // Reno password
        By Login_button  = By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/form/div[4]/button/span"); // submit button

        Functions.simpleWait(Constants.wait_2);
        try {
            WebElement email = Functions.driver.findElement(Reno_email_id);    // When user click to enter our Email ID
            if (email != null) {
                email.click();
            }
        }catch (Exception e){
            print("user not able to click on the emil section button");

        }

        Functions.simpleWait(Constants.wait_2);

        try {                       // When User gives our Email ID
            WebElement Email = Functions.driver.findElement(Reno_email_id);
            if(Email != null){
                Email.sendKeys("reno12@mailinator.com");
                print("User's successfully give Email ID");
            }
        }catch (Exception e){
            print("******** Test Case Fail ************");
            print("The user was not able to give Email ID");
        }

        Functions.simpleWait(Constants.wait_2);

        try{                           // When user give our password
            WebElement Password = Functions.driver.findElement(Reno_password);
            if (Password !=null){
                Password.sendKeys("Demo@123");
                print("The user was successfully give our password");
            }
        }catch (Exception e){
            print("************* Test Case Fail *****************");
            print("The user was not able to give our password");
        }

        Functions.simpleWait(Constants.wait_2);


        try{
            WebElement Login = Functions.driver.findElement(Login_button);
            if (Login != null){
                Login.click();
                print("The user was successfully Login Our Admin Portal");
            }
        }catch (Exception e){
            print("*********** Test Case Fail ***********");
            print("The user was not able to click on the login button");
        }

    }


}
