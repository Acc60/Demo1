package com.seleniummvn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3 {
	
	
	
	Test3(){
		System.out.println("Inside default constructor");
			}
	
	Test3(String str){
		System.out.println("Inside artificial constructor");
			}
	
	
	public void t1() {
		
		System.out.println("Inside t1 method");
		
		 
	 /*WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
	driver.get("https://kite.zerodha.com");
	*/
	

}
	
public static void main(String[] args) throws InterruptedException {
	
	Test3 t= new Test3("Nitish");
	t.t1();
	//t.Test3("Nitish");
	
	 // System Property for Chrome Driver   
    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");  
    WebDriver driver= new ChromeDriver(new ChromeDriverService.Builder().usingPort(65535).build());  
         // Instantiate a ChromeDriver class.     
   // WebDriver driver=new ChromeDriver();  
       driver.wait(2000);
       // Launch Website  
    driver.navigate().to("http://www.javatpoint.com/");  
      
     //Maximize the browser  
      driver.manage().window().maximize();  
      
}

}
