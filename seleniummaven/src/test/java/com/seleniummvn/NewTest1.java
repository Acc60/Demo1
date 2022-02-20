package com.seleniummvn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest1 {
  @SuppressWarnings("deprecation")
@Test
  public void f() {
	  System.out.println("Running first Testng test with maven ");
	  
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
	  
	  driver.get("https://kite.zerodha.com");
	  driver.findElement(By.id("userid")).sendKeys("BD3164");
	  driver.findElement(By.id("password")).sendKeys("Sharma@60");
	  driver.findElement(By.xpath("//*[@class='button-orange wide']")).click();
	  driver.findElement(By.id("pin")).sendKeys("903961");
	  driver.findElement(By.xpath("//*[@class=\'button-orange wide\']")).click();
	 // driver.switchTo().alert().dismiss();
	  system.out.println("Printing to showcase the pull one");
	  driver.close();
	  
	  
	  
  }
}
