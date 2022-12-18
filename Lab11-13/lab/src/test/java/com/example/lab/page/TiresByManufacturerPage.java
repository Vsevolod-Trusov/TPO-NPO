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

public class TiresByManufacturerPage extends AbstractPage {
    private final Logger logger = LogManager.getRootLogger();
    protected final int WAIT_TIMEOUT_SECONDS = 10;
    public TiresByManufacturerPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public TiresByManufacturerPage openPage(String uri) {
        driver.navigate().to(uri);
        logger.info("TiresByManufacturerPage opened");
        return this;
    }


    @FindBy(xpath = "/html/body/div[2]/div/div/div/div[3]/ul/li[3]/a")
    private WebElement parameterButton;

    @FindBy(xpath = "//*[@id=\"manuf_all\"]/div[21]/a")
    private WebElement manufacturerValue ;
    private final By manufacturersValuesBlock = By.xpath("//*[@id=\"producers\"]/div");

    @FindBy(xpath = "//*[@id=\"catalog\"]/div[2]/p")
    private WebElement result;

    public TiresByManufacturerPage clickOnParameterButton() {
        parameterButton.click();
        return this;
    }

    public TiresByManufacturerPage clickOnManufacturerLink() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(manufacturersValuesBlock));
        manufacturerValue.click();
        return this;
    }

    public String getResultText() {
        return result.getText();
    }
}