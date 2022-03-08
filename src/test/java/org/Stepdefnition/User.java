package org.Stepdefnition;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class User {
	
	public WebDriver driver;
	@Parameters("browser")
	@Test
	public void tc1(String name) throws InterruptedException {
		if(name.equals("chrome")) {
			System.out.println("chrome browser launch");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (name.equals("ff")) {
			System.out.println("firefox browser launch");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		}
		else {
			System.out.println("edge browser launch");
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
		driver.get("http://mapv2.s3-website-us-west-2.amazonaws.com/?");
		driver.manage().window().maximize();
	    driver.findElement(By.xpath("//input[@placeholder='Search wallet, email']")).sendKeys("rare-basil-wasp");
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//li[@role='menuitem']")).click();
	    driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedSecondary MuiButton-containedSizeSmall MuiButton-sizeSmall']")).click();
		   Thread.sleep(5000);
		   driver.close();
	}

	

}
