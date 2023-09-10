package com.seleniummvn;

import org.testng.asserts.SoftAssert;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.tools.ant.util.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import seleniummaven.fun;

import org.openqa.selenium.remote.http.ConnectionFailedException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Test3 implements fun{
	
	
	
	Test3(){
		System.out.println("Inside default constructor");
			}
	
	Test3(String str){
		System.out.println("Inside artificial constructor ==" + str);
			}
	
	
	public void t1() {
		
		System.out.println("Inside t1 method");
		

	

}
	
@SuppressWarnings("deprecation")
public static void main(String[] args) throws InterruptedException, SQLException {
	System.out.println(color);
	Test3 t= new Test3("Nitish");
	t.t1();
	//t.Test3("Nitish");
	
	
	 // System Property for Chrome Driver   
   /* System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAHUL\\Downloads\\chromedriver_win32\\chromedriver.exe");  
    WebDriver driver= new ChromeDriver(); */
    
    

 // Start new EDGE Browser
    
   System.setProperty("webdriver.edge.driver", "C:\\Users\\RAHUL\\Downloads\\edgedriver_win64\\msedgedriver.exe");
    EdgeOptions options = new EdgeOptions();
    options.addArguments("--remote-allow-origins=*");
    options.addArguments("--disable-blink-features=AutomationControlled");
      WebDriver driver = new EdgeDriver(options);
      //driver.findElement(by.)
 
    /*  driver.manage().window().maximize();
      System.out.println(" printing after maximising the Browser");
        
      
       System.out.println(" printing after waiting for few seconds for the Browser");
       // Launch Website  
       
    driver.navigate().to("https://www.nseindia.com/");  
    
    driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
      
    System.out.println(" printing after browsing the Browser");  
       Thread.sleep(10000);
    
     
    
    System.out.println("after clicking url is "+ driver.getCurrentUrl());
    
  WebElement ele=driver.findElement(By.xpath("html//body//header//a[1]//img[1]"));
    String ele1=ele.getText();
    System.out.println(ele1);
    Thread.sleep(3000);
    
        WebDriverWait wait=new WebDriverWait(driver, 30) ;
         
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("html//body//header//a[1]//img[1]"))));
    //Thread.sleep(10000);
      //  driver.findElement(By.id("nseMarketStatus"));
        driver.findElement(By.id("tabList_NIFTYNEXT50")).click();
    
      //  driver.findElement(By.id("link_2")).click();
        
       // wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@value='Pre-Open Market']"))));
       // driver.findElement(By.xpath("//*[@value='Pre-Open Market']")).click();
        
        
       // Robot robot= new Robot();
        
        Thread.sleep(6000);
        Set<String> st= driver.getWindowHandles();
        String past=driver.getWindowHandle();
        String popst=null;
        System.out.println(st);
        Iterator<String> it= st.iterator();
        Thread.sleep(3000);
        while (it.hasNext()) {
        	popst=it.next();
        }
        
        Thread.sleep(3000);
      driver.switchTo().window(popst);
      System.out.println(driver.getCurrentUrl());
      Thread.sleep(3000);
      
      driver.switchTo().window(past);*/
        
       // Thread.sleep(4000);
        
     /*  driver.findElement(By.id("link_2")).click();
        
        Actions ac=new Actions(driver);
        
       WebElement element2=driver.findElement(By.id("link_2"));
        Thread.sleep(2000);
        
        ac.moveToElement(element2).build();
        System.out.println(element2.getText());
        Thread.sleep(2000);
        
        WebElement element3=driver.findElement(By.xpath("//a[text()='Pre-Open Market']"));
        
        ac.moveToElement(element3).build().perform();
        System.out.println(element3.getText());
        Thread.sleep(2000);
        element3.click();
        
        Thread.sleep(5000); 
        
       // Thread.sleep(15000);
       WebElement tbl=driver.findElement(By.xpath("//*[@id='livePreTable']")); 	
       List<WebElement> rows=tbl.findElements(By.tagName("tr"));
       
       String stocks1 = null;
       String stocks2=null;
       String stocks3=null;
       String stocks49 = null;
       String stocks50 = null;
       String stocks51 = null;
       
       String percentage1=null;
       String percentage2=null;
       String percentage3=null;
       String percentage49=null;
       String percentage50=null;
       String percentage51=null;
       
      // for(int i=1;i<=(rows.size())-2;i++) {
    	 //  System.out.println("The element on respective index is  --"+ rows.get(i).getText());
    	   List<WebElement> l1=rows.get(1).findElements(By.tagName("td"));
    	   List<WebElement> l2=rows.get(2).findElements(By.tagName("td"));
    	   List<WebElement> l3=rows.get(3).findElements(By.tagName("td"));
    	   List<WebElement> l49=rows.get(49).findElements(By.tagName("td"));
    	   List<WebElement> l50=rows.get(50).findElements(By.tagName("td"));
    	   List<WebElement> l51=rows.get(51).findElements(By.tagName("td"));
    	   
    	  // for(int j=1;j<=l1.size();j++) {
    	   stocks1=l1.get(1).getText();
    	   percentage1=l1.get(5).getText();
    	   
    	   stocks2=l2.get(1).getText();
    	   percentage2=l2.get(5).getText();
    	   
    	   stocks3=l3.get(1).getText();
    	   percentage3=l3.get(5).getText();
    	   
    	   stocks49=l49.get(1).getText();
    	   percentage49=l49.get(5).getText();
    	   
    	   stocks50=l50.get(1).getText();
    	   percentage50=l50.get(5).getText();
    	   
    	   stocks51=l51.get(1).getText();
    	   percentage51=l51.get(5).getText();
    	  
    	   
    	   
      // }
     //  }
       System.out.println("The stats for today's Pre market open is as follows ::");
       System.out.println();
	   System.out.println("The stock at start(1st) place is -"+ stocks1 +"  - with percentage =  "+percentage1 );
	   System.out.println("The stock at start(2nd) place is -"+ stocks2 +"  - with percentage =  "+percentage2 );
	   System.out.println("The stock at start(3rd) place is -"+ stocks3 +"  - with percentage =  "+percentage3 );
	   System.out.println();
	   System.out.println("The stock at  last(3rd) place is -"+ stocks49 +" - with percentage =  "+percentage49 );
	   System.out.println("The stock at  last(2nd) place is -"+ stocks50 +" - with percentage =  "+percentage50 );
	   System.out.println("The stock at last place is       -"+ stocks51 +" - with percentage =  "+percentage51 );
         System.out.println();
         System.out.println();
       System.out.println("the size of table is -- " +rows.size());
      
     driver.quit();
      System.out.println(" printing after quitting the Browser");
      
      Connection con=DriverManager.getConnection(null, null, null);
        Statement  stmt = con.createStatement();
        String  s="update employee name=nitish where nsme=null";
        ResultSet rst=stmt.executeQuery(s);
        
        while (rst.next()){
        	System.out.println(rst.getString(0));}
      
      
      
      
        File ff=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyToFile(ff, newFile());
        
        Actions a=new Actions(driver);
        a.dragAndDrop(element3, tbl);
        
        WebDriver driver1;
        System.setProperty(WebDriver.chromeDriver.driver, "");
        driver= newchromedriver;
        
        WebElement dd= driver.findElement(By.tagName(percentage51));
        Select op=new Select(dd);
        dd.selebyvalue();
        
        List<WebElement> lst=driver.findElements(By.tagName("a"));
        for(WebElement e:lst) {
        	System.out.println(e.getText());
        }
        
        WebElement dd1=driver.findElement(By.id(percentage51));
        List<WebElement> opt=dd1.findElements(By.tagName("option"));
        
        while(opt.hasNext) {
        	dd1.getText();
        }
        
        try {
        	Set<String> l11=driver.getWindowHandles();
            For(String ss:l11){
            	driver.switchTo().window(ss);
            }
		} catch (Exception e) {
			System.out.println(e);
		}
        finally {
			System.out.println("Inside finally block");
		}
       

        
        Assert.assertEquals("","");*/
        
      
        
        int[] ar= {1,2,3,4,5};
        
        try {
        for(int i =0;i<=ar.length;i++) {
        	System.out.println(ar[i]);
        }} catch(Exception e) {
        	System.out.println(e);
        }finally {
        	System.out.println("printing in the finally ststement");
        }
        
        List<Integer> l21=new LinkedList<Integer>();
        l21.add(6);
        l21.add(7);
        l21.add(8);
        
       /* try {
        int j=0;
        
        while(j<l21.size()) {
        	System.out.println(l21.get(j));
        }}catch (Exception e){
        	System.out.println(e);
        }*/
        
        int n=34543;
        
        int temp,r;
        int sum=0;
        temp=n;
        while(n>0) {
        	r=n%10;
        	sum=sum*10+r;
        	n=n/10;
        }
        
        System.out.println(n);
        System.out.println(sum);
        if (temp==sum) {
        	System.out.println("it's a palindrome number");
        }else {
        	System.out.println("Not a palindrome number");
        }
        
        
        String s11="Nitish,is,typing";
        List<String> s12=new ArrayList<String>(Arrays.asList(s11.split(",")));
        System.out.println(s12);
        
        
      
        
}

}
