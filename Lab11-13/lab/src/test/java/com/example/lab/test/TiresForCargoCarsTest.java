package com.example.lab.test;

import com.example.lab.driver.DriverSingleton;
import com.example.lab.page.TiresForCargoCarsPage;
import com.example.lab.page.TiresSeachPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class TiresForCargoCarsTest {
    protected WebDriver driver;

    @Before
    public void setUp() {
        driver = DriverSingleton.getDriver();
    }

    @Test
    public void whenGetTiresThenGetCollection() throws InterruptedException {
        TiresForCargoCarsPage cargiTires = new TiresForCargoCarsPage(driver);
        cargiTires
                .openPage("https://bel-shina.by/gruzovyie")
                .clickOnParameterButton()
                .clickOnSizeList()
                .clickOnSizeValue()
                .clickOnShaftList()
                .clickOnShaftValue()
                .clickOnManufacturerList()
                .clickOnManufacturerValue()
                .clickOnSelectButton();
        assertThat("Всего результатов: 41",
                is(equalTo(cargiTires.getResultText())));
    }

    @After
    public void clearResources() {
        DriverSingleton.closeDriver();
    }
}

