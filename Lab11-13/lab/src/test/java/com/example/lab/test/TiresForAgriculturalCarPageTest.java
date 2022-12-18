package com.example.lab.test;

import com.example.lab.driver.DriverSingleton;
import com.example.lab.page.TiresSeachPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class TiresForAgriculturalCarPageTest {
    protected WebDriver driver;

    @Before
    public void setUp() {
        driver = DriverSingleton.getDriver();
    }

    @Test
    public void whenGetTiresThenGetOneElement() throws InterruptedException {
        TiresSeachPage tiresSearchPage = new TiresSeachPage(driver);
        tiresSearchPage
                .openPage("https://bel-shina.by/gruzovyie")
                .clickOnParameterButton()
                .clickOnTypeSizeList()
                .clickOnTypeSizeValue()
                .clickOnManufacturerList()
                .clickOnManufacturersValue()
                .clickGetCollectionButton();
        Assert.assertEquals(1,
                tiresSearchPage.getResultCollectionSize());
    }

    @After
    public void clearResources() {
        DriverSingleton.closeDriver();
    }
}
