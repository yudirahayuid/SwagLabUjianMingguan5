package com.juaracoding;

import com.juaracoding.pages.AddToCartAndCheckoutPage;
import com.juaracoding.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AddToCartAndCheckoutTest {

    private static WebDriver driver;

    private static LoginPage loginPage = new LoginPage();

    private static AddToCartAndCheckoutPage addToCartAndCheckoutPage = new AddToCartAndCheckoutPage();

    public AddToCartAndCheckoutTest() {
        driver = Hooks.driver;
        // exten report
    }

    @When("User menambahkan produk ke keranjang")
    public void user_menambahkan_produk_ke_keranjang() {
        addToCartAndCheckoutPage.clickButtonAddToCart();
    }

    @And("User melihat melihat produk dalam keranjang")
    public void user_melihat_melihat_produk_dalam_keranjang() {
        addToCartAndCheckoutPage.clickLinkShoppingCart();
    }

    @And("User melakukan checkout")
    public void user_melakukan_checkout() {
        addToCartAndCheckoutPage.clickBtnCheckout();
    }

    @And("User menambahkan firstname yang valid")
    public void user_menambahkan_firstname_yang_valid() {
        addToCartAndCheckoutPage.inputFirstName("Yudi");
    }


    @And("User menambahkan lastname yang valid")
    public void user_menambahkan_lastname_yang_valid() {
        addToCartAndCheckoutPage.inputLastName("Rahayu");
    }

    @And("User menambahkan zip postal code yang valid")
    public void user_menambahkan_zip_postal_code_yang_valid() {
        addToCartAndCheckoutPage.inputPostalCode("1234567890");
    }

    @And("User klik tombol continue")
    public void user_klik_tombol_continue() {
        addToCartAndCheckoutPage.clickBtnContinue();
    }

    @And("User klik tombol finish")
    public void user_klik_tombol_finish() {
        addToCartAndCheckoutPage.clickBtnFinish();
    }

    @Then("User berhasil melakukan checkout")
    public void user_berhasil_melakukan_checkout() {
        Assert.assertEquals(addToCartAndCheckoutPage.getTxtThankYouForYourOrder(),"Thank you for your order!");
    }
}
