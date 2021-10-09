//package com.qascript;

//import org.junit.Assert;
//import org.junit.Test;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver; 

public class FirstTest {


    public static void main(String[] args) {  
        
    // declaration and instantiation of objects/variables  
    System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");  
    WebDriver driver=new ChromeDriver();  
      
// Launch website  
    driver.navigate().to("http://www.google.com/");  
          
    // Click on the search text box and send value  
    driver.findElement(By.id("lst-ib")).sendKeys("javatpoint tutorials");  
          
    // Click on the search button  
    driver.findElement(By.name("btnK")).click();  
      
    }  
  
}  
 //   @Test
 //   public void OpenBrowser()  {
  //      WebDriver driver;
   //     System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        
      // ChromeOptions options = new ChromeOptions();
       // options.addArguments("headless");
       // options.addArguments("disable-gpu");
       // driver = new ChromeDriver(options);
      //  driver.get("https://www.google.com");
      //  System.out.println("Title of the page is: " + driver.getTitle());
       // Assert.assertTrue("Page title is not correct",driver.getTitle().equals("Google"));
//    }


// }


