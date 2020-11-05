package tests;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.TestListener;
@Listeners(TestListener.class)
public class CartTest extends BaseTest{

    @Test(description = "Тест на добавление товара в карзину")
    @Description("Проверка добавления товара,с указанными параметрами в корзину")
    public void addProductToCart() {
       cartPage
                .openPage()
                .clickOnProduct()
                .chooseParameters("2", "M")
                .addProductToCart()
                .ifProductAddToCart();

    }
        @Test(description ="Добавление в карзину более одного товара" )
        @Description("Проверка добавления более одного товара в корзину")
     public void addOneMoreProductToCart() {
        cartPage
                .openPage()
                .clickOnProduct()
                .addProductToCartAndContinueShopping()
                .clickOnProductOneMore()
                .addProductToCart()
                .ifProductAddToCart();

    }
    @Test(description = "Удаление товара из карзины")
    @Description("Проверка удаления товара из корзины")
    public void removeProductFromBasket(){
    cartPage
             .openPage()
             .clickOnProduct()
             .addProductToCart()
             .removeProductFromBasket()
             .ifProductRemoveFromCart();

    }

}
