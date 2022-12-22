package com.example.lab.test;

import com.example.lab.driver.DriverSingleton;
import com.example.lab.page.TiresSeachPage;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class ObjectPageTest {
    protected WebDriver driver;

    @BeforeEach
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

    @AfterEach
    public void clearResources() {
        DriverSingleton.closeDriver();
    }
}
