package pages;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
@Log4j2
public class HomePage {
    private static final String URL = "http://automationpractice.com";
    private static final By PAGE_WOMEN = By.linkText("Women");
    private static final By PAGE_DRESSES = By.linkText("DRESSES");
    private static final By PAGE_T_SHIRTS = By.linkText("T-SHIRTS");
    private static final By WORD_WOMEN = By.xpath("//h2[@class='title_block']");
    private static final By WORD_DRESSES = By.xpath("//div[@id='columns']/div[1]");
    private static final By WORD_T_SHIRTS = By.xpath("//div[@id='center_column']//div[@class='content_scene_cat_bg']");
    private static final String BUTTON_CONTACTS = "#contact-link";
    private static final String CUSTOMER_SERVICE  = ".icon-home";

    public HomePage openPage() {
        open(URL);
        log.info(String.format("Opening page: %s", URL));
        return this;
    }

    public HomePage clickOnWomenPage() {
        $(PAGE_WOMEN).click();
        return this;
    }

    public ProductsPage ifWomenPageOpened() {
        $(WORD_WOMEN).shouldHave(text("WOMEN"));
        log.info("Women page is opened");
        return new ProductsPage();
    }

    public HomePage clickOnDressesPage() {
        $(PAGE_DRESSES).click();
        return this;

    }

    public ProductsPage ifDressesPageOpened() {
        $(WORD_DRESSES).shouldHave(text("Dresses"));
        log.info("Dresses page is opened");
        return new ProductsPage();
    }

    public HomePage clickOnTshirtsPage() {
        $(PAGE_T_SHIRTS).click();
        return this;

    }

    public ProductsPage ifTshirtsPageOpened() {
        $(WORD_T_SHIRTS).shouldBe(visible);
        log.info("T-shirts page is opened");
        return new ProductsPage();
    }

    public HomePage clickOnButtonContacts() {
        $(BUTTON_CONTACTS).click();
        return this;

    }

    public HomePage ifContactsPageOpened() {
        $(CUSTOMER_SERVICE).shouldBe(visible);
        log.info("Contacts page is opened");
        return this;

    }
}
