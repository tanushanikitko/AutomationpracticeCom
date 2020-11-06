package tests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.*;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

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
    @AfterMethod(alwaysRun = true)
    public void closeBrowser() {
        getWebDriver().quit();
    }
}
