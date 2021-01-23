package creat;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestListener;
import org.testng.annotations.Test;

public class Listner implements ITestListener {
	
	@Test
	public void Com(WebDriver dr) {
		String a="fom";
		String b="aom";
		String sa=new String();
		new Actions(dr);
		
	Select se=	new Select(dr.findElement(By.id("")));
List<WebElement> it=se.getOptions();
for(WebElement t:it) {
String str=	t.getText();
Boolean bo=str.contains("janu");
System.out.println(bo);
if(bo.equals(true)) {
	System.out.println("janu have");
	
}
else {
	System.out.println("no janu");
}
}
		
				
	int i=	a.compareTo(b);
	System.out.println(i);
	}

}
