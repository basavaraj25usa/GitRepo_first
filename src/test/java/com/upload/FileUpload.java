package com.upload;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/upload-download");
		Thread.sleep(3000);
		driver.findElement(By.id("uploadFile")).sendKeys("C:\\Users\\basav\\Desktop\\Selnium 2\\BDD\\webtable.png");
	}

}
