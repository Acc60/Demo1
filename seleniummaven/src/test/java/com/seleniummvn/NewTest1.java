package com.seleniummvn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.cucumber.testng.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class NewTest1 {
	
	NewTest1(){
		System.out.println("Inside class main constructor");
	}
	
	
	
	public void  t1(String a1, int a2) {
	System.out.println("Inside t1 method having two arguments as string and integer + a1 + a2 ="+a1+a2);
}
	
	public void t1(int a1,int a2) {
	System.out.println("inside t1 method having only two integers as aarguments"+a1+a2);
	}
	
	public static void main (String[] ags) {
		System.out.println("Inside main method");
		
		NewTest1 az=new NewTest1();
		az.t1(23, 56);
		az.t1("Corrspondence", 87);
	}
	
	
	
	
	
	
	
	 // System.out.println("Running first Testng test with maven ");
	  
	  /*WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
	  
	  driver.get("https://kite.zerodha.com");
	  driver.findElement(By.id("userid")).sendKeys("BD3164");
	  driver.findElement(By.id("password")).sendKeys("Sharma@60");
	  driver.findElement(By.xpath("//*[@class='button-orange wide']")).click();
	  System.out.println("Changes to show");
	  driver.findElement(By.id("pin")).sendKeys("903961");
	  driver.findElement(By.xpath("//*[@class=\'button-orange wide\']")).click();
	 // driver.switchTo().alert().dismiss();
	 // system.out.println("Printing to showcase the pull one");
	  //driver.close();
	  //anuj is looking for demo. 
	  */
	 /* System.out.println("printing after commented line");
	  
	  WebDriver driver;
	  System.setProperty("Webdriver.chrome.driver", "c:");
	  driver=new ChromeDriver();
	  
	  driver.get(null);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.MILLISECONDS);
	  
	  driver.findElement(By.xpath("")).getText();
	  
	  Select dd=new Select(driver.findElement(By.xpath("")));
	  dd.selectByIndex(0);
	  
	 //navigating through webelements of a table 
	  WebElement wbe= driver.findElement(By.xpath(""));
	  List<WebElement> l=wbe.findElements(By.tagName(""));
	   for (WebElement wb:l) {
		   List<WebElement> c=wb.findElements(By.tagName(""));
		   for (int i=0;i<=c.size();i++){
			   if (i==0 || i==4) {
				   System.out.println("Printing webelements of table looks fine");
			   }
			   
		   }
	   }
	   
	   // getting all options of a particular dropdown
	   WebElement dde=driver.findElement(By.xpath(""));
	   List<WebElement> ld=dde.findElements(By.tagName("options"));
	  for (int i=0;i<=ld.size();i++) {
		  System.out.println(i);
	  }
	  
	  //moving to new window handles:
	  Set<String> wh=driver.getWindowHandles();
	  for (String t:wh) {
		  driver.switchTo().window(t);
	  }
	  
	  
	  System.out.println("Starting new practice session");
	  
	  select * from table
	  update table set name="" where id=89
	  delete from  table where id=89
	  create table (id varchar 30,nAame Varchar 20)
	  
	  @RunWith(Cucumber.class)
	  @CucumberOptions(features="le nam",
	  glue="step definition name",
	  monochrome=true,
	  plugin= {pretty,html:target/htmlreports},
	  tags="Smoketest"
	  
	  )
	  
	  public class Runner{
		  
	  }
	  
	  
	 List<Integer> l1=new ArrayList<Integer>();
	 System.out.println(l1.size());
	 l1.add(1);
	 System.out.println(l1);
	 System.out.println(l1.size());
	 
	 List<String> l2=new LinkedList<String>();
	 System.out.println(l2.size());
	 
	 HashMap <Integer,String> h1=new HashMap<Integer,String>();
	 System.out.println(h1.size());
	 
	 Assert.assertEquals(false, false);
	  
	  SoftAssert st=new SoftAssert();
	  String a="Job Seeker";
	  String b="Job Seekers";
	boolean z;  
	 st.assertEquals(a, b,"moved to next step even after providing two unequal string just because soft assert is used");
	  
	  
	  try {
		int n=0;
		int p=10/n;
		System.out.println(p);
	} catch (Exception e) {
		System.out.println(e);
	}
	  finally {
		System.out.println("finally inside finally block after transversing through try and cytch block");
	}
	  
  }
  
  
      @BeforeClass
	  public void i() {
		  
	  System.out.println("inside first I method");
	  }
	  
	  @BeforeTest
	  public void j() {
		  System.out.println("inside second j method");
	  }
	  
	  @BeforeMethod
	  public void k() {
		  System.out.println("inside third k method");
	  }
	  
	  
	  @Test(priority=1)
	  public void l() {
		  System.out.println("inside fourth l method");
	  }
	  
	  @AfterMethod
	  public void m() {
		  System.out.println("inside fifth m method");
	  }
	  
	  @AfterTest
	  public void n() {
		  System.out.println("inside sixth n method");
	  }
	  
	  @AfterClass
	  public void o() {
		  System.out.println("inside seventh o method");
	  }
	  */
	  
	  
	
  
		  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  
}
