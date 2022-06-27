package com.seleniummvn;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest2 {
  @Test
  public void runn() {
System.out.println("Running Second Testng test with maven ");
List<Integer> l1=new ArrayList<Integer>();
l1.add(1);
l1.add(2);
l1.add(3);
l1.add(4);
l1.add(5);
l1.add(6);

System.out.println(l1);
	   
  }
}
