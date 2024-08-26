package Reno_Admin_Portal;

import Utility.Functions;
import org.openqa.selenium.WebDriver;
import Locators.*;
import Utility.Constants;


public class login_main {
    public static Functions functionCall;
    public static WebDriver driver;
    public login_main(WebDriver driver) {
        login_main.driver = driver;
    }

    public static void main(String[] args) throws InterruptedException {
        functionCall = new Functions(driver);
        LoginScreen loginScreen = new LoginScreen(driver);
        Contractor_Proposals CP = new Contractor_Proposals(driver);

        Functions.MyChromeDriver();  // To launch my chrome driver
        Functions.simpleWait(Constants.wait_2);
        loginScreen.Reno_Admin_login();  // Login Credentials
        Functions.simpleWait(Constants.wait_2);
        CP.ContractorProposal();  // Proposal Creation



  }
}