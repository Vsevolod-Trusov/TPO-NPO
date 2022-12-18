package com.example.lab.test;

import com.example.lab.driver.DriverSingleton;
import com.example.lab.page.TiresByModelPage;
import com.example.lab.page.TiresSeachPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class TiresByModelPageTest {

    protected WebDriver driver;

    @Before
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
        Assert.assertEquals("Всего результатов: 24",
                tiresByModel.getResultText());
    }

    @After
    public void clearResources() {
        DriverSingleton.closeDriver();
    }
}
