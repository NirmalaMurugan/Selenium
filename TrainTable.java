package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrainTable {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://erail.in/");
		driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
		WebElement Trainname = driver.findElement(By.xpath("//table[contains(@class,'DataTable TrainList')]//tr[5]/td[2]"));
		System.out.println(Trainname.getText());


	}

}
