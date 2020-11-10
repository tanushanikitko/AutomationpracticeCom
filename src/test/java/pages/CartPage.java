package pages;

import com.codeborne.selenide.SelenideElement;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
@Log4j2
public class CartPage {
    private static final String URL = "http://automationpractice.com";
    private static final By PRODUCT = By.linkText("Faded Short Sleeve T-shirts");
    private static final By NAME_PRODUCT = By.xpath("(//a[@class='quick-view'])[1]");
    private static final By SIZE = By.id("group_1");
    private static final By QUANTITY = By.id("quantity_wanted");
    private static final By IFRAME = By.className("fancybox-iframe");
    private static final By ADD_TO_CART = By.id("add_to_cart");
    private static final By PROCEED_TO_CHECKOUT = By.xpath("//*[contains(text(),'Proceed to checkout')]");
    private static final By TEXT = By.id("summary_products_quantity");
    private static final String BUTTON_REMOVE = "a[title='Delete'] > .icon-trash";
    private static final String MASSAGE = ".alert-warning";
    private static final By PRODUCT_ONE_MORE = By.linkText("Printed Dress");
    private static final String BUTTON_CONTINUE_SHOPPING = "[title='Continue shopping']";



    public CartPage openPage() {
        open(URL);
        return this;
    }

    public CartPage clickOnProduct() {
        SelenideElement product = $(PRODUCT);
        product.scrollTo();
        actions().moveToElement(product).perform();
        $(NAME_PRODUCT).click();
        switchTo().frame(element(IFRAME));
        log.info("Clicking on product");
        return this;
    }

    public CartPage clickOnProductOneMore() {
        SelenideElement product = $(PRODUCT_ONE_MORE);
        product.scrollTo();
        actions().moveToElement(product).perform();
        $(PRODUCT_ONE_MORE).click();

        return this;
    }

    public CartPage chooseParameters(String quantityOfProducts, String sizeOfProducts) {
        $(QUANTITY).setValue(quantityOfProducts);
        $(SIZE).selectOption(sizeOfProducts);
        log.info("Choose parameters");
        return this;
    }

    public CartPage addProductToCart() {
        $(ADD_TO_CART).click();
        $(PROCEED_TO_CHECKOUT).click();
        log.info("Add product to cart");
        return this;
    }

    public CartPage ifProductAddToCart() {
        $(TEXT).shouldHave(text("2 Products"));
        return this;
    }

    public CartPage removeProductFromBasket() {
        $(BUTTON_REMOVE).click();
        return this;
    }

    public CartPage ifProductRemoveFromCart() {
        $(MASSAGE).shouldHave(text("Your shopping cart is empty"));
        log.info("Message:your shopping is empty");
        return this;
    }

    public CartPage addProductToCartAndContinueShopping() {
        $(ADD_TO_CART).click();
        $(BUTTON_CONTINUE_SHOPPING).click();
        return this;
    }

    }
