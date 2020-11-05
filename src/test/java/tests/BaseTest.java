package tests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;
import pages.*;

public class BaseTest {
    ProductsPage productsPage = new ProductsPage();
    CartPage cartPage = new CartPage();
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    SearchPage searchPage = new SearchPage() ;

    @BeforeMethod
    public void setUp() {
        Configuration.browser = "chrome";
        Configuration.timeout =10000;
        Configuration.startMaximized = true;

    }
}
