package paymentnegative;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_Negative {
	public WebDriver driver;

	public Payment_Negative(WebDriver driver2) {

		this.driver = driver2;
		
		PageFactory.initElements(driver2, this);
	}

	public WebDriver getDriver() {
		return driver;
	}
	@FindBy(id = "normal_login_username")
	private WebElement username;

	public WebElement getUsername() {
		return username;
	}

	@FindBy(id = "normal_login_password")

	private WebElement password;

	public WebElement getPassword() {
		return password;
	}

	@FindBy(xpath = "//button[@type='submit']")

	private WebElement signinbtn;

	public WebElement getSigninbtn() {
		return signinbtn;
	}

	@FindBy(xpath = "//div[3]//div[37]//div[2]//div[2]//div[2]")

	private WebElement cliapp;

	public WebElement getcliapp() {
		return cliapp;
	}
	
	@FindBy(xpath = "(//div[@class='ant-tabs-tab ant-tabs-tab-active'])[1]")

	private WebElement cliser;

	public WebElement getcliser() {
		return cliser;
	}
	
	@FindBy(xpath = "(//input[@placeholder='Find Diagnosi Codes'])[1]")

	private WebElement sendcp;

	public WebElement getsendcp() {
		return sendcp;
	}
	
	@FindBy(xpath = "(//div[contains(text(),'Vkard--fdfdsfds')])[1]")

	private WebElement selecp;

	public WebElement getselecp() {
		return selecp;
	}
	
	@FindBy(xpath = "(//input[@id='cpt_4_units0'])[1]")

	private WebElement quanal;

	public WebElement getquanal() {
		return quanal;
	}
	
	
	@FindBy(xpath = "//input[@id='appt_icd10_code']")

	private WebElement ndcqu;

	public WebElement getndcqu() {
		return ndcqu;
	}
	
	@FindBy(xpath = "(//input[@id='CPT_4_NDC_Code0'])[1]")

	private WebElement searnd;

	public WebElement getsearnd() {
		return searnd;
	}
	
	
	@FindBy(xpath = "(//div[contains(text(),'A78--Q fever')])[1]")

	private WebElement selend;

	public WebElement getselend() {
		return selend;
	}
	
	@FindBy(xpath = "(//input[@placeholder='Find ICD10 Codes'])[1]")

	private WebElement senicd10;

	public WebElement getsenicd10() {
		return senicd10;
	}
	
	@FindBy(xpath = "//div[@id='appt_tabs-tab-3']")

	private WebElement selic10;

	public WebElement getselic10() {
		return selic10;
	}
	
	@FindBy(xpath = "(//input[@placeholder='Find HCPCS Codes'])[1]")

	private WebElement hcpc;

	public WebElement gethcpc() {
		return hcpc;
	}
	
	@FindBy(xpath = "//span[@id='appt_billing_invoice']")

	private WebElement hcpcsele;

	public WebElement gethcpcsele() {
		return hcpcsele;
	}
	
	@FindBy(xpath = "(//input[@placeholder='Find ICD9 Codes'])[1]")

	private WebElement icd9;

	public WebElement geticd9() {
		return icd9;
	}
	
	@FindBy(xpath = "//div[@id='invoice_addpayment']")

	private WebElement seleic9;

	public WebElement getseleic9() {
		return seleic9;
	}
	
	@FindBy(xpath = "(//input[@placeholder='Find Custom Codes'])[1]")

	private WebElement cusco;

	public WebElement getcusco() {
		return cusco;
	}
	
	@FindBy(xpath = "(//div[contains(text(),'123--Viral Fever')])[1]")

	private WebElement cuscose;

	public WebElement getcuscose() {
		return cuscose;
	}
	
	@FindBy(xpath = "(//button[@type='button'][normalize-space()='Done'])[2]")

	private WebElement seldo;

	public WebElement getseldo() {
		return seldo;
	}
	
	


}
