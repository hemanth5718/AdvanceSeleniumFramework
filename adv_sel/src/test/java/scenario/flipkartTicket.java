package scenario;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.time.Duration;
import java.util.List;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class flipkartTicket {
	@Test
	public void crick() throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//img[@alt='Flight Bookings']")).click();
		WebElement ele =driver.findElement(By.xpath("//input[@tabindex='01']"));
		ele.click();
		ele.sendKeys("bangalore");
		Thread.sleep(2000);
		Robot rbt= new Robot();
		rbt.keyPress(KeyEvent.VK_DOWN);
		rbt.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		rbt.keyPress(KeyEvent.VK_ENTER);
		rbt.keyRelease(KeyEvent.VK_ENTER);
		WebElement ele1 = driver.findElement(By.xpath("//input[@tabindex='02']"));
		ele1.click();
		ele1.sendKeys("mumbai");
		rbt.keyPress(KeyEvent.VK_DOWN);
		rbt.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		rbt.keyPress(KeyEvent.VK_ENTER);
		rbt.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//input[@tabindex='03']")).click();
		driver.findElement(By.xpath("(//table[@class='RYl+NW']/descendant::button[@class='pl8ttv'])[13]")).click();
		driver.findElement(By.xpath("//button[@class='xSWdQ- azBkHf']")).click();
		driver.findElement(By.xpath("//button[@tabindex='5']")).click();
		List<WebElement> ele2 = driver.findElements(By.xpath("//div[@class='O+irE2'][number(translate(text(),'₹,,',''))<5000]"));
		
		for(WebElement ele4:ele2) {
		 String ele3 = ele4.getText();
		System.out.println(ele3);
		FileInputStream fis = new FileInputStream("./testData/testData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		for(int i= 0;i<4;i++) {
		wb.getSheet("flipkart").createRow(i).createCell(0).setCellValue(ele3);
	}
		FileOutputStream fos = new FileOutputStream("./testdata/testData.xlsx");
		wb.write(fos);
		wb.close();
		
		}
		driver.quit();
		
		
		
		
		

}
}

