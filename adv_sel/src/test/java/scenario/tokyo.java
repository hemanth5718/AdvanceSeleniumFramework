package scenario;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class tokyo {
	@Test
	public void tO() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.olympics.com/en/olympic-games/tokyo-2020");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement acceptCookiesBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("onetrust-accept-btn-handler")));
		acceptCookiesBtn.click();
		driver.findElement(By.xpath("(//a[contains(text(),'Results')])[1]")).click();
		Actions act = new Actions(driver);
		act.scrollByAmount(0, 1400).perform();
		driver.findElement(By.xpath("//p[contains(text(),'Boxing')]")).click();
		act.scrollByAmount(0, 400).perform();
		driver.findElement(By.xpath("//span[contains(text(),'Event')]")).click();
		driver.findElement(By.xpath("//div[@class='sc-5956c449-2 hIWIgY']/button[5]")).click();
		driver.findElement(By.xpath("//span[@class='sc-6fec804a-6 gAPBQb']")).click();
		act.scrollByAmount(0, 1400).perform();
		String xpath = "//h3[text()='Benjamin WHITTAKER']|//h3[text()='Benjamin WHITTAKER']/ancestor::div[contains(@data-cy,'athlete-row')]/preceding-sibling::div[contains(@data-cy,'flag-row')]/descendant::span";
		List<WebElement> ele = driver.findElements(By.xpath(xpath));
		for (WebElement element : ele) {
		    String text = element.getText();
		    System.out.println(text);
		}

		
		
		
		
		driver.quit();
	}
}
