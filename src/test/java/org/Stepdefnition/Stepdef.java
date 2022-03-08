package org.Stepdefnition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdef  {
	public static WebDriver driver;

	@Given("browser is open")
	public void browser_is_open() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hai\\Downloads\\Programs\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	    
	}

	@Given("user is on Emrit site")
	public void user_is_on_Emrit_site() {
		driver.get("http://mapv2.s3-website-us-west-2.amazonaws.com/?");
	   
	}
	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() throws InterruptedException {
	    driver.findElement(By.xpath("//input[@placeholder='Search wallet, email']")).sendKeys("rare-basil-wasp");
	    Thread.sleep(4000);
	   
	}

	@When("hits enter")
	public void hits_enter() throws InterruptedException {
		 driver.findElement(By.xpath("//li[@role='menuitem']")).click();
		    Thread.sleep(2000);
			
		    
	}

	@Then("user select a hotspot")
	public void user_select_a_hotspot() throws InterruptedException {
	   driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedSecondary MuiButton-containedSizeSmall MuiButton-sizeSmall']")).click();
	   Thread.sleep(5000);
	   
	}

	

}
