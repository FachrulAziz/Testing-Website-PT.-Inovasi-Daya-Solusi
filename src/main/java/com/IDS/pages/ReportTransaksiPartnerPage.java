package com.IDS.pages;

import com.IDS.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportTransaksiPartnerPage {
    private WebDriver driver;
    public ReportTransaksiPartnerPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[normalize-space()='Transaksi Partner']")
    WebElement clickTP;
    //
    @FindBy(xpath = "//button[@id='export']")
    WebElement clickTo;

    public void clickTransaksi(){
        delay(1);
        clickTP.click();
    }
    public void clickToExcel(){
        clickTo.click();
    }
   static void delay(long detik){
        try {
            Thread.sleep(detik*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
