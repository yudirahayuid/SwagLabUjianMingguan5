package com.juaracoding;

import com.juaracoding.pages.AddToCartPage;
import com.juaracoding.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AddToCartTest {

    private static WebDriver driver;

    private static LoginPage loginPage = new LoginPage();

    private static AddToCartPage addToCartPage = new AddToCartPage();

    public AddToCartTest() {
        driver = Hooks.driver;
        // exten report
    }

    @When("User menambahkan produk ke keranjang")
    public void user_menambahkan_produk_ke_keranjang() {
        addToCartPage.clickButtonAddToCart();
    }

    @And("User melihat melihat produk dalam keranjang")
    public void user_melihat_melihat_produk_dalam_keranjang() {
        addToCartPage.clickLinkShoppingCart();
    }

    @Then("User berhasil menambahkan produk ke dalam keranjang dan diarahkan ke checkout")
    public void user_berhasil_menambahkan_produk_ke_dalam_keranjang_dan_diarahkan_ke_checkout() {
        Assert.assertEquals(addToCartPage.getTxtYourCart(),"Your Cart");
    }

}
