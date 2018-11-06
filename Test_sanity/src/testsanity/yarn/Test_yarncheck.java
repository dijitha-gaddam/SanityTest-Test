package testsanity.yarn;

	import java.io.IOException;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.Reporter;
	import org.testng.annotations.Test;


	public class Test_yarncheck {
	
		@Test(retryAnalyzer=TestRetry.class)
		public void devYarn() throws  InterruptedException, IOException
		{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dijitha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(6000);
		//Runtime.getRuntime().exec("C:\\Users\\dijitha\\Desktop\\Auto IT scripts\\TEST_TEST_YARN.exe");
driver.get("http://dijitha:Dijitha@123!@testgetbook.modjoul.com");
driver.manage().timeouts().implicitlyWait(35,TimeUnit.SECONDS);
/*
driver.findElement(By.linkText("RUNNING")).click();
driver.navigate().refresh();
driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
String job = driver.findElement(By.xpath("//tr//td[text()='MetricComputeWF']")).getText();
Reporter.log("Data pushed on dev environment and Streaming completed");
   Assert.assertEquals(job, "MetricComputeWF");
      Reporter.log("MetricComputeWF job is running",true);
		driver.findElement(By.partialLinkText("application")).click();
		Thread.sleep(6*60*1000);
		driver.navigate().refresh();
		String finalstatus=driver.findElement(By.xpath("//td[contains(text(),'SUCCEEDED')] ")).getText();
		System.out.println(finalstatus);
		Assert.assertEquals(finalstatus,"SUCCEEDED");
		Reporter.log("Metric compute job is completed",true);
   String Elapsedtime=driver.findElement(By.xpath("//tr[10][@class='odd']//td")).getText();
   Reporter.log("Total time taken to complete metric compute job  is : "+ Elapsedtime,true);
   driver.findElement(By.linkText("FINISHED")).click();
   driver.findElement(By.cssSelector("table.ui-widget-content:nth-child(3) td.content:nth-child(2) div.dataTables_wrapper:nth-child(3) table.dataTable:nth-child(2) tbody:nth-child(3) tr.even:nth-child(2) td.sorting_1:nth-child(1) > a:nth-child(1)")).click();
   String finalstatus1=driver.findElement(By.xpath("//td[contains(text(),'SUCCEEDED')] ")).getText();
System.out.println(finalstatus1);
Assert.assertEquals(finalstatus,"SUCCEEDED");
Reporter.log("Activity timeline job is completed",true);
String Elapsedtime1=driver.findElement(By.xpath("//tr[10][@class='odd']//td")).getText();
Reporter.log("Total time taken to complete activitytimeline job  is : "+ Elapsedtime1,true);  
   driver.close();
   */
driver.findElement(By.linkText("FINISHED")).click();
Thread.sleep(10000);
driver.findElement(By.xpath("/html[1]/body[1]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/div[1]/div[2]/label[1]/input[1]")).sendKeys("Metric ComputeWF");
Thread.sleep(10000);
String job=driver.findElement(By.xpath("/html[1]/body[1]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/table[1]/tbody[1]/tr[1]/td[3]")).getText();
Reporter.log("Data pushed on dev environment and Streaming completed");
Assert.assertEquals(job, "MetricComputeWF");
   Reporter.log("MetricComputeWF job is running",true);
   driver.findElement(By.xpath("/html[1]/body[1]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/a[1]")).click();
   String finalstatus=driver.findElement(By.xpath("//td[contains(text(),'SUCCEEDED')] ")).getText();
	System.out.println(finalstatus);
	Assert.assertEquals(finalstatus,"SUCCEEDED");
	Reporter.log("Metric compute job is completed",true);
  String Elapsedtime=driver.findElement(By.xpath("//tr[10][@class='odd']//td")).getText();
  Reporter.log("Total time taken to complete metric compute job  is : "+ Elapsedtime,true);
  driver.navigate().back();
  driver.findElement(By.xpath("/html[1]/body[1]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/div[1]/div[2]/label[1]/input[1]")).clear();
  driver.findElement(By.xpath("/html[1]/body[1]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/div[1]/div[2]/label[1]/input[1]")).sendKeys("activitytimelineWF");
  Thread.sleep(8000);
  String job1=driver.findElement(By.xpath("/html[1]/body[1]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/table[1]/tbody[1]/tr[1]/td[3]")).getText();
  Assert.assertEquals(job1, "activitytimelineWF");
  driver.findElement(By.xpath("/html[1]/body[1]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/a[1]")).click();
  String finalstatus1=driver.findElement(By.xpath("//td[contains(text(),'SUCCEEDED')] ")).getText();
	Assert.assertEquals(finalstatus1,"SUCCEEDED");
	Reporter.log("ActivityTimelineWF job is completed",true);
String Elapsedtime1=driver.findElement(By.xpath("//tr[10][@class='odd']//td")).getText();
Reporter.log("Total time taken to complete ActivityTimeline job  is : "+ Elapsedtime1,true);
driver.close();
 
	    	}
	    	    	
	    		}	








