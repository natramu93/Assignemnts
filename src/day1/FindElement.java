package day1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FindElement {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,30);
		driver.get("http://magento.com");
//		driver.findElement(By.xpath("//*[@id=\"block-header\"]/ul/li[9]/a/span[1]/div")).click();
//		WebElement user_icon = driver.findElement(By.xpath("//*[@id=\"block-header\"]/ul/li[9]/a/span[1]/div"));
//		user_icon.clear();
//		user_icon.click();
//		System.out.println(user_icon.getAttribute("class"));
//		System.out.println(user_icon.getAttribute("id"));
//		System.out.println(user_icon.getCssValue("background-image"));
//		Point user_icon_location = user_icon.getLocation();
//		System.out.println(user_icon_location);
//		byte[] ss = user_icon.getScreenshotAs(OutputType.BYTES);
//		FileOutputStream fos = new FileOutputStream("UserIcon.png");
//		fos.write(ss);
		
//		user_icon.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"block-header\"]/ul/li[9]/a/span[1]/div")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"block-header\"]/ul/li[9]/a/span[1]/div")));
		driver.findElement(By.xpath("//*[@id=\"block-header\"]/ul/li[9]/a/span[1]/div")).click();
		WebElement user_ip = driver.findElement(By.id("email"));
//		System.out.println(user_ip.getAttribute("value"));
		user_ip.clear();
		user_ip.sendKeys("natarajan@gmail.com");
		WebElement pwd_ip = driver.findElement(By.id("pass"));
		pwd_ip.clear();
		pwd_ip.sendKeys("welcome");
		driver.findElement(By.id("send2")).click();
		
		wait.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div"), "Invalid login or password."));
		System.out.println("As Expected");
//		String error = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div")).getText();
//		System.out.println("Error message is: "+error);
//		if(error.equals("Invalid login or password."))
//		{
//			System.out.println("As expected");
//		}
	}

}
