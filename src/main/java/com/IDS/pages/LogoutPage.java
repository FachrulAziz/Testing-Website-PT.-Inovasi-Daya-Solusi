package com.IDS.pages;

import com.IDS.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
    private WebDriver driver;
    public LogoutPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//img[@alt='User Image']")
    WebElement btnIcon;
    @FindBy(xpath = "//a[@class='btn text-white center']")
    WebElement btnLogout;
    @FindBy(xpath = "//h3[@class='centered2']")
    WebElement txtDashboard;


    public void clickIcon(){
        btnIcon.click();
    }
    public void clickLogout(){
        btnLogout.click();
    }

    public String getTxtDashboard(){
        return txtDashboard.getText();
    }
}
