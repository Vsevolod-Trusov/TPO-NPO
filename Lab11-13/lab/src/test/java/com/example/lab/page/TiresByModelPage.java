package com.example.lab.page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class TiresByModelPage extends AbstractPage {
    private final Logger logger = LogManager.getRootLogger();

    public TiresByModelPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public TiresByModelPage openPage(String uri) {
        driver.navigate().to(uri);
        logger.info("TiresByModelPage opened");
        return this;
    }

    @FindBy(xpath = "//html/body/div[2]/div/div/div/div[3]/ul/li[2]/a")
    private WebElement parameterButton;

    @FindBy(xpath = "/html/body/div[2]/div/div/div/div[3]/div[2]/div[2]/div/form/div[1]/select")
    private WebElement listMark;

    @FindBy(xpath = "/html/body/div[2]/div/div/div/div[3]/div[2]/div[2]/div/form/div[1]/select/option[3]")
    private WebElement markValue;

    @FindBy(xpath = "/html/body/div[2]/div/div/div/div[3]/div[2]/div[2]/div/form/div[2]/select")
    private WebElement modelList ;

    @FindBy(xpath = "/html/body/div[2]/div/div/div/div[3]/div[2]/div[2]/div/form/div[2]/select/option[15]")
    private WebElement modelValue ;

    @FindBy(xpath = "//*[@id=\"marks\"]/div/form/div[3]/select")
    private WebElement yearList ;

    @FindBy(xpath = "/html/body/div[2]/div/div/div/div[3]/div[2]/div[2]/div/form/div[3]/select/option[9]")
    private WebElement yearValue ;

    @FindBy(xpath = "//*[@id=\"marks\"]/div/form/div[4]/select")
    private WebElement modificationsList ;

    @FindBy(xpath = "//*[@id=\"marks\"]/div/form/div[4]/select/option[7]")
    private WebElement modificationValue ;

    //
    @FindBy(xpath = "//html/body/div[2]/div/div/div/div[3]/div[2]/div[2]/div/form/div[6]/div/div[1]/div/p[2]/a")
    private WebElement manufacturerLink ;
    private final By divLink = By.xpath("/html/body/div[2]/div/div/div/div[3]/div[2]/div[2]/div/form/div[6]/div/div[1]/div");

    @FindBy(xpath = "//*[@id=\"catalog\"]/div[2]/p")
    private WebElement result;

    public TiresByModelPage clickOnParameterButton() {
        parameterButton.click();
        return this;
    }

    public TiresByModelPage clickOnMarkList() {
        listMark.click();
        return this;
    }

    public TiresByModelPage clickOnMarkValue() {
        markValue.click();
        return this;
    }

    public TiresByModelPage clickOnModelList() {
        modelList.click();
        return this;
    }

    public TiresByModelPage clickOnModelValue() {
        modelValue.click();
        return this;
    }

    public TiresByModelPage clickOnYearList() {
        yearList.click();
        return this;
    }

    public TiresByModelPage clickOnYearValue() {
        yearValue.click();
        return this;
    }

    public TiresByModelPage clickOnModificationList() {
        modificationsList.click();
        return this;
    }

    public TiresByModelPage clickOnModificationValue() {
        modificationValue.click();
        return this;
    }


    public TiresByModelPage clickOnManufacturerLink() {
      new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(divLink));
        manufacturerLink.click();
        return this;
    }

    public String getResultText() {
        driver.navigate().to("https://bel-shina.by/katalog/width-225/height-45/d-r17");
        return result.getText();
    }
}