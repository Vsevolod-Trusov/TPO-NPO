package com.example.lab.page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class TiresSeachPage extends AbstractPage {
    private final Logger logger = LogManager.getRootLogger();
    public TiresSeachPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }


    public TiresSeachPage openPage(String uri) {
        driver.navigate().to(uri);
        logger.info("TiresSearchPage opened");
        return this;
    }


    @FindBy(xpath = "//*[@id=\"tv|width-profile_0\"]")//
    private  WebElement listWidth;

    @FindBy(xpath = "//*[@id=\"tv|width-profile_0\"]/option[6]")//
    private WebElement widthValue;

    @FindBy(xpath = "//*[@id=\"tv|series_0\"]")//
    private WebElement listProfile ;

    @FindBy(xpath = "//*[@id=\"tv|series_0\"]/option[6]")//
    private WebElement profileSize ;

    @FindBy(xpath = "//*[@id=\"tv|radius_0\"]")//
    private WebElement listDiameters ;

    @FindBy(xpath = "//*[@id=\"tv|radius_0\"]/option[12]")//
    private WebElement diameterValue ;

    @FindBy(xpath = "//*[@id=\"tv|season_0\"]")//
    private WebElement listSeasons ;

    @FindBy(xpath = "//*[@id=\"tv|season_0\"]/option[2]")//
    private WebElement seasonValue ;

    @FindBy(xpath = "//*[@id=\"tv|producer_0\"]")//
    private WebElement listManufacturers ;

    @FindBy(xpath = "//*[@id=\"tv|producer_0\"]/option[10]")//
    private WebElement manufacturerValue ;

    @FindBy(xpath = "//*[@id=\"tv|auto-type_0\"]")
    private WebElement listCarTypes ;

    @FindBy(xpath = "//*[@id=\"tv|auto-type_0\"]/option[6]")
    private WebElement carTypeValue ;

    @FindBy(xpath = "//*[@id=\"mse2_tv|stud_0\"]")
    private WebElement isStudded ;

    @FindBy(xpath = "//*[@id=\"mse2_tv|runflat_0\"]")
    private WebElement isRunFlat ;

    @FindBy(xpath = "//*[@id=\"mse2_filters\"]/div/button")
    private WebElement pickUpButton ;

    @FindBy(xpath = "//*[@id=\"mse2_results\"]/div[1]")
    private WebElement listTiresElement ;



    //next elements for second test
    ///html/body/div[2]/div/div/div/div[3]/ul/li[2]/a
    @FindBy(xpath = "/html/body/div[2]/div/div/div/div[3]/ul/li[2]/a")
    private WebElement parameterButton ;

    @FindBy(xpath="//*[@id=\"tv|tiporazmer_tractor_0\"]")
    private WebElement typeSizeList ;

    @FindBy(xpath="//*[@id=\"tv|tiporazmer_tractor_0\"]/option[7]")
    private WebElement typeSizeValue ;

    @FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div[2]/div[2]/div/form/fieldset[2]/select")
    private WebElement manufacturersList ;

    @FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div[2]/div[2]/div/form/fieldset[2]/select/option[1]")
    private WebElement manufacturersValue ;

    @FindBy(xpath="//*[@id=\"marks\"]/div/form/div/button")
    private WebElement searchButton ;

    @FindBy(xpath = "//*[@id=\"mse2_results\"]/div[1]")
    private List<WebElement> listTires;

    public TiresSeachPage clickOnWidthList() {
        listWidth.click();
        return this;
    }

    public TiresSeachPage clickOnWidthValue() {
        widthValue.click();
        return this;
    }

    public TiresSeachPage clickOnProfileList() {
        listProfile.click();
        return this;
    }

    public TiresSeachPage clickOnProfileSizeValue() {
        profileSize.click();
        return this;
    }

    public TiresSeachPage clickOnDiameterList() {
        listDiameters.click();
        return this;
    }

    public TiresSeachPage clickOnDiameterValue() {
        diameterValue.click();
        return this;
    }

    public TiresSeachPage clickOnSeasonList() {
        listSeasons.click();
        return this;
    }

    public TiresSeachPage clickOnSeasonValue() {
        seasonValue.click();
        return this;
    }

    public TiresSeachPage clickOnListManufacturers() {
        listManufacturers.click();
        return this;
    }

    public TiresSeachPage clickOnManufacturerValue() {
        manufacturerValue.click();
        return this;
    }

    public TiresSeachPage clickOnListCarTypes() {
        listCarTypes.click();
        return this;
    }

    public TiresSeachPage clickOnCarTypeValue() {
        carTypeValue.click();
        return this;
    }

    public TiresSeachPage selectIsStudded() {
        isStudded.click();
        return this;
    }

    public TiresSeachPage selectIsRunFlat() {
        isRunFlat.click();
        return this;
    }

    public TiresSeachPage clickOnPickUpButton() {
        pickUpButton.click();
        return this;
    }

    public String getListTiresText() {
        return listTiresElement.getText();
    }

    //next methds for the second test
    public TiresSeachPage clickOnParameterButton() {
        parameterButton.click();
        return this;
    }

    public TiresSeachPage clickOnTypeSizeList() {
        typeSizeList.click();
        return this;
    }

    public TiresSeachPage clickOnTypeSizeValue() {
        typeSizeValue.click();
        return this;
    }

    public TiresSeachPage clickOnManufacturerList() {
        manufacturersList.click();
        return this;
    }
    public TiresSeachPage clickOnManufacturersValue() {
        manufacturersValue.click();
        return this;
    }

    public TiresSeachPage clickGetCollectionButton() {
        searchButton.click();
        return this;
    }

    public int getResultCollectionSize() {
        return listTires.size();
    }
}
