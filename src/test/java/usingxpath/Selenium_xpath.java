package usingxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_xpath {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		//Window & link 
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		
		//login using absolute x-path
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/input[1]")).click();
		
		//add to cart using absolute x-path
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[6]/div[2]/div[2]/button[1]")).click();
		
		//using relative x-path
		
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		
		// using relative x-path
		
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
		
		//first name, last name & postal code
		
		driver.findElement(By.id("first-name")).sendKeys("Mir");
		driver.findElement(By.id("last-name")).sendKeys("Siam");
		driver.findElement(By.id("postal-code")).sendKeys("1207");
		
		// continue button using relative x-path
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		
		// finish button using absolute x-path
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[9]/button[2]")).click();
		
		
		
}

}