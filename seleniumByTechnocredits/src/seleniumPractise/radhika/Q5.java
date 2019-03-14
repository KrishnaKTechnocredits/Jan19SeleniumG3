package seleniumPractise.radhika;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import util.Init;

public class Q5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = Init.initChromeDriver();
		System.out.println("Browser Open");
		driver.navigate().to("http://automationbykrishna.com/#");
		System.out.println("URL Opened");
		driver.findElement(By.id("registration2")).click();
		System.out.println("User clicked on the Registration button ");
		driver.manage().window().maximize();
		// JavascriptExecutor js = (JavascriptExecutor) driver;
		((JavascriptExecutor) driver).executeScript("scroll(0,400)");
		// driver.findElement(By.id("unameSignin")).sendKeys("Vedika");
		driver.findElement(By.xpath("//input[@id='unameSignin' and @class='form-control' ]")).sendKeys("Vedika");
		System.out.println("Username filled ");
		driver.findElement(By.id("pwdSignin")).sendKeys("1234567");
		System.out.println("PAssword Entered ");
		driver.findElement(By.id("btnsubmitdetails")).click();
		String str1 = "Failed! please enter strong password";
		Alert alert = driver.switchTo().alert();
		String str2 = alert.getText();
		System.out.println(str2);
		System.out.println("GetText from thepop up ");
		if (str1.equals(str2)) {
			System.out.println("It is correct pop up and you enetered less than 8 ");
		} else {
			System.out.println("you entered correct password i.e greater than 8  ");
		}
		Thread.sleep(3000);
		driver.close();

	}
}
