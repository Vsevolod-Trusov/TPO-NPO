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

public class TiresSortByName extends AbstractPage {
    private final Logger logger = LogManager.getRootLogger();

    public TiresSortByName(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public TiresSortByName openPage(String uri) {
        driver.navigate().to(uri);
        logger.info("TiresSortByName opened");
        return this;
    }

    @FindBy(xpath = "//*[@id=\"mse2_sort\"]/a[3]")
    private WebElement nameButton;

    @FindBy(xpath = "//*[@id=\"mse2_results\"]/div[1]/div/div[2]/div[2]/div/div/a")
    private WebElement result;

    private final By resultList = By.xpath("//*[@id=\"mse2_results\"]/div[1]/div/div[2]/div[2]/div/div/a");
    public TiresSortByName clickOnNameButton() {
        nameButton.click();
        return this;
    }
    public String getResultText() throws InterruptedException {
        Thread.sleep(1000);
        return result.getText();
    }
}