package SwagLab;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoOnSwagLabUsingTestNG {


	WebDriver driver=new ChromeDriver();


	@BeforeTest
	public void max() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");	

		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);

		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);

		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);


	}

	@Test
	public void addElements() throws InterruptedException
	{
		driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(2000);


		driver.findElement(By.name("add-to-cart-sauce-labs-bike-light")).click();
		Thread.sleep(2000);

		driver.findElement(By.className("shopping_cart_link")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("continue-shopping")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
		Thread.sleep(2000);

		driver.findElement(By.className("shopping_cart_link")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("checkout")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("first-name")).sendKeys("Shrikant");
		Thread.sleep(2000);

		driver.findElement(By.id("last-name")).sendKeys("Pawar");
		Thread.sleep(2000);

		driver.findElement(By.id("postal-code")).sendKeys("413307");
		Thread.sleep(2000);

		driver.findElement(By.id("continue")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("finish")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("back-to-products")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("logout_sidebar_link")).click();
		Thread.sleep(2000);


	}

	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}


}


