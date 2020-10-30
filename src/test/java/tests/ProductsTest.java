package tests;

import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.ProductsPage;
import utils.TestListener;

@Listeners(TestListener.class)
public class ProductsTest extends BaseTest {

    @Test(description = "Тест на наличие кнопок социальных сетей")
    @Description("Проверка внедрена ли регистрация и авторизация с помощью основных социальных сетей")
    public void productHasSocialNetworkButtons() {
        new ProductsPage()
                .openPage()
                .selectProduct("Blouse")
                .isProductHasSocialButtons();
    }
}
