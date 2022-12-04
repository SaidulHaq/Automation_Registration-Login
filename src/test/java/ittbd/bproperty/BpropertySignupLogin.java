package ittbd.bproperty;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BpropertySignupLogin extends MainDriver {
	
	String testMail = randomMail();

	@Test(priority = 0)
	public void HitUrl() throws InterruptedException {

		driver.get(BpropertyUrl);
		driver.manage().window().maximize();
		Thread.sleep(5000);

	}

	@Test(priority = 1)
	public void SignupFormFillup() throws InterruptedException {
		
		// SignUp Button
		driver.findElement(By.xpath("//span[contains(text(),'Log in')]")).click();
		Thread.sleep(3000);

		// Become Member Button
		driver.findElement(By.xpath("//button[contains(text(),'Become a free member')]")).click();
		Thread.sleep(3000);

		// Name
		driver.findElement(By.name("name")).sendKeys(randomName());
		Thread.sleep(2000);

		// Mail (Random)
		driver.findElement(By.name("email")).sendKeys(testMail);
		Thread.sleep(2000);

		// Password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Admin12345");
		Thread.sleep(2000);

		// Confirm Password
		driver.findElement(By.name("repeatPassword")).sendKeys("Admin12345");
		Thread.sleep(2000);

		// Phone No.
		driver.findElement(By.className("form-control")).sendKeys("1722256477");
		Thread.sleep(2000);

		// Sign As Drop down
		driver.findElement(By.xpath("//div[contains(text(),'Signing up as *')]")).click();
		Thread.sleep(2000);

		// Sign As Drop down - Researcher
		driver.findElement(By.xpath("//label[contains(text(),'Researcher')]")).click();
		Thread.sleep(2000);
		
		// Not Robot (Radio Button)
		//driver.findElement(By.className("_0e6fb7f9")).click();
		//Thread.sleep(2000);

		// Terms & Condition (Radio Button)
		//driver.findElement(By.xpath("//input[@id='termsAgreed']")).click();
		//Thread.sleep(2000);

		// Notification, Promotion (Radio Button)
		//driver.findElement(By.xpath("//label[contains(text(),'I would like to receive notifications about promot')]")).click();
		//Thread.sleep(2000);
		
		// Click Register
		driver.findElement(By.xpath("//body/div[@id='body-wrapper']/main[1]/div[1]/div[2]/div[3]/form[1]/button[1]")).click();
		Thread.sleep(3000);

	}

/*
	@Test(priority = 2)
	public void Login() throws InterruptedException {
		
		// Click Login Text
		driver.findElement(By.xpath("//span[contains(text(),'Log in')]")).click();
		Thread.sleep(3000);
		
		// Fill UserName
		driver.findElement(By.name("email")).sendKeys(testMail);
		Thread.sleep(3000);

		// Fill PassWord
		driver.findElement(By.name("password")).sendKeys("Admin12345");
		Thread.sleep(3000);

		// Click Login
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		Thread.sleep(2000);

	}


	@Test(priority = 3)
	public void newProject() throws InterruptedException {
		
		// Click New Project
		driver.findElement(By.xpath("//a[contains(text(),'New Projects')]")).click();
		Thread.sleep(3000);

		driver.navigate().back();
		Thread.sleep(3000);

		driver.navigate().forward();
		Thread.sleep(3000);

		driver.navigate().refresh();
		Thread.sleep(3000);

	}

	
	@Test(priority = 4)
	public void Logout() throws InterruptedException {
		
		// Click Profile
		driver.findElement(By.xpath("//span[contains(text(),'admin')]")).click();
		Thread.sleep(2000);

		// Click Logout
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		Thread.sleep(2000);
	}*/

}
