package pages;
import org.openqa.selenium.By;
import static com.codeborne.selenide.CollectionCondition.exactTexts;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;


public class ProductsPage {
    private static final String PRODUCT = ".product_img_link";
    private static final String URL = "http://automationpractice.com";
    private static final By SOCIAL_BUTTONS = By.xpath("//button[@type='button']");
    private static final By BUTTON_WISHLIST = By.linkText("Add to wishlist");
    private static final String INFO_ABOUT_PRODUCT = "div#short_description_content";
    private static final By IFRAME = By.className("fancybox-iframe");


    public ProductsPage selectProduct(String productName) {
        $$(PRODUCT).filterBy(attribute("title", productName)).first().click();
        return this;
    }

    public ProductsPage openPage() {
        open(URL);
        return this;

    }
    public ProductsPage isProductHasSocialButtons(){
        $$(SOCIAL_BUTTONS).shouldHave(exactTexts("Tweet", "Share", "Google+", "Pinterest"));
        return this;
    }
    public ProductsPage isProductHasAddToWishList(){
        $$(BUTTON_WISHLIST).shouldHave(exactTexts("Add to wishlist"));
        return this;
    }
    public ProductsPage isHasInfoAboutProduct() {
        switchTo().frame(element(IFRAME));
        $(INFO_ABOUT_PRODUCT).shouldBe(visible);
        return this;

    }

}