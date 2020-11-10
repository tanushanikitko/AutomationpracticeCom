package pages;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
@Log4j2
public class SearchPage {
    private static final String SEARCH = "#search_query_top";
    private static final String URL = "http://automationpractice.com";
    private static final By RESULT = By.xpath("//span[contains(text(),'1 result has been found.')]");
    private static final By NAME_PRODUCT = byText("Printed Summer Dress");
    private static final String OFFERED_PRODUCT = ".ac_results";
    private static final By NAME_OFFERED_PRODUCT = byText("Faded Short Sleeve T-shirts");
    private static final By MASSAGE = byText("No results were found for your search \"джинсы\"");


    public SearchPage openPage() {
        open(URL);
        log.info(String.format("Opening page: %s", URL));
        return this;
    }

    public SearchPage selectProduct(String productName) {
        $(SEARCH).setValue(productName).pressEnter();
        log.info(String.format("Inputting of words: %s", productName));
        return this;
    }

    public SearchPage isItemDisplayed() {
        $(RESULT).shouldBe(visible);
        return this;
    }

    public SearchPage isOtherItemDisplayed() {
        $(NAME_PRODUCT).should(exist);
        return this;
    }

    public SearchPage clickOnOfferedProduct() {
        $(OFFERED_PRODUCT).click();
        return this;
    }

    public SearchPage ifOfferedProductDisplayed() {
        $(NAME_OFFERED_PRODUCT).shouldBe(visible);
        return this;
    }

    public SearchPage inputNameProduct(String productName) {
        $(SEARCH).setValue(productName);
        log.info(String.format("Inputting of words: %s", productName));
        return this;
    }

    public SearchPage ifNonExistentProductNotDisplayed() {
        $(MASSAGE).shouldBe(visible);
        return this;


    }
}
