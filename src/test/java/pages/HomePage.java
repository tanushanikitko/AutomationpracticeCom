package pages;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class HomePage {
    private static final String URL = "http://automationpractice.com";
    private static final By PAGE_WOMEN = By.linkText("Women");
    private static final By PAGE_DRESSES = By.linkText("DRESSES");
    private static final By PAGE_T_SHIRTS = By.linkText("T-SHIRTS");
    private static final By WORD_WOMEN = By.xpath("//h2[@class='title_block']");
    private static final By WORD_DRESSES = By.xpath("//div[@id='columns']/div[1]");
    private static final By WORD_T_SHIRTS = By.xpath("//div[@id='center_column']//div[@class='content_scene_cat_bg']");


    public HomePage openPage() {
        open(URL);
        return this;
    }

    public HomePage clickOnWomenPage() {
        $(PAGE_WOMEN).click();
        return this;
    }

    public ProductsPage ifWomenPageOpened() {
        $(WORD_WOMEN).shouldHave(text("WOMEN"));
        return new ProductsPage();
    }

    public HomePage clickOnDressesPage() {
        $(PAGE_DRESSES).click();
        return this;

    }

    public ProductsPage ifDressesPageOpened() {
        $(WORD_DRESSES).shouldHave(text("Dresses"));
        return new ProductsPage();
    }
    public HomePage clickOnTshirtsPage() {
        $(PAGE_T_SHIRTS).click();
        return this;

    }

    public ProductsPage ifTshirtsPageOpened() {
        $(WORD_T_SHIRTS).shouldBe(visible);
        return new ProductsPage();
    }
}
