import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driverr = new ChromeDriver();
		driverr.get("https://katalon-demo-cura.herokuapp.com/");
		driverr.findElement(By.id("btn-make-appointment")).click();
		//driverr.findElement(By.className("btn btn-dark btn-lg")).click();
		driverr.findElement(By.name("username")).sendKeys("John Doe");
		driverr.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
		driverr.findElement(By.id("btn-login")).click();
		//driverr.findElement(By.linkText("info@katalon.com")).click();
		String text = driverr.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		

	}
	

}
