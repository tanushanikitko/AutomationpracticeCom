package tests;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.TestListener;

    @Listeners(TestListener.class)
    public class HomePageTest extends BaseTest {

    @Test(description = "Проверить переход на страничку Women")
    @Description("Проверяем переходим ли мы на страничку Women,после нажатия кнопки")
    public void checkIfIOnWomenPage(){
      new HomePage()
              .openPage()
              .clickOnWomenPage()
              .ifWomenPageOpened();
    }

    @Test(description = "Проверить переход на страничку DRESSES")
    @Description("Проверяем переходим ли мы на страничку DRESSES,после нажатия кнопки")
        public void checkIfIOnDressesPage(){
      new HomePage()
              .openPage()
              .clickOnDressesPage()
              .ifDressesPageOpened();
    }

    @Test(description = "Проверить переход на страничку T-SHIRTS")
    @Description("Проверяем переход на страничку T-SHIRTS,после нажатия кнопки ")
        public void checkIfIOnTShirtsPageTest(){
       new HomePage()
               .openPage()
               .clickOnTshirtsPage()
               .ifTshirtsPageOpened();
    }
}
