package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.WebPage;

public class WebStep {

    WebPage webPage;

    public WebStep() {
        this.webPage = new WebPage();
    }

    @Given("open web login page")
    public void openWebLoginPage() {
        webPage.openBrowser();
    }

    @And("user input username {string}")
    public void userInputUsername(String username) {
        webPage.inputUsername(username);
    }

    @And("user input password {string}")
    public void userInputPassword(String pwd) {
        webPage.inputPwd(pwd);
    }

    @And("user click login button")
    public void userClickLoginButton() {
        webPage.clickBtnLogin();
    }

    @And("user will see icon cart in homepage")
    public void userWillSeeIconCartInHomepage() {
        webPage.assertHomepage();
    }

    @And("user will see err message {string}")
    public void userWillSeeErrMessage(String errMesg) {
        webPage.assertErrMsg(errMesg);
    }

    @And("user add item to cart")
    public void userAddItemToCart() {
        webPage.clickAddToCart();
    }

    @Then("verify cart item is match {string}")
    public void verifyCartItemIsMatch(String cartItem) {
        webPage.assertCartItem(cartItem);
    }

    @And("user remove item from cart")
    public void userRemoveItemFromCart() {
        webPage.clickRemoveFromCart();
    }

    @And("user click sort item Z to A")
    public void userClickSortItemZToA() {
        
    }

    @And("user click cart icon")
    public void userClickCartIcon() {
        webPage.clickIconCart();
    }

    @Then("user verify see checkout button")
    public void userVerifySeeCheckoutButton() {
        webPage.verifyBtnCheckout();
    }

    @And("user click checkout button")
    public void userClickCheckoutButton() {
        webPage.clickBtnCheckout();
    }

    @And("user input first name {string}")
    public void userInputFirstName(String firstName) {
        webPage.inputFirstName(firstName);
    }

    @And("user input last name {string}")
    public void userInputLastName(String lastName) {
        webPage.inputLastName(lastName);
    }

    @And("user input postal code {string}")
    public void userInputPostalCode(String postalCode) {
        webPage.inputPostalCode(postalCode);
    }

    @And("user click continue button")
    public void userClickContinueButton() {
        webPage.clickBtnContinue();
    }

    @Then("user verify see finish button")
    public void userVerifySeeFinishButton() {
        webPage.verifyBtnFinish();
    }

    @And("user click finish button")
    public void userClickFinishButton() {
        webPage.clickBtnFinish();
    }

    @Then("user verify see thank you page")
    public void userVerifySeeThankYouPage() {
        webPage.verifyThankYouPage();
    }
}
