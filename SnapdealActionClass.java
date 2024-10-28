package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapdealActionClass {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://snapdeal.com/");
		
		driver.findElement(By.xpath("(//span[@class='catText']/parent::a)[1]")).click();
		driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click();
//		WebElement MensFashion = driver.findElement(By.xpath("(//span[@class='catText']/parent::a)[1]"));
//		Actions obj = new Actions(driver); 
//		obj.moveToElement(MensFashion).click();
System.out.println("PRINT");
		//driver.get("https://www.browserstack.com/");


		
		
		

	}

}
