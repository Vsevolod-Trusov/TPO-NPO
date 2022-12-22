package com.example.lab.test;

import com.example.lab.driver.DriverSingleton;
import com.example.lab.page.AbstractPage;
import com.example.lab.page.TiresSortByDate;
import com.example.lab.page.TiresSortByPrice;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
//@Execution(ExecutionMode.CONCURRENT)
public class TiresSortByPriceTest {
    protected WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = DriverSingleton.getDriver();
    }

    @Test
    public void whenGetTiresThenGetSortedCollection() throws InterruptedException {
        TiresSortByPrice tiresSortByPrice = new TiresSortByPrice(driver);
        tiresSortByPrice
                .openPage("https://bel-shina.by/legkovyie")
                .clickOnPriceButton();
        assertThat("Белшина Astarta Бел-273 235/60R16 100H (2016)",
                is(equalTo(tiresSortByPrice.getResultText())));
    }

    @AfterEach
    public void clearResources() {
        DriverSingleton.closeDriver();
    }
}
