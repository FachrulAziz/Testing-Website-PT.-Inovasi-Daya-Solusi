package com.IDS;

import com.IDS.pages.ReportTransaksiPartnerPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ReportTransaksiPartner {

    static WebDriver driver;
    static ExtentTest extentTest;
    static ReportTransaksiPartnerPage report = new ReportTransaksiPartnerPage();

    public ReportTransaksiPartner(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    @And("User clik Collapse Transaksi Partner")
    public void User_clik_Collapse_Transaksi_Partner(){
        report.clickTransaksi();
        extentTest.log(LogStatus.PASS,"User clik Collapse Transaksi Partner");
    }
    @And("User clik button export to Excel")
    public void User_clik_button_export_to_Excel(){
        report.clickToExcel();
        extentTest.log(LogStatus.PASS,"User clik button export to Excel");
    }

    static void delay(long detik){
        try {
            Thread.sleep(detik*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    static void scroll(int pixel){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,"+pixel+")"); //scroll down vertikal 500px
    }
}
