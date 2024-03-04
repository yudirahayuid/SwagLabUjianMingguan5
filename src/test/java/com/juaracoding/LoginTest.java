package com.juaracoding;


import com.juaracoding.pages.LoginPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginTest {

    private WebDriver driver;

    public static ExtentTest extentTest;

    private LoginPage loginPage = new LoginPage();

    public LoginTest() {
        driver = Hooks.driver;

        //extend report
        extentTest = Hooks.extentTest;
    }

    // scenario 1
    @Given("User mengakses halaman login")
    public void user_mengakses_halaman_login() {
        driver.get("https://www.saucedemo.com/");
        extentTest.log(LogStatus.PASS, "User mengakses halaman login");
    }

    @When("User memasukan username yang valid")
    public void user_memasukan_username_yang_valid() {
        loginPage.inputUsername("standard_user");
        extentTest.log(LogStatus.PASS, "User memasukan username yang valid");
    }

    // test failed pada login
    @And("User memasukan password kosong yang invalid")
    public void user_memasukan_password_kosong_yang_invalid() {
        loginPage.inputPassword("");
        extentTest.log(LogStatus.PASS, "User memasukan password yang invalid");
    }

    @Then("Sistem menampilkan pesan kesalahan Epic sadface: Password is required")
    public void sistem_menampilkan_pesan_kesalahan_Epic_sadface_Password_is_required() {
        Assert.assertEquals(loginPage.getTxtPasswordIsRequired(), "Epic sadface: Password is required");
        extentTest.log(LogStatus.PASS, "Sistem menampilkan pesan kesalahan Epic sadface: Password is required");
    }

    @And("User klik tombol login")
    public void user_klik_tombol_login() {
        loginPage.clickButtonLogin();
        extentTest.log(LogStatus.PASS, "User klik tombol login");
    }

    @And("User memasukan password yang valid")
    public void user_memasukan_password_yang_valid() {
        loginPage.inputPassword("secret_sauce");
        extentTest.log(LogStatus.PASS, "User memasukan password yang valid");
    }

    @And("User klik tombol login ke 2x nya")
    public void user_klik_tombol_login_2x_nya() {
        loginPage.clickButtonLogin();
        extentTest.log(LogStatus.PASS, "User klik tombol login ke 2x nya");
    }

    @Then("User berhasil login dan diarahkan ke halaman utama atau dashboard setelah login")
    public void user_berhasil_login_dan_diarahkan_ke_halaman_utama_atau_dashboard_setelah_login() {
        Assert.assertEquals(loginPage.getTxtAppLogo(),"Swag Labs");
        extentTest.log(LogStatus.PASS, "User berhasil login dan diarahkan ke halaman utama atau dashboard setelah login");
    }

}
