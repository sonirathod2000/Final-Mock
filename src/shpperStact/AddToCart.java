package shpperStact;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.shoppersstack.com/");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.findElement(By.id("Email")).sendKeys("sonirathod2000@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Sachin@2518");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.id("search")).sendKeys("kids");
//		ele1.click();
//		ele1.sendKeys("kids");
		driver.findElement(By.id("searchBtn")).click();
//		driver.findElement(By.xpath("//DIV[@class='cat_box__FUszw']/DIV[3]/DIV[3]/DIV[2]/BUTTON[@type='button']")).click();
//		driver.findElement(By.id("cart")).click();
		
	}
}
