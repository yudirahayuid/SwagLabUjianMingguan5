package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;

    public LoginPage() {
        this.driver = DriverSingleleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    //Locator Find Element menggunakan PageFactory
    @FindBy(xpath = "//input[@name='user-name']")
    private WebElement username;

    @FindBy(xpath = "//h3[@data-test='error']")
    private WebElement passwordIsRequired;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement password;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement btnLogin;

    @FindBy(xpath = "//div[@class='app_logo']")
    private WebElement appLogo;

    //bisa digunakan precondition
    public void formLogin(String username, String password) {
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        btnLogin.click();
    }

    public void inputUsername(String username){
        this.username.sendKeys(username);
    }

    public void inputPassword (String password) {
        this.password.sendKeys(password);
    }

    public void clickButtonLogin() {
        btnLogin.click();
    }

    //return getText
    public String getTxtPasswordIsRequired() {
        return passwordIsRequired.getText();
    }

    public String getTxtAppLogo() {
        return appLogo.getText();
    }
    
}
