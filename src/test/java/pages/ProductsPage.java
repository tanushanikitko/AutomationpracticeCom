package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.exactTexts;
import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

public class ProductsPage {
    private static final String PRODUCT = ".product_img_link";
    private static final String URL = "http://automationpractice.com";
    private static final By SOCIAL_BUTTONS = By.xpath("//button[@type='button']");

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


}