package scenario;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Worldpop {
	@Test
	public void worldPop() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.worldometers.info/geography/countries-of-the-world/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("header-nav-more-trigger")).click();
		List<WebElement> ele = driver.findElements(By.xpath("//ul[@class='text-sm']/ul/li"));
		for (WebElement ele1 : ele) {			
		if("Food & Agriculture".contains(ele1.getText())) {
			Thread.sleep(2000);
			ele1.click();
			break;
		}}
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='India']")).click();
		Actions act = new Actions(driver);
		act.scrollByAmount(0, 700).perform();
		List<WebElement> ele2 = driver.findElements(By.xpath("((//*[name()='svg' and @aria-label='Number of Undernourished in India']/*[name()='g'])[5]/*[name()='g'])[2]/*[name()='path']"));
		for(WebElement e:ele2) {
			Actions act1 = new Actions(driver);
			act1.moveToElement(e).perform();
		}
	
		List<WebElement> ele3 = driver.findElements(By.xpath("(//[name()='svg' and @aria-label='Number of Undernourished in India']/[name()='g'])[9]/[name()='text']/[name()='tspan']"));
		for(WebElement e2:ele3) {
			String ele4 = e2.getText();
			System.out.println(ele4);
		}
		driver.quit();
	}
			
			}
		

	

