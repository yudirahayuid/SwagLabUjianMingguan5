package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutPage {

    private WebDriver driver;

    public CheckoutPage() {
        this.driver = DriverSingleleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    //Locator Find Element menggunakan PageFactory
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

    @FindBy(xpath = "//*[@id='header_container']/div[2]/span")
    private WebElement checkoutComplete;

    @FindBy(xpath = "//h2[@class='complete-header']")
    private WebElement thankYouForYourOrder;

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
