import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import base_page.TiresSeachPage;

public class objectPageTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        final ChromeOptions options = new ChromeOptions();
        options.addArguments("--window-size=1920,1080");
        driver = new ChromeDriver(options);

    }

    @Test
    public void whenGetTiresByParameterThenGetEmptyCollection()  {
        TiresSeachPage tiresSearchPage = new TiresSeachPage(driver).openPage("https://bel-shina.by/legkovyie");
        tiresSearchPage.clickOnWidthList()
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


    @Test
    public void whenGetTiresThenGetOneElement() throws InterruptedException {
        TiresSeachPage tiresSearchPage = new TiresSeachPage(driver).openPage("https://bel-shina.by/gruzovyie");
        tiresSearchPage.clickOnParameterButton()
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
        driver.quit();
        driver = null;
    }
}
