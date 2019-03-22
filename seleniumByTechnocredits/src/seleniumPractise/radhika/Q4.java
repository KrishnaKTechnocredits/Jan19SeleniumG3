package seleniumPractise.radhika;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import util.Init;

public class Q4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = Init.initChromeDriver();
		System.out.println("Browser Open");
		driver.navigate().to("http://automationbykrishna.com/#");
		System.out.println("URL Opened");
		driver.findElement(By.id("basicelements")).click();
		driver.manage().window().maximize();
		((JavascriptExecutor) driver).executeScript("scroll(0,4000)");
		/*
		 * JavascriptExecutor js = (JavascriptExecutor) driver;
		 * ((JavascriptExecutor) driver).executeScript("scroll(0,4000)");
		 */
		driver.findElement(By.id("javascriptPromp")).click();
		System.out.println("javascrpit pop up gets open");
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("vedika");
		alert.accept();
		String s1 = alert.getText();
		System.out.println(s1);
		if (s1.equals("Hello vedika! How are you today?")) {
			System.out.println("You clicked on okay ");
		} else {
			System.out.println("You clicked cancel ");
		}
		Thread.sleep(5000);
		driver.close();
		driver.quit();

	}
}
