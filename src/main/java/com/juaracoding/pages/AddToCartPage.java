package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {

    private WebDriver driver;

    public AddToCartPage() {
        this.driver = DriverSingleleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    //Locator Find Element menggunakan PageFactory
    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    private WebElement btnAddToCart;

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    private WebElement linkShoppingCart;

    @FindBy(xpath = "//span[@class='title']")
    private WebElement yourCart;

    public void clickButtonAddToCart() {
        btnAddToCart.click();
    }

    public void clickLinkShoppingCart() {
        linkShoppingCart.click();
    }

    public String getTxtYourCart() {
        return yourCart.getText();
    }
}
