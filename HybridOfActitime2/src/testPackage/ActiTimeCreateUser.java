package testPackage;

import java.io.IOException;

import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.Flib;
import pagePackage.LoginPage;

public class ActiTimeCreateUser extends BaseTest{
  @Test
  public void createValidUSer() throws InterruptedException, IOException {
	  LoginPage lp= new LoginPage(driver);
	  Flib flib = new Flib();
	  lp.actiTimeValidLogin(flib.readPropertyData(PROP_PATH, "Username"),flib.readPropertyData(PROP_PATH, "Password"));
	  Thread.sleep(3000);
	  
	  
  }
}
