package com.example.lab.test;

import com.example.lab.driver.DriverSingleton;
import com.example.lab.page.TiresSeachPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


public class ObjectPageTest {
    protected WebDriver driver;

    @Before
    public void setUp() {
        driver = DriverSingleton.getDriver();
    }

    @Test
    public void whenGetTiresByParameterThenGetEmptyCollection()  {
        TiresSeachPage tiresSearchPage = new TiresSeachPage(driver);
        tiresSearchPage
                .openPage("https://bel-shina.by/legkovyie")
                .clickOnWidthList()
                .clickOnWidthValue()
                .clickOnProfileList()
                .clickOnProfileSizeValue()
                .clickOnDiameterList()
                .clickOnDiameterValue()
                .clickOnSeasonList()
                .clickOnSeasonValue()
                .clickOnListManufacturers()
                .clickOnManufacturerValue()
                .clickOnListCarTypes()
                .clickOnCarTypeValue()
                .selectIsStudded()
                .selectIsRunFlat()
                .clickOnPickUpButton();
        Assert.assertEquals("Подходящих результатов не найдено.",
                tiresSearchPage.getListTiresText());//

    }

    @After
    public void clearResources() {
        DriverSingleton.closeDriver();
    }
}
