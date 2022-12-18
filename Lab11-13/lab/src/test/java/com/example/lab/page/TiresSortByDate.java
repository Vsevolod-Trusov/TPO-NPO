package com.example.lab.page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TiresSortByDate extends AbstractPage {
    private final Logger logger = LogManager.getRootLogger();

    public TiresSortByDate(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public TiresSortByDate openPage(String uri) {
        driver.navigate().to(uri);
        logger.info("TiresSortByDate opened");
        return this;
    }

    @FindBy(xpath = "//*[@id=\"mse2_sort\"]/a[1]")
    private WebElement dateButton;

    @FindBy(xpath = "//*[@id=\"mse2_results\"]/div[1]/div/div[2]/div[2]/div/div/a")
    private WebElement result;

    public TiresSortByDate clickOnDateButton() {
        dateButton.click();
        return this;
    }
    public String getResultText() throws InterruptedException {
        Thread.sleep(1000);
        return result.getText();
    }
}
