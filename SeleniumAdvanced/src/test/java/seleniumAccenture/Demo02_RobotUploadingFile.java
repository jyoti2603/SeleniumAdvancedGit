package seleniumAccenture;

import org.testng.annotations.Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Demo02_RobotUploadingFile {
	WebDriver driver;
  @Test
  public void f() throws AWTException, InterruptedException {
	  driver.get("https://www.timesjobs.com/candidate/register.html");
	  driver.findElement(By.id("resumeFile_basic")).click();
	  
	  Robot r =new Robot();
	  setClipboardata("C:\\Users\\pdc2b-training.pdc2b\\Jyoti Kumari");
	  Thread.sleep(1000);
	  
	  r.keyPress(KeyEvent.VK_CONTROL);
	  r.keyPress(KeyEvent.VK_V);
	  
	  r.keyRelease(KeyEvent.VK_CONTROL);
	  r.keyRelease(KeyEvent.VK_V);
	  r.keyPress(KeyEvent.VK_ENTER);
	  r.keyRelease(KeyEvent.VK_ENTER);  
  } 
  public void setClipboardata(String s) {
	  
	  StringSelection s1 =new StringSelection(s);
	  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s1, null);
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\eclipse\\eclipse\\chromedriver.exe");
      driver=new ChromeDriver();
  }
}

