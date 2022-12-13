package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("DemoCsr");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.partialLinkText("Create")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Divyabharath");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("bharath");
	driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("0");
	driver.findElement(By.id("createLeadForm_title")).sendKeys("softwareTester");
	driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("123445");
	driver.findElement(By.id("createLeadForm_description")).sendKeys("Tester");
	driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Automation Tester");
	driver.findElement(By.id("createLeadForm_coundryCode")).sendKeys("+91");
	driver.findElement(By.id("createLeadForm_primaryphoneNumber")).sendKeys("6374762509");
	driver.findElement(By.id("createLeadForm_city")).sendKeys("chennai");
	driver.findElement(By.id("createLeadForm_numberOfEmployees")).sendKeys("200");
	driver.findElement(By.className("submit")).click();
	
	
	
	
	
	
	
	
	
	
}
}
  