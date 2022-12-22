package com.example.lab.test;

import com.example.lab.driver.DriverSingleton;
import com.example.lab.page.TiresByModelPage;
import com.example.lab.page.TiresSeachPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.openqa.selenium.WebDriver;
//@Execution(ExecutionMode.CONCURRENT)
public class TiresByModelPageTest {

    protected WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = DriverSingleton.getDriver();
    }

    @Test
    public void whenGetTiresThenGetCollection() throws InterruptedException {
        TiresByModelPage tiresByModel = new TiresByModelPage(driver);
        tiresByModel
                .openPage("https://bel-shina.by/legkovyie")
                .clickOnParameterButton()
                .clickOnMarkList()
                .clickOnMarkValue()
                .clickOnModelList()
                .clickOnModelValue()
                .clickOnYearList()
                .clickOnYearValue()
                .clickOnModificationList()
                .clickOnModificationValue()
                .clickOnManufacturerLink();
        Assert.assertEquals("Всего результатов: 26",
                tiresByModel.getResultText());
    }

    @AfterEach
    public void clearResources() {
        DriverSingleton.closeDriver();
    }
}
