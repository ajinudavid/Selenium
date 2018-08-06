package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Experiment1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
                "D:\\SeleniumGit\\Selenium\\Selenium root\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		/*WebElement value=driver.findElement(By.id("src"));
		value.sendKeys("kochi");
		WebElement value2=driver.findElement(By.id("dest"));
		value2.sendKeys("Bangalore");*/
		driver.findElement(By.xpath("//label[@for='onward_cal']")).click();
		
		
		

	}

}
