package org.step;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class stepdefinitation {
WebDriver driver;
@Given("User Have To Launch The Quince Application Through Edge Browser")
public void user_Have_To_Launch_The_Quince_Application_Through_Edge_Browser() {
	driver = new ChromeDriver();
	driver.get("https://www.quince.com/");
}
@Given("User Have To Maximize The Window")
	public void user_Have_To_Maximize_The_Window() {
	driver.manage().window().maximize();
}
@When("User Have To Click The Sigin Button")
public void user_Have_To_Click_The_Sigin_Button() {
	driver.findElement(By.className("header-module--iconsWrapper__myAccountLink__title--64718")).click();
}
@When("User Have To Enter Valid Email")
public void user_Have_To_Enter_Valid_Email() throws InterruptedException {
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//input[@type='email'])")).sendKeys("jsd@gmail.com");
   //driver.findElement(By.className("Input__StyledInputContainer-sc-17t2x01-3 hyUwSf")).sendKeys("asd@gmail.com");
}
@When("User Have To Click Continue")
public void user_Have_To_Click_Continue() throws InterruptedException {
	Thread.sleep(1000);
    driver.findElement(By.xpath("//span[@class='Button__TextWrapper-sc-18qh75k-0 ghPvoH']")).click();
}
@When("User Have To Enter Valid Name and LastName and Password")
public void user_Have_To_Enter_Valid_Name_and_LastName_and_Password() throws InterruptedException {
	Thread.sleep(2000);
   driver.findElement(By.xpath("//input[@placeholder='Name and Last Name']")).sendKeys("Jsd Hjk");
   Thread.sleep(4000);
   driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Jsd mnHjk");
}
@Then("User Have To Click The Continue Button")
public void user_Have_To_Click_The_Continue_Button() throws InterruptedException, AWTException {
	 Robot r1 = new Robot();
	    for (int i=0; i<3 ;i++)
		{
	    r1.keyPress(KeyEvent.VK_TAB);
		r1.keyRelease(KeyEvent.VK_TAB);
		}
	    
	    r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyRelease(KeyEvent.VK_ENTER);
	 
}
}



