package paymentnegative;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Payment_Negat extends Capminds_BaseClass {

	public static WebDriver driver = getbrowser("chrome");

	public static Pageobjectmanager pom = new Pageobjectmanager(driver);

//	public static void main(String[] args) throws InterruptedException {
	@Test(priority = 0)
//
	public void Payment_Negaat() throws InterruptedException {
		// Driver Maximize and Url Launch

		geturl("https://ehr1.vozo.xyz:444/");

		// Enter Username

		sendkeys(pom.getpaymentnega().getUsername(), "Admin3");

		// Enter Password

		sendkeys(pom.getpaymentnega().getPassword(), "Admin@123");

		// Click Signin Button '

		Clickonelement(pom.getpaymentnega().getSigninbtn());

		// get set

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Thread.sleep(4000);

		Clickonelement(pom.getpaymentnega().getcliapp());

//		WebDriverWait wait3 = new WebDriverWait(driver, 10);
//		WebElement Bill = wait3
//				.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='ant-tabs-tab'])[2]")));
//		((JavascriptExecutor) driver).executeScript("arguments[0].click();", Bill);

		// flag
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		WebElement element2 = wait2
				.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='ant-tabs-tab'])[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element2);

		// Click service
		// Clickonelement(pom.getpaymentnega().getcliser());

//		Thread.sleep(4000);
//		Clickonelement(pom.getpaymentnega().getcliser());

		// a cp
		sendkeys(pom.getpaymentnega().getsendcp(), "a");

		// send cp
		Clickonelement(pom.getpaymentnega().getselecp());

		// sen al

		// sendkeys(pom.getpaymentnega().getquanal(), "abc");

		// send ndc
		sendkeys(pom.getpaymentnega().getndcqu(), "q");

		// sea ndc
		// sendkeys(pom.getpaymentnega().getsearnd(), "a");

		// sele ndc

		 Clickonelement(pom.getpaymentnega().getselend());

		// icd9

//		sendkeys(pom.getpaymentnega().getsenicd10(), "a");

		// se icd10

		Clickonelement(pom.getpaymentnega().getselic10());

		// hcdc

	//	sendkeys(pom.getpaymentnega().gethcpc(), "a");

		// se hcp
		
		Thread.sleep(3000);

//		Clickonelement(pom.getpaymentnega().gethcpcsele());

		// icd9

	//	sendkeys(pom.getpaymentnega().geticd9(), "a");

		// se icd10
//
//		Clickonelement(pom.getpaymentnega().getseleic9());
//
//		// icd9
//
//		sendkeys(pom.getpaymentnega().getcusco(), "a");
//
//		// se icd10
//
//		Clickonelement(pom.getpaymentnega().getcuscose());
//
//		// sel do
//
//		Clickonelement(pom.getpaymentnega().getseldo());

	}


}
