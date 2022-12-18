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

public class TiresForCargoCarsPage extends AbstractPage {
    private final Logger logger = LogManager.getRootLogger();

    public TiresForCargoCarsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public TiresForCargoCarsPage openPage(String uri) {
        driver.navigate().to(uri);
        logger.info("TiresForCargoCarsPage opened");
        return this;
    }


    @FindBy(xpath = "/html/body/div[2]/div/div/div/div[3]/ul/li[1]/a")
    private WebElement parameterButton;

    @FindBy(xpath = "//*[@id=\"tv|tiporazmer_0\"]")
    private WebElement sizeList;

    @FindBy(xpath = "//*[@id=\"tv|tiporazmer_0\"]/option[1]")
    private WebElement sizeValue;

    @FindBy(xpath = "//*[@id=\"tv|axis_0\"]")
    private WebElement shaftList ;

    @FindBy(xpath = "//*[@id=\"tv|axis_0\"]/option[4]")
    private WebElement shaftValue ;

    @FindBy(xpath = "//*[@id=\"tv|axis_0\"]/option[4]")
    private WebElement manufacturerList ;

    @FindBy(xpath = "//*[@id=\"tv|producer_0\"]/option[1]")
    private WebElement manufacturerValue ;

    @FindBy(xpath = "//*[@id=\"producers\"]/div/form/div[3]/button")
    private WebElement selectButton ;

    @FindBy(xpath = "//*[@id=\"catalog\"]/div[2]/p")
    private WebElement result;

    public TiresForCargoCarsPage clickOnParameterButton() {
        parameterButton.click();
        return this;
    }

    public TiresForCargoCarsPage clickOnSizeList() {
        sizeList.click();
        return this;
    }

    public TiresForCargoCarsPage clickOnSizeValue() {
        sizeValue.click();
        return this;
    }

    public TiresForCargoCarsPage clickOnShaftList() {
        shaftList.click();
        return this;
    }

    public TiresForCargoCarsPage clickOnShaftValue() {
        shaftValue.click();
        return this;
    }

    public TiresForCargoCarsPage clickOnManufacturerList() {
        manufacturerList.click();
        return this;
    }

    public TiresForCargoCarsPage clickOnManufacturerValue() {
        manufacturerValue.click();
        return this;
    }

    public TiresForCargoCarsPage clickOnSelectButton() {
        selectButton.click();
        return this;
    }

    public String getResultText() {
        return result.getText();
    }
}
