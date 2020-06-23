package day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		FirefoxOptions opt = new FirefoxOptions();
//		opt.addPreference("browser.download.dir", "C:\\myfolder");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.get("http://www.echoecho.com/javascript4.htm");
//		Thread.sleep(3000);
//		driver.findElement(By.name("B3")).click();
//		driver.switchTo().alert().sendKeys("Hello");
//		Thread.sleep(5000);
//		System.out.println(driver.switchTo().alert().getText());
////		driver.switchTo().alert().accept();
//		driver.switchTo().alert().dismiss();
		driver.get("http://naukri.com");
		driver.findElement(By.id("file_upload")).sendKeys("/Users/natarajan/Downloads/NATARAJAN RAMANATHAN_Trainer.pdf");
//		driver.get("https://www.sejda.com/pdf-editor");
		
//		driver.findElement(By.name("file")).sendKeys("/Users/natarajan/Downloads/NATARAJAN RAMANATHAN_Trainer.pdf");
	}

}
