package seleniumAccenture;

import org.testng.annotations.Test;

import com.sun.glass.events.KeyEvent;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class Demo01_Accenture {
	WebDriver driver;
  @Test(enabled=false)
  public void f() {
	  
	  driver.get("http://demowebshop.tricentis.com/");
	  Actions a=new Actions(driver);
	  //does right click on page.
	 //a.contextClick().build().perform();
	  driver.findElement(By.linkText("Log in")).click();
	  WebElement email=driver.findElement(By.id("Email"));
	  a.moveToElement(email).keyDown(email, Keys.SHIFT).sendKeys("myname").build().perform();  
  }
  @Test
  public void demoRobot() throws AWTException  
  {
	  Robot r= new Robot();
	  //For pressing key
	  r.keyPress(KeyEvent.VK_WINDOWS);
	//For pressing key
	  r.keyRelease(KeyEvent.VK_WINDOWS);
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\eclipse\\eclipse\\chromedriver.exe");
       driver=new ChromeDriver();
 
  }

}
