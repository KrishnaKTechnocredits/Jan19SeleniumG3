package seleniumPractise.radhika;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Init;

public class Q3Assignment {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = Init.initChromeDriver();
		System.out.println("Browser Open");
		driver.navigate().to("http://automationbykrishna.com/#");
		System.out.println("URL Opened");
		
		driver.findElement(By.linkText("Basic Elements")).click();

		// driver.findElement(By.partialLinkText("Basic El"));

		System.out.println("on basic elements page");

		Thread.sleep(4000);

		WebElement e1 = driver.findElement(By.xpath("//header[text()=' Different Examples of Alerts ']"));
		// scrolling till text "DifferentExamples" before clicking on alert button

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", e1);
		Thread.sleep(4000);
		// click on javascript Confirmation button
		driver.findElement(By.id("javascriptConfirmBox")).click();

		Alert alert = driver.switchTo().alert();
		Thread.sleep(4000);
		// press ok
		alert.accept();

		// verify text
		if (driver.findElement(By.id("pgraphdemo")).getText().equals("You pressed OK!")) {
		System.out.println("text verified on pressing ok");
		} else {
		System.out.println("text NOT verified on presseing ok");
		}
		// press cancel and verify text
		driver.findElement(By.id("javascriptConfirmBox")).click();

		Thread.sleep(4000);
		// press Cancel
		alert.dismiss();

		// verify text on cancelling
		if (driver.findElement(By.id("pgraphdemo")).getText().equals("You pressed Cancel!")) {
		System.out.println("text verified on pressing Cancel");
		} else {
		System.out.println("text NOT verified on presseing Cancel");
		
		}
	
	}
}
