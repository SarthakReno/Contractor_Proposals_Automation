package Utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;

public class Functions {
    public static WebDriver driver;

    public Functions(WebDriver driver) {
    }

    public static void MyChromeDriver() {
        try {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize(); // for maximize the chrome screen
            // Navigate to a website make my trip
            driver.get("https://reno-test-admin.azurewebsites.net/dashboard");
            System.out.println("Reno Admin Launched");
        } catch (Exception e) {
            System.out.println("Reno Admin app doesn't launch");
        }
    }

    // ****** For Print The Value ******
    public static void print(String val) {
        System.out.println(val);
    }

    // *******To_Provide_Wait************
    public static void simpleWait(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

   public static void RandomEmailGenerator (){
       By Customer_email_id = By.xpath("//*[@id=\"customerEmail\"]");
       // Define the characters to use for the email prefix
       String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
       int length = 10;  // Length of the email prefix
       StringBuilder emailPrefix = new StringBuilder(length);
       Random random = new Random();

       // Generate a random string for the email prefix
       for (int i = 0; i < length; i++) {
           emailPrefix.append(characters.charAt(random.nextInt(characters.length())));
       }

       // Define a domain
       String domain = "@gmail.com";

       // Combine prefix and domain to form the email address
       String randomEmail = emailPrefix.toString() + domain;
       Functions.simpleWait(Constants.wait_2);
       WebElement email = Functions.driver.findElement(Customer_email_id);
       email.sendKeys(randomEmail);

       // Print the generated random email
       print("Random Email: " + randomEmail);
   }

}





