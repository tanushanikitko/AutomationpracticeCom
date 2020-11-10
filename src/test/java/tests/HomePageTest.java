package tests;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.TestListener;

    @Listeners(TestListener.class)
    public class HomePageTest extends BaseTest {

    @Test(description = "Проверить переход на страничку Women")
    @Description("Проверяем переходим ли мы на страничку Women,после нажатия кнопки")
    public void checkIfIOnWomenPage(){
    homePage
              .openPage()
              .clickOnWomenPage()
              .ifWomenPageOpened();
    }

    @Test(description = "Проверить переход на страничку DRESSES")
    @Description("Проверяем переходим ли мы на страничку DRESSES,после нажатия кнопки")
        public void checkIfIOnDressesPage(){
      homePage
              .openPage()
              .clickOnDressesPage()
              .ifDressesPageOpened();
    }

    @Test(description = "Проверить переход на страничку T-SHIRTS")
    @Description("Проверяем переход на страничку T-SHIRTS,после нажатия кнопки ")
        public void checkIfIOnTShirtsPageTest(){
       homePage
               .openPage()
               .clickOnTshirtsPage()
               .ifTshirtsPageOpened();
    }
    @Test(description = "Проверка открытия страницы контактов")
    @Description("Проверяем возможности нажатия кнопки контактов и перехода на страницу")
        public void hasButtonSupportService(){
         homePage
                 .openPage()
                 .clickOnButtonContacts()
                 .ifContactsPageOpened();
    }
}
