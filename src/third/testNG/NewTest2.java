package third.testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest2 {
  
  @Test(priority=0,description="this test case will verify login functionality_2")
  public void loginApplication() 
  {
	  System.out.println("login to application_2");
	  System.setProperty("webdriver.chrome.driver","C:\\Drivers\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://indeed.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.quit();
  }
  
  @Test(priority=1,description="this test case will select an item_2")
  public void selectItems() 
  {
	  System.out.println("Item Selected_2");
	  Assert.assertTrue(true);
	  System.setProperty("webdriver.chrome.driver","C:\\Drivers\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://indeed.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.quit();

  }
  
//  @Test(priority=2,description="this test case will checkout_2")
//  public void checkOut() 
//  {
//	  System.out.println("checkout completed_2");
//	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\W10-Dell\\Documents\\softwares\\Selenium\\new\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		
//		driver.get("https://indeed.com");
//		System.out.println(driver.getCurrentUrl());
//		System.out.println(driver.getTitle());
//		driver.quit();
//
//  }
}
