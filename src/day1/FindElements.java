package day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FindElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
		
		Select size = new Select(driver.findElement(By.name("example_length")));
		size.selectByValue("100");
		
		WebElement table = driver.findElement(By.id("example")).findElement(By.tagName("tbody"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		System.out.println(driver.findElement(By.id("example")).findElement(By.tagName("tr")).findElements(By.tagName("th")).get(1).getText());
		for(int i=0;i<rows.size();i++)
		{
			//System.out.println(rows.get(i).getText());
			String name = rows.get(i).findElements(By.tagName("td")).get(1).getText();
			System.out.println(name);
			if(name.equals("Brenden Wagner"))
			{
				//rows.get(i).findElements(By.tagName("td")).get(0).click();
				rows.get(i).findElement(By.tagName("td")).click();
			}
		}
		System.out.println(""+table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td")).get(4).getText());
		
		
//		driver.quit();
	}

}
