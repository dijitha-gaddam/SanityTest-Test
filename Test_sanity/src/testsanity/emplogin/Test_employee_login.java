package testsanity.emplogin;



import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;


import testsanity.yarn.TestRetry;



public class Test_employee_login {



	@Test(retryAnalyzer=TestRetry.class)
	public void testEmpLogin() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\dijitha\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://stagingdashboard.modjoul.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(35,TimeUnit.SECONDS);
	System.out.println(driver.getTitle());
	driver.findElement(By.name("username")).sendKeys("Halva@mailinator.com");
	driver.findElement(By.name("password")).sendKeys("modjoul105");
	driver.findElement(By.cssSelector("button[ng-click='login();']")).click();
	Thread.sleep(50000);
	Reporter.log("Dashboard Url: stagingdashboard.modjoul.com",true);
	Reporter.log("Username: Halva@mailinator.com",true);
	Reporter.log("password: **********",true);
	String LastActivityTime=driver.findElement(By.xpath("//div[contains(@class,'row ng-binding ng-scope')]")).getText();
	driver.findElement(By.partialLinkText("SCORECARD")).click();
	Thread.sleep(70000);
	driver.findElement(By.xpath("//span[contains(@class,'ng-binding')]")).click();
	Thread.sleep(3000);
	String TotalWorkTime=driver.findElement(By.xpath("//div[contains(@class,'ng-binding ng-scope')]")).getText();
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/h4[1]/a[1]/span[1]")).click();
	Thread.sleep(3000);
	String walkingmetricactivity=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).getText();
	String walkingstepcount=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]")).getText();
	String walkingdistance=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]")).getText();
	String walkingspeed=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]")).getText();
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[4]/div[2]/div[1]/h4[1]/a[1]/span[1]")).click();
	Thread.sleep(3000);
	String totalbends=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[4]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")).getText();
	String bendingduration=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[4]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).getText();
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/h4[1]/a[1]/span[1]")).click();
	Thread.sleep(3000);
	String totaltwists=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[5]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")).getText();
	String twistingduration=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[5]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).getText();
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[6]/div[2]/div[1]/h4[1]/a[1]/span[1]")).click();
	Thread.sleep(3000);
	String sittingstandingduration=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[6]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).getText();
	driver.findElement(By.xpath("//a[@id='DRIVING']//span[@class='ng-binding'][contains(text(),'DRIVING')]")).click();
	Thread.sleep(3000);
	String drivingmetricactivity=driver.findElement(By.xpath("//div[@class='panel-body']//div[@class='panel-collapse collapse in']//div[@class='panel-body']//div[@class='ng-binding ng-scope']")).getText();
	String drivingdistance=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[7]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]")).getText();
	Reporter.log(LastActivityTime,true);
    Reporter.log("Total work time is :"+" " + TotalWorkTime,true);
    Reporter.log("-------------------------------------------------",true);
    Reporter.log("-------------------------------------------------",true);
	Reporter.log("Walking duration is : " + " " + walkingmetricactivity,true);
	Reporter.log(" Walking step count is : " + " " + walkingstepcount,true);
	Reporter.log("Walking distance in miles is :"+" " +walkingdistance,true);
	Reporter.log("WalkingSpeed in miles/hour is : " +" " +walkingspeed,true);
	Reporter.log("-------------------------------------------------",true);
	Reporter.log("-------------------------------------------------",true);
	Reporter.log("Total Bend count is : "+" "+totalbends,true);
    Reporter.log("Bending duration is :"+ " " +bendingduration,true);
    Reporter.log("-------------------------------------------------",true);
    Reporter.log("-------------------------------------------------",true);
    Reporter.log("Total twistCount is : "+" " +totaltwists,true);
	Reporter.log("Twisting duration is : " + " "+twistingduration,true);
	Reporter.log("-------------------------------------------------",true);
    Reporter.log("-------------------------------------------------",true);
	Reporter.log("sitting/Standing duration is : "+ " "+sittingstandingduration,true);
	Reporter.log("-------------------------------------------------",true);
    Reporter.log("-------------------------------------------------",true);
	Reporter.log("Driving duration is " + " " + drivingmetricactivity,true);
	Reporter.log("Driving distance in miles is : "+" " +drivingdistance,true);
	Reporter.log("-------------------------------------------------",true);
    Reporter.log("-------------------------------------------------",true);
	driver.findElement(By.cssSelector("button[ng-click='logout()']")).click();
	Reporter.log("completed ", true);
	driver.close();
	
}
	
}



