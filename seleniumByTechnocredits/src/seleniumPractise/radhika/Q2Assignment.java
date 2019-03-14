package seleniumPractise.radhika;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import util.Init;

public class Q2Assignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = Init.initChromeDriver();
		driver.get("http://automationbykrishna.com/#");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Basic Elements")).click();
		driver.findElement(By.partialLinkText("Basic El"));
		System.out.println("Click on  basic elements page");
		Thread.sleep(8500);
		((JavascriptExecutor) driver).executeScript("scroll(0,400)");
		Thread.sleep(8200);
		// click on Alert button
		driver.findElement(By.xpath("//button[@type='submit' and @id='javascriptAlert']")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(8000);
		if (alert.getText().equals("You must be TechnoCredits student!!")) {
			System.out.println("text present in alert is validated");
			alert.accept();
		}
		driver.quit();
	}

}
