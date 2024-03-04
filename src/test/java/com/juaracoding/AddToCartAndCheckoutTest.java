package com.juaracoding;

import com.juaracoding.pages.AddToCartAndCheckoutPage;
import com.juaracoding.pages.LoginPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AddToCartAndCheckoutTest {

    private static WebDriver driver;

    public static ExtentTest extentTest;

    private static LoginPage loginPage = new LoginPage();

    private static AddToCartAndCheckoutPage addToCartAndCheckoutPage = new AddToCartAndCheckoutPage();

    public AddToCartAndCheckoutTest() {
        driver = Hooks.driver;

        // exten report
        extentTest = Hooks.extentTest;
    }

    @When("User menambahkan produk ke keranjang")
    public void user_menambahkan_produk_ke_keranjang() {
        addToCartAndCheckoutPage.clickButtonAddToCart();
        extentTest.log(LogStatus.PASS,"User menambahkan produk ke keranjang");
    }

    @And("User melihat melihat produk dalam keranjang")
    public void user_melihat_melihat_produk_dalam_keranjang() {
        addToCartAndCheckoutPage.clickLinkShoppingCart();
        extentTest.log(LogStatus.PASS,"User melihat melihat produk dalam keranjang");
    }

    @And("User melakukan checkout")
    public void user_melakukan_checkout() {
        addToCartAndCheckoutPage.clickBtnCheckout();
        extentTest.log(LogStatus.PASS,"User melakukan checkout");
    }

    @And("User menambahkan firstname yang valid")
    public void user_menambahkan_firstname_yang_valid() {
        addToCartAndCheckoutPage.inputFirstName("Yudi");
        extentTest.log(LogStatus.PASS,"User menambahkan firstname yang valid");
    }


    @And("User menambahkan lastname yang valid")
    public void user_menambahkan_lastname_yang_valid() {
        addToCartAndCheckoutPage.inputLastName("Rahayu");
        extentTest.log(LogStatus.PASS,"User menambahkan lastname yang valid");
    }

    @And("User menambahkan zip postal code yang valid")
    public void user_menambahkan_zip_postal_code_yang_valid() {
        addToCartAndCheckoutPage.inputPostalCode("1234567890");
        extentTest.log(LogStatus.PASS,"User menambahkan zip postal code yang valid");
    }

    @And("User klik tombol continue")
    public void user_klik_tombol_continue() {
        addToCartAndCheckoutPage.clickBtnContinue();
        extentTest.log(LogStatus.PASS,"User klik tombol continue");
    }

    @And("User klik tombol finish")
    public void user_klik_tombol_finish() {
        addToCartAndCheckoutPage.clickBtnFinish();
        extentTest.log(LogStatus.PASS,"User klik tombol finish");
    }

    @Then("User berhasil melakukan checkout")
    public void user_berhasil_melakukan_checkout() {
        Assert.assertEquals(addToCartAndCheckoutPage.getTxtThankYouForYourOrder(),"Thank you for your order!");
        extentTest.log(LogStatus.PASS,"User berhasil melakukan checkout");
    }

    @And("User kembali melihat barang lain")
    public void user_kembali_melihat_barang_lain() {
        addToCartAndCheckoutPage.clickBtnBackToHome();
        extentTest.log(LogStatus.PASS,"User kembali melihat barang lain");
    }

    @When("User menambahkan produk lagi ke keranjang")
    public void user_menambahkan_produk_lagi_ke_keranjang() {
        addToCartAndCheckoutPage.clickButtonAddToCart2();
        extentTest.log(LogStatus.PASS,"User menambahkan produk lagi ke keranjang");
    }

    @And("User melihat melihat produk dalam keranjang ke 2x nya")
    public void user_melihat_melihat_produk_dalam_keranjang_ke_2x_nya() {
        addToCartAndCheckoutPage.clickLinkShoppingCart();
        extentTest.log(LogStatus.PASS,"User melihat melihat produk dalam keranjang ke 2x nya");
    }

    @And("User melakukan checkout ke 2x nya")
    public void user_melakukan_checkout_ke_2x_nya() {
        addToCartAndCheckoutPage.clickBtnCheckout();
        extentTest.log(LogStatus.PASS,"User melakukan checkout ke 2x nya");
    }

    @And("User klik tombol continue tanpa mengisi infomasi")
    public void user_klik_tombol_continue_tanpa_mengisi_infomasi() {
        addToCartAndCheckoutPage.clickBtnContinue();
        extentTest.log(LogStatus.PASS,"User klik tombol continue tanpa mengisi infomasi");
    }

    @When("Sistem memberi tahu error jika tidak memberi informasi")
    public void sistem_memberi_tahu_error_jika_tidak_memberi_informasi() {
        Assert.assertEquals(addToCartAndCheckoutPage.getTxtErrorFirstNameIsRequired(),"Error: First Name is required");
        extentTest.log(LogStatus.PASS,"Sistem memberi tahu error jika tidak memberi informasi");
    }

}
