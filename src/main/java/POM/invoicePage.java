package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class invoicePage {
	//Declaration
	//address of invoice webelement
	@FindBy(xpath="//input[@name=\"downloadInvoice\"]")
	private WebElement Invoicebtn;
	
	//initialization
	public invoicePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public void InvoiceButton() {
		Invoicebtn.click();
	}

}
//https://demoapp.skillrary.com/feedback.php
