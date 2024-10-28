package week3.day3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameAlert {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Switching to frame from main dom structure.
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		//switching from frame to alert 
		Alert al = driver.switchTo().alert();
		al.accept();
		
		String text1 = driver.findElement(By.id("demo")).getText();
		//String text = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println(text1);
		
	
		//switching back to main page dom directly.
		driver.switchTo().defaultContent();
		driver.close();

	}

}
