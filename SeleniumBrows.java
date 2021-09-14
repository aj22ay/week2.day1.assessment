package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class SeleniumBrows {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver chrom=new ChromeDriver();
		chrom.manage().window().maximize();
		chrom.get("http://leaftaps.com/opentaps/control/login");
		chrom.findElement(By.id("username")).sendKeys("demosalesmanager");
		chrom.findElement(By.id("password")).sendKeys("crmsfa");
		WebElement login=chrom.findElement(By.className("decorativeSubmit"));
		login.click();
		WebElement crmsfa=chrom.findElement(By.linkText("CRM/SFA"));
		crmsfa.click();
		WebElement lead=chrom.findElement(By.linkText("Create Lead"));
		lead.click();
		chrom.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		chrom.findElement(By.id("createLeadForm_firstName")).sendKeys("Test");
		chrom.findElement(By.id("createLeadForm_lastName")).sendKeys("Leaf");
		chrom.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Ajay");
		chrom.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("S");
		chrom.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Leran Selenium");
		chrom.findElement(By.id("createLeadForm_birthDate")).sendKeys("02/22/1999");
		chrom.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Engineer");
		chrom.findElement(By.id("createLeadForm_departmentName")).sendKeys("EEE");
		chrom.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("4 lakhs");
		chrom.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("50");
		chrom.findElement(By.id("createLeadForm_sicCode")).sendKeys("SR123");
		chrom.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("##");
		chrom.findElement(By.id("createLeadForm_description")).sendKeys("Selenium Training");
		chrom.findElement(By.id("createLeadForm_importantNote")).sendKeys("Selenium is important serve IT");
		
		WebElement countrycode=chrom.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		countrycode.clear();
		chrom.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("+91");
		chrom.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("425");
		chrom.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9874561239");
		chrom.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("0");
		chrom.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Devil");
		chrom.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("abc street");
		chrom.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("rasipuram");
		chrom.findElement(By.id("createLeadForm_generalCity")).sendKeys("namakkal");
		chrom.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("637412");
		WebElement ok=chrom.findElement(By.name("submitButton"));
		ok.click();
		
		
		
	}

}
