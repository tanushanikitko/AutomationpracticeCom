package tests;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.SearchPage;
import utils.TestListener;


@Listeners(TestListener.class)
public class SearchTest extends BaseTest{

    @Test(description = "Проверить поиск товара")
    @Description("Поиск товара и проверка,что товар отобразился")
    public void searchProduct(){
       new SearchPage()
               .openPage()
               .selectProduct("Blouse")
               .isItemDisplayed();
    }

    @Test(description = "Проверить поиск продукта из другого каталога")
    @Description("Поиск другого товара и проверка,что товар отобразился")
    public void searchProduct2(){
      new SearchPage()
              .openPage()
              .selectProduct("dresses")
              .isOtherItemDisplayed();

    }

    @Test(description = "Проверить ввод предлагаемого товара")
    @Description("Проверить поиск предлагаемого товара при запросе")
    public void searchOfferProduct(){
       new SearchPage()
               .openPage()
               .inputNameProduct("T-SHIRTS")
               .clickOnOfferedProduct()
               .ifOfferedProductDisplayed();
    }

}
