package scenario;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Google {
	@Test
	public void google() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//div[@jscontroller='Jlf2lc']")).click();
		driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
		driver.switchTo().frame(0);
		WebElement ele = driver.findElement(By.xpath("//a[@data-pid='421']"));
		Actions act = new Actions(driver);
		act.scrollToElement(ele).perform();
		ele.click();		
		WebElement ele1 = driver.findElement(By.xpath("(//h2[contains(@class,'R3mvd') and contains(text(),'Welcome')])[2]"));
		String ele2 = ele1.getText();
		System.out.println(ele2);
		
		driver.quit();
	}

}
