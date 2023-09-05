import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GroupsDay1 {
	WebDriver driver;
   
	  @Test
	  public void f() {
		//driver setup
		  WebDriverManager.chromedriver().setup();
		  //browser object
		    driver = new ChromeDriver();
		  //open google
		  driver.get("https://google.com");
	  }
	  
	  @Test(groups = "G1")
	  public void f1() {
		  driver.findElement(By.name("q")).sendKeys("depends on",Keys.ENTER);
	  }
	  
	  @Test(groups = "G2")
	  
	  public void f2() {
		  driver.quit();
	   }
	  
	  
	  

  }

