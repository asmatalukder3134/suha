package allchild;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Keyboard;
import org.testng.annotations.Test;

public class Base {
	WebDriver dr;
	@Test
void openBrowser() {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\asmat\\Downloads\\chromedriver_win32\\chromedriver.exe");
	dr=new ChromeDriver();
	dr.get("");
	Actions ac=  new Actions(dr);
	
	WebElement source=dr.findElement(By.xpath(""));
	WebElement terget=dr.findElement(By.xpath(""));
	ac.dragAndDrop(source, terget);


dr.navigate().back();
dr.navigate().forward();
}
}
