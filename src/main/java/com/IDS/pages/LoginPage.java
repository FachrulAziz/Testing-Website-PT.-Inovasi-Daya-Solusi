package com.IDS.pages;

import com.IDS.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;
    public LoginPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//input[@id='email']")
    WebElement username;
    @FindBy(xpath = "//input[@id='password']")
    WebElement password;
    @FindBy(xpath = "//button[@id='login']")
    WebElement btnLogin;
    @FindBy(xpath = "//a[normalize-space()='Log Out']")
    WebElement btnLogout;
    @FindBy(xpath = "//h1[normalize-space()='Welcome Back!']")
    WebElement txtDashboard;
    @FindBy(xpath = "/html/body/div[2]/div/div[3]")
    WebElement txtInvalidCredentials;
    @FindBy(xpath = "//div[@class='swal-text']")
    WebElement txtInvalidPassword;
    @FindBy(xpath = "//button[@class='swal-button swal-button--confirm']")
    WebElement BtnOk;


    public void login(String username, String password){
        this.username.clear();
        this.password.clear();
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        btnLogin.click();
    }


    public void enterUsername(String username){
        this.username.sendKeys(username);
    }

    public void enterPassword(String password){
        this.password.sendKeys(password);
    }

    public void clickBtnLogin(){
        btnLogin.click();
        delay(3);
    }

    public String getTxtDashboard(){
        return txtDashboard.getText();
    }

    public String getTxtInvalidCredentials(){
        return txtInvalidCredentials.getText();
    }
    public  String getTextInvalidPass(){
        return txtInvalidPassword.getText();
    }
    public void OK(){
        BtnOk.click();
    }
    static void delay(long detik){
        try {
            Thread.sleep(detik*1000); // delay 3 detik
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
