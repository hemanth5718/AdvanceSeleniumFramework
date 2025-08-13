package scenario;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BBcMedals {
	@Test
	public void bbcMedals() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bbc.com/sport/olympics/paris-2024/BDMMDOUBLES/results");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//a[@href='/sport/olympics/paris-2024/results']")).click();
		driver.findElement(By.id("discipline-selector")).click();
		
		driver.findElement(By.xpath(""));
		driver.findElement(By.xpath(""));

		
		
	}
	

}
