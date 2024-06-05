package pages;
import org.openqa.selenium.By;
import static helper.Utility.driver;
import static org.assertj.core.api.Assertions.assertThat;

public class WebPage {
    By input_username = By.id("user-name");
    By input_pwd = By.id("password");
    By btn_login = By.id("login-button");
    By icon_cart = By.xpath("//a[@class='shopping_cart_link']");
    By icon_cart_item = By.xpath("//span[@class='shopping_cart_badge']");
    By addToCart = By.xpath("(//*[text()='Add to cart'])[1]");
    By removeFromCart = By.xpath("(//*[text()='Remove'])[1]");
    By sortItem = By.xpath("//select");
    By sortItemZtoA = By.xpath("//option[@value=\"za\"]");
    By firstItem = By.xpath("(//*[@class=\"inventory_item_name \"])[1]");
    By btn_checkout = By.xpath("//*[@id=\"checkout\"]");
    By input_firstName = By.id("first-name");
    By input_lastName = By.id("last-name");
    By input_postalCode = By.id("postal-code");
    By btn_continue = By.id("continue");
    By btn_finish = By.id("finish");
    By thank_you_page = By.xpath("//h2[text()='Thank you for your order!']");

    By text_err_msg(String msg) {
        return By.xpath("//*[contains(text(), '" + msg + "')]");
    }

    public void openBrowser() {
        driver.get("https://www.saucedemo.com/");
    }

    public void inputUsername(String username) {
        driver.findElement(input_username).sendKeys(username);
    }

    public void inputPwd(String pwd) {
        driver.findElement(input_pwd).sendKeys(pwd);
    }

    public void clickBtnLogin() {
        driver.findElement(btn_login).click();
    }

    public void assertHomepage() {
        driver.findElement(icon_cart).isDisplayed();
    }

    public void assertErrMsg(String errmsg) {
        driver.findElement(text_err_msg(errmsg)).isDisplayed();
    }

    public void clickAddToCart() {
        driver.findElement(addToCart).click();
    }

    public void clickRemoveFromCart() {
        driver.findElement(removeFromCart).click();
    }

    public void assertCartItem(String cartItem) {
        String itemExpected = cartItem;
        String itemActual = driver.findElement(icon_cart_item).getText();
        assertThat(itemExpected).isEqualTo(itemActual);
    }

    public void clickSortItemZtoA() {
        String itemBefore, itemAfter;

        itemBefore = driver.findElement(firstItem).getText();
        driver.findElement(sortItem).click();
        driver.findElement(sortItemZtoA).click();
        itemAfter = driver.findElement(firstItem).getText();

        assertThat(itemBefore).isNotEqualTo(itemAfter);
    }

    public void clickIconCart() {
        driver.findElement(icon_cart).click();
    }

    public void verifyBtnCheckout() {
        assertThat(driver.findElement(btn_checkout).isDisplayed()).isTrue();
    }

    public void clickBtnCheckout() {
        driver.findElement(btn_checkout).click();
    }

    public void inputFirstName(String firstName) {
        driver.findElement(input_firstName).sendKeys(firstName);
    }

    public void inputLastName(String lastName) {
        driver.findElement(input_lastName).sendKeys(lastName);
    }

    public void inputPostalCode(String postalCode) {
        driver.findElement(input_postalCode).sendKeys(postalCode);
    }

    public void clickBtnContinue() {
        driver.findElement(btn_continue).click();
    }

    public void verifyBtnFinish() {
        assertThat(driver.findElement(btn_finish).isDisplayed()).isTrue();
    }

    public void clickBtnFinish() {
        driver.findElement(btn_finish).click();
    }

    public void verifyThankYouPage() {
        assertThat(driver.findElement(thank_you_page).isDisplayed()).isTrue();
    }
}
