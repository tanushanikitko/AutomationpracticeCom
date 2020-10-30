package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class CartPage {
    private static final String URL="http://automationpractice.com";
    private static final By PRODUCT = By.linkText("Faded Short Sleeve T-shirts");
    private static final By NAME_PRODUCT = By.xpath("(//a[@class='quick-view'])[1]");
    private static final By SIZE = By.id("group_1");
    private static final By QUANTITY = By.id("quantity_wanted");
    private static final By IFRAME = By.className("fancybox-iframe");
    private static final By ADD_TO_CART = By.id("add_to_cart");
    private static final By PROCEED_TO_CHECKOUT = By.xpath("//*[contains(text(),'Proceed to checkout')]");
    private static final By TEXT = By.id("summary_products_quantity");
    public CartPage openPage() {
        open(URL);
        return this;
    }
    public CartPage clickOnProduct(){
        SelenideElement product = $(PRODUCT);
        product.scrollTo();
        actions().moveToElement(product).perform();
        $(NAME_PRODUCT).click();
        return this;
    }
  public CartPage chooseParameters(String quantityOfProducts,String sizeOfProducts){
      switchTo().frame(element(IFRAME));
      $(QUANTITY).setValue(quantityOfProducts);
      $(SIZE).selectOption(sizeOfProducts);

        return this;
  }
  public CartPage addProductToCart(){
      $(ADD_TO_CART).click();
      $(PROCEED_TO_CHECKOUT).click();
        return this;
  }
   public CartPage ifProductAddToCart(){
       $(TEXT).shouldHave(text("2 Products"));
        return this;
   }

}