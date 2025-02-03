package com.e2etests.automation.page_objects;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;


public class AuthenticationOrangePage {

	private ConfigFileReader configfilereader;
	private Actions actions;
	
	@FindBy(how = How.NAME,using = "username")
	public static WebElement username;
	
	@FindBy(how = How.NAME,using = "password")
	public static WebElement password;
	
	@FindBy(how = How.XPATH,using = "//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
	public static WebElement btnlogin;
	
	@FindBy(how = How.XPATH,using = "///li[contains(@class, 'oxd-userdropdown')]")
	public static WebElement iconecompte;
	
//	@FindBy(how = How.XPATH,using = "//p[@class='oxd-userdropdown-name']")
//	public static WebElement iconecompte;
	
//	@FindBy(how = How.XPATH,using = "//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
//	public static WebElement dashboard;
	
	@FindBy(how = How.XPATH,using = "//a[contains(text(),'Logout')]")
	public static WebElement logout;
	

	public AuthenticationOrangePage() {
		PageFactory.initElements(Setup.getDriver(), this);
		this.configfilereader = new ConfigFileReader ();
		this.actions = new Actions(Setup.getDriver());
		
	}
	
	public void fillName(String name) {
//		username.clear();
		WebDriverWait wait = new WebDriverWait(Setup.getDriver(), Duration.ofSeconds(10));
		WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
//		usernameField.sendKeys("Admin");
		username.sendKeys(name);
	}
	public void fillPassword(String Password) {
//		password.clear();
		password.sendKeys(Password);
	}
	public void clickBtnLogin() {
		btnlogin.click();
	}
	
	public void checkURLChanged() {
		String actualURL = Setup.getDriver().getCurrentUrl();
		System.out.println("title of the page is : "+actualURL);
		String url = configfilereader.getProperties("orangehrm.url");
				if (actualURL.equalsIgnoreCase(url) ) {
					System.out.println("url is not changed"+actualURL);
				}
				else {
					System.out.println("url is changed"+url);
				}
	}
	public void clickIconeCompte() {
//		WebDriverWait wait = new WebDriverWait(Setup.getDriver(), Duration.ofSeconds(10));
//		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[@class='--active oxd-userdropdown']")));
//		WebDriverWait wait = new WebDriverWait(Setup.getDriver(), Duration.ofSeconds(10));
//		WebElement iconeCompte = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(@class, 'oxd-userdropdown')]")));
//		actions.moveToElement(iconecompte).perform();
//		WebElement clickmenu = Setup.getDriver().findElement(By.xpath("iconecompte"));
		WebDriverWait wait = new WebDriverWait(Setup.getDriver(), Duration.ofSeconds(10));
		WebElement iconeCompte = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(@class, 'oxd-userdropdown')]")));
		iconeCompte.click();
		
	}
	
	public void clickOnLogout() {
//		WebDriverWait wait = new WebDriverWait(Setup.getDriver(), Duration.ofSeconds(10));
//		WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='oxd-dropdown-menu']")));
//		WebElement selectmenu = Setup.getDriver().findElement(By.xpath("//ul[@class='oxd-dropdown-menu']"));
//		Select dropdownlist = new Select(selectmenu);
//		if (dropdownlist.isMultiple()) {
			// By Value
//			dropdownlist.selectByValue("volvo");
//			multiselect.selectByValue("opel");
			// By Index
			//multiselect.selectByIndex(1);
			//multiselect.selectByIndex(3);
			// By visible text
//			dropdownlist.selectByVisibleText("Logout");
			//multiselect.selectByVisibleText("Opel");

//			System.out.println("Two options selected");
//		} else {
//			System.out.println("they options not selected");
//		}
//		dropdownlist.selectByVisibleText("Logout");
		logout.click();
	}
}
