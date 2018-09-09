package seleniumAccenture;

import org.testng.annotations.Test;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Demo05_Cookies {
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("http://demowebshop.tricentis.com/");
	  driver.manage().deleteAllCookies();
	  Cookie c= new Cookie("User","Tricentis");
	  driver.manage().addCookie(c);
	  Set<Cookie> CookieDetails=driver.manage().getCookies();
	  for(Cookie s:CookieDetails)
	  { 
		  System.out.println(s.getExpiry());;
		  System.out.println(s.getDomain());
		  System.out.println(s.getDomain());
	  }
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\eclipse\\eclipse\\chromedriver.exe");
      driver=new ChromeDriver();
  }

}
