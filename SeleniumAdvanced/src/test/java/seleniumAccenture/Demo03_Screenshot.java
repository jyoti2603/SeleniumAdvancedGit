package seleniumAccenture;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Demo03_Screenshot {
	WebDriver driver;
  @Test
  public void f() throws IOException {
	  
	  driver.get("http://demowebshop.tricentis.com/");
	  TakesScreenshot t =(TakesScreenshot)driver;
	  File f = t.getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(f, new File("C:\\Users\\pdc2b-training.pdc2b\\Jyoti Kumari\\myscreenshot.jpg"));
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\eclipse\\eclipse\\chromedriver.exe");
      driver=new ChromeDriver();
	  
  }

}
