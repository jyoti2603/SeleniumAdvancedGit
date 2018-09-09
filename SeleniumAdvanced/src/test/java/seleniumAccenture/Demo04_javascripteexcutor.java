package seleniumAccenture;

import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Demo04_javascripteexcutor {
	WebDriver driver;
  @Test
  public void f() {
	  
	  driver.get("http://demowebshop.tricentis.com/");
	  driver.manage().window().maximize();
	  JavascriptExecutor j=(JavascriptExecutor)driver;
	  j.executeScript("window.scroll(0,900)");
	  j.executeScript("alert('Hi')");
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\eclipse\\eclipse\\chromedriver.exe");
      driver=new ChromeDriver();

  }

}
