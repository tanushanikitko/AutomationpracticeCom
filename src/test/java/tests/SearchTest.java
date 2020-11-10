package tests;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.TestListener;


@Listeners(TestListener.class)
public class SearchTest extends BaseTest{

    @Test(description = "Проверить поиск товара")
    @Description("Поиск товара и проверка,что товар отобразился")
    public void searchProduct(){
       searchPage
               .openPage()
               .selectProduct("Blouse")
               .isItemDisplayed();
    }

    @Test(description = "Проверить поиск продукта из другого каталога")
    @Description("Поиск другого товара и проверка,что товар отобразился")
    public void searchProduct2(){
      searchPage
              .openPage()
              .selectProduct("dresses")
              .isOtherItemDisplayed();

    }

    @Test(description = "Проверить ввод предлагаемого товара")
    @Description("Проверить поиск предлагаемого товара при запросе")
    public void searchOfferProduct(){
       searchPage
               .openPage()
               .inputNameProduct("T-SHIRTS")
               .clickOnOfferedProduct()
               .ifOfferedProductDisplayed();
    }
    @Test
    public void inputOfNonExistentProduct(){
      searchPage
              .openPage()
              .selectProduct("джинсы")
              .ifNonExistentProductNotDisplayed();

    }

}
