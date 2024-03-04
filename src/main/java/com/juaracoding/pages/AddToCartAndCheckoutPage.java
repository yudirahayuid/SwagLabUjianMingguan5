package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartAndCheckoutPage {

    private WebDriver driver;

    public AddToCartAndCheckoutPage() {
        this.driver = DriverSingleleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    //Locator Find Element menggunakan PageFactory
    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    private WebElement btnAddToCart;

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    private WebElement linkShoppingCart;

    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement btnCheckout;

    @FindBy(id = "first-name")
    private WebElement firstName;

    @FindBy(id = "last-name")
    private WebElement lastName;

    @FindBy(id = "postal-code")
    private WebElement postalCode;

    @FindBy(id = "continue")
    private WebElement btnContinue;

    @FindBy(id = "finish")
    private WebElement btnFinish;

    @FindBy(xpath = "//h2[@class='complete-header']")
    private WebElement thankYouForYourOrder;

    public void clickButtonAddToCart() {
        btnAddToCart.click();
    }

    public void clickLinkShoppingCart() {
        linkShoppingCart.click();
    }

    public void clickBtnCheckout() {
        btnCheckout.click();
    }

    public void inputFirstName(String firstName) {
        this.firstName.sendKeys(firstName);
    }

    public void inputLastName(String lastName) {
        this.lastName.sendKeys(lastName);
    }

    public void inputPostalCode(String postalCode) {
        this.postalCode.sendKeys(postalCode);
    }

    public void clickBtnContinue() {
        btnContinue.click();
    }

    public void clickBtnFinish() {
        btnFinish.click();
    }

    public String getTxtThankYouForYourOrder() {
        return thankYouForYourOrder.getText();
    }
}
