package tests;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.CartPage;
import utils.TestListener;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.*;
@Listeners(TestListener.class)
public class CartTest extends BaseTest{

    public void selectProduct(String productName) {
        $$(".product_img_link").filterBy(attribute("title", productName)).first().click();

    }

    @Test(description = "Тест надобавление товара в карзину")
    @Description("Проверка добавления товара,с указанными параметрами в корзину")
    public void addProductToCart(){
      new CartPage()
              .openPage()
              .clickOnProduct()
              .chooseParameters("2","M")
              .addProductToCart()
              .ifProductAddToCart();
    }
}
