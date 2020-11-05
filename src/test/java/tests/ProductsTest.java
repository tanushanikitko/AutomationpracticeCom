package tests;

import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.TestListener;

@Listeners(TestListener.class)
public class ProductsTest extends BaseTest {

    @Test(description = "Тест на наличие кнопок социальных сетей")
    @Description("Проверка внедрена ли регистрация и авторизация с помощью основных социальных сетей")
    public void productHasSocialNetworkButtons() {
        productsPage
                .openPage()
                .selectProduct("Blouse")
                .isProductHasSocialButtons();
    }
    @Test(description = "Тест на наличие кнопки добавление в лист желаний")
    @Description("Проверка у тавара наличия возможности добавить его в лист желаний")
    public void  productHasButtonsAddToWishlist(){
       productsPage
                .openPage()
                .selectProduct("Printed Dress")
                .isProductHasAddToWishList();
    }
    @Test(description ="Тест на наличие информации о товаре")
    @Description("Проверка наличия у товара информации")
    public void productHasInfo(){
        productsPage
                .openPage()
                .selectProduct("Printed Summer Dress")
                .isHasInfoAboutProduct();
    }
}
