package tests;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.TestListener;

@Listeners(TestListener.class)
public class LoginTest extends BaseTest{

    @Test
    public void validLoginTest(){
      new LoginPage()
              .openPage()
              .fillInEmailAndPasswordFields(LoginPage.EMAIL,LoginPage.PASSWORD)
              .clickLogin()
              .isPageOpened();
    }

    @Test
    public void emptyEmailTest(){
      new LoginPage()
              .openPage()
              .fillInEmailAndPasswordFields("",LoginPage.PASSWORD)
              .clickLogin()
              .isPageNotOpened();
    }

    @Test
    public void emptyPasswordTest(){
      new LoginPage()
              .openPage()
              .fillInEmailAndPasswordFields(LoginPage.EMAIL,"")
              .clickLogin()
              .seeMessage();
    }
}
