package scenario;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class crickbuzz {
	@Test
	public void crick() throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement ele = driver.findElement(By.id("rankingDropDown"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='ICC Rankings Men']")).click();
		driver.findElement(By.id("batsmen-odis-tab")).click();
		WebElement ele2 = driver.findElement(By.
		xpath("//div[@class='cb-col cb-col-100 cb-font-14 cb-lst-itm text-center']/descendant::div[contains(text(),'784')]"));
		String ele3 = ele2.getText();
		System.out.println(ele3);
		WebElement ele4 = driver.findElement(By.
		xpath("(//div[@class='cb-col cb-col-100 cb-font-14 cb-lst-itm text-center']/descendant::div[contains(text(),'INDIA')])[4]"));
		String ele5 = ele4.getText();
		System.out.println(ele5);
		driver.quit();
	}

}
