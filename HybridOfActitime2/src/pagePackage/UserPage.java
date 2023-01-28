package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserPage {
	   @FindBy(xpath="//div[@class='label'and(.='Users')]")private WebElement UserTab;
	   @FindBy(xpath="//input[@type='button'and(@value='Create New User')]")private WebElement CreateNewUser;
       @FindBy(name="username")private WebElement UsnTextBox;
	   @FindBy(name="passwordText")private WebElement PassTextBox;
	   @FindBy(name="passwordTextRetype")private WebElement retypePassTextBox;
	   @FindBy(name="firstName")private WebElement FirstNameTextBox;
	   @FindBy(name="")private WebElement LastNameTextBox;
	   @FindBy(xpath="")private WebElement CreatUserButton;
	   @FindBy(name="")private WebElement CancleButton;
	   // initialiazation
	   public void UsersPage(WebDriver driver)
	   {
		   pageFactory.initElements(driver.this);
	   }
	   public WebElement getUserTab() {
		return UserTab;
	}
	public WebElement getCreateNewUser() {
		return CreateNewUser;
	}
	public WebElement getUsnTextBox() {
		return UsnTextBox;
	}
	public WebElement getPassTextBox() {
		return PassTextBox;
	}
	public WebElement getRetypePassTextBox() {
		return retypePassTextBox;
	}
	public WebElement getFirstNameTextBox() {
		return FirstNameTextBox;
	}
	public WebElement getLastNameTextBox() {
		return LastNameTextBox;
	}
	public WebElement getCreatUserButton() {
		return CreatUserButton;
	}
	public WebElement getCancleButton() {
		return CancleButton;
	}
	//operatinal Methods
	   public void validUsn(String validUser)
	   {
		  getFirstNameTextBox().sendKeys(validUser);
	   }
	   public void validPass(String validPassword)
	   {
		   PassTextBox.sendKeys(validPassword);
	}
	   public void FirstName(String firstName )
	   {
		   FirstNameTextBox.sendKeys(firstName);
	   }
	   
}
