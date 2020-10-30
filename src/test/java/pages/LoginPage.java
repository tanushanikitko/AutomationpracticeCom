package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {
    private static final String URL="http://automationpractice.com";
    private static final String SIGN_IN = ".login";
    private static final String EMAIL_INPUT = "#email";
    private static final String PASSWORD_INPUT = "#passwd";
    private static final String LOGIN_BUTTON = "#SubmitLogin";
    public static final String EMAIL = "nikitko_1991@mail.ru";
    public static final String PASSWORD = "12345ЙЦ";
    public static final String MY_ACCOUNT =".page-heading";
    public static final String ERROR =".alert.alert-danger";
    public static final String MESSAGE =".lost_password";

    public LoginPage openPage() {
        open(URL);
        $(SIGN_IN).click();
        return this;
    }

    public LoginPage isPageOpened() {
        $(MY_ACCOUNT).shouldBe(visible);
        return this;
    }
    public LoginPage fillInEmailAndPasswordFields(String email, String password) {
        $(EMAIL_INPUT).sendKeys(email);
        $(PASSWORD_INPUT).sendKeys(password);
        return this;
    }
    public LoginPage clickLogin() {
        $(LOGIN_BUTTON).click();
        return this;
    }
    public LoginPage isPageNotOpened(){
        $(ERROR).shouldBe(visible);
        return this;
    }
    public LoginPage seeMessage(){
        $(MESSAGE).shouldHave(text("Forgot your password?"));
        return this;
    }
}
