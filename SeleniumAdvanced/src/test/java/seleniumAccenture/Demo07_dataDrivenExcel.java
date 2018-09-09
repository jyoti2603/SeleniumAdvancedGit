package seleniumAccenture;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Demo07_dataDrivenExcel {
	WebDriver driver;

	@Test
	public void dataExcel() throws IOException {
		driver.get("http://demowebshop.tricentis.com/");

		System.out.println("sheet details");

		FileInputStream fin = new FileInputStream("C:\\Users\\pdc2b-training.pdc2b\\Jyoti Kumari\\List.xlsx");
		XSSFWorkbook H = new XSSFWorkbook(fin);
		XSSFSheet s = H.getSheet("TestData");
		int rowcount = s.getLastRowNum();
		System.out.println(rowcount);
		for (int i = 1; i <= rowcount; i++) {
			String Username = s.getRow(i).getCell(0).getStringCellValue();
			System.out.println(Username);
			String Password = s.getRow(i).getCell(1).getStringCellValue();
			System.out.println(Password);
			loginTest(Username, Password);
			try {
				driver.findElement(By.linkText("Log out")).click();
			} catch (Exception e) {
			}
		}
	}

	public void loginTest(String u, String p) {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(u);
		driver.findElement(By.id("Password")).sendKeys(p);
		driver.findElement(
				By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input"))
				.click();

	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\eclipse\\eclipse\\chromedriver.exe");
		driver = new ChromeDriver();

	}
}
