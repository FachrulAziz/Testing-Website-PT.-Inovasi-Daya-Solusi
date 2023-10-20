package com.IDS.pages;

import com.IDS.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadBulkPage {
    private WebDriver driver;
    public UploadBulkPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"main_menu\"]/nav/ul/div[1]/a/span")
    WebElement clickSK;
    @FindBy(xpath = "//span[normalize-space()='Bulk Upload']")
    WebElement clickBU;
    @FindBy(xpath = "/html/body/div/div[1]/section/div[1]/div/div/div[2]/div/form/div[2]/div/a")
    WebElement Add;
    @FindBy(xpath = "//*[@id=\"name1\"]")
    WebElement inputN;
    @FindBy(xpath = "//button[@id='add_data']")
    WebElement btnTambah;
    @FindBy(xpath = "/html/body/div[3]/div/div[3]")
    WebElement getValid;
    @FindBy(xpath = "/html/body/div[3]/div/div[3]")
    WebElement getInvalid;
    @FindBy(xpath = "//button[@class='swal-button swal-button--confirm']")
    WebElement BtnCon;
    @FindBy(xpath = "//*[@id=\"modal-right\"]/div/div/div[1]/button/span")
    WebElement BtnC;


    public void clickSetorKu(){
        clickSK.click();
    }
    public void clickBulkUpload(){
        clickBU.click();
    }
    public void clickAdd(){
        Add.click();
    }
    public void inputName(String name){
        this.inputN.sendKeys(name);
    }
    public void clickTambah(){
        btnTambah.click();
    }
    public  String getTextvalid(){
        return getValid.getText();
    }
    public  String getTextInvalid(){
        return getInvalid.getText();
    }
    public void BtnConfir(){
        BtnCon.click();
    }
   public void BtnClose(){
        BtnC.click();
    }

    static void delay(long detik){
        try {
            Thread.sleep(detik*1000); // delay 3 detik
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
