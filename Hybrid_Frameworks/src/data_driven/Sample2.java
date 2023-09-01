package data_driven;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import generic.DDT;



public class Sample2 {
	@Test
	public void test() throws InterruptedException, EncryptedDocumentException, IOException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String un = DDT.ddt("Sheet1", 0, 2);
		
		String pwd = DDT.ddt("Sheet1", 1, 2);
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(un);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(pwd);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}

}
