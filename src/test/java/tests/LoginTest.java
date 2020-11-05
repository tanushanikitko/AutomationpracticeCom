package tests;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.TestListener;

@Listeners(TestListener.class)
public class LoginTest extends BaseTest{

    @Test
    public void validLoginTest(){
      loginPage
              .openPage()
              .fillInEmailAndPasswordFields(LoginPage.EMAIL,LoginPage.PASSWORD)
              .clickLogin()
              .isPageOpened();
    }

    @Test
    public void emptyEmailTest(){
     loginPage
              .openPage()
              .fillInEmailAndPasswordFields("",LoginPage.PASSWORD)
              .clickLogin()
              .isPageNotOpened();
    }

    @Test
    public void emptyPasswordTest(){
      loginPage
              .openPage()
              .fillInEmailAndPasswordFields(LoginPage.EMAIL,"")
              .clickLogin()
              .seeMessage();
    }
}
