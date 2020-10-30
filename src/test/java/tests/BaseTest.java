package tests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    @BeforeMethod
    public void setUp() {
        Configuration.browser = "chrome";
        Configuration.timeout =10000;
        Configuration.startMaximized = true;

    }
}
