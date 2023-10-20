package com.IDS;

import com.IDS.pages.UploadBulkPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class UploadBulk {

    static WebDriver driver;
    static ExtentTest extentTest;
    static UploadBulkPage upload = new UploadBulkPage();

    public UploadBulk(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("User clik menu SetorKu")
    public void User_clik_menu_SetorKu(){
        upload.clickSetorKu();
        extentTest.log(LogStatus.PASS,"User clik menu SetorKu");
    }
    @And("User clik Collapse Bulk Upload")
    public void User_clik_Collapse_Bulk_Upload(){
        upload.clickBulkUpload();
        extentTest.log(LogStatus.PASS,"User clik Collapse Bulk Upload");
    }
    @And("User clik button add manual")
    public void User_clik_button_add_manual(){
        upload.clickAdd();
        extentTest.log(LogStatus.PASS,"User clik button add manual");
    }
    @And("User input nama penginput")
    public void User_input_nama_penginput(){
        delay(2);
        upload.inputName("Antonn");
        extentTest.log(LogStatus.PASS, "User input nama penginput");
        delay(3);
    }
    @And("User click button tambah")
    public void User_click_button_tambah(){
        upload.clickTambah();
        extentTest.log(LogStatus.PASS,"User click button tambah");
    }

    @And("Nama penginput tidak di isi")
    public void Nama_penginput_tidak_di_isi() {
        upload.inputName("");
        extentTest.log(LogStatus.PASS, "Nama penginput tidak di isi");
    }

    @Then("User get text valid data")
    public void User_get_text_valid_data() {
        Hooks.delay(1);
        Assert.assertEquals(upload.getTextvalid(), "Berhasil tambah data");
        extentTest.log(LogStatus.PASS, "User get text valid data");
    }
    @Then("User get text invalid data")
    public void User_get_text_invalid_data() {
        Hooks.delay(1);
        Assert.assertEquals(upload.getTextInvalid(), "Semua data harus diisi.");
        extentTest.log(LogStatus.PASS, "User get text invalid data");
    }
    @And("User click ok confir")
    public void User_click_ok_confir(){
        upload.BtnConfir();
        extentTest.log(LogStatus.PASS,"User click ok confir");
    }
    @And("User click close")
    public void User_click_close(){
        upload.BtnClose();
        extentTest.log(LogStatus.PASS,"User click close");
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
