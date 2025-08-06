package scenario;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Worldpopulation {
	@Test
	public void worldpop() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.worldometers.info/world-population/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Actions act = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//a[contains(text(),'view full table')]"));
		act.scrollToElement(ele).perform();
		List<WebElement> ele1 = driver.findElements(By.xpath("//button[@class='datatable-pagination-list-item-link']"));
		for (WebElement ele2 : ele1) {
			try {

				WebElement ele3 = driver.findElement(By.xpath("//a[contains(text(),'Holy See')]"));
				String ele4 = ele3.getText();
				System.out.println(ele4);
				break;
			} catch (Exception e) {
				ele2.click();
			}

		}
		driver.quit();

	}

}
