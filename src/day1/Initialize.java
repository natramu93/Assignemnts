package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Initialize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Interface - WebDriver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.close();
//		driver.quit();
		driver.get("http://magento.com");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		if(url.startsWith("https"))
		{
			System.out.println("Secured");
		}
		
		if(url.equals("https://magento.com/"))
		{
			System.out.println("As expected");
		}
		
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("eCommerce Platforms | Best eCommerce Software for Selling Online | Magento"))
		{
			System.out.println("As Expected");
		}
		
		driver.navigate().back();
		driver.navigate().refresh();
		
		driver.get("http://yahoo.com");
		
		driver.navigate().to("http://google.com");
		
		//System.out.println(driver.getCurrentUrl());
		driver.quit();
	}

}
