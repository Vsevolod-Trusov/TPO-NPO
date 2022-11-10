import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HelloWebDriver {

    private WebDriver driver;
    @Before
    public void setUp() {
         driver = new ChromeDriver();
        driver.get("https://bel-shina.by/legkovyie");
    }
    @Test
    public void whenGetTiresByParameterThenCatchException() {
        WebElement listWidth = driver.findElement(By.xpath("//*[@id=\"tv|width-profile_0\"]"));
        listWidth.click();
        WebElement widthValue = driver.findElement(By.xpath("//*[@id=\"tv|width-profile_0\"]/option[6]"));
        widthValue.click();

        WebElement listProfile = driver.findElement(By.xpath("//*[@id=\"tv|series_0\"]"));
        listProfile.click();
        WebElement profileSize= driver.findElement(By.xpath("//*[@id=\"tv|series_0\"]/option[6]"));
        profileSize.click();

        WebElement listDiameters = driver.findElement(By.xpath("//*[@id=\"tv|radius_0\"]"));
        listDiameters.click();
        WebElement diameterValue= driver.findElement(By.xpath("//*[@id=\"tv|radius_0\"]/option[12]"));
        diameterValue.click();

        WebElement listSeasons = driver.findElement(By.xpath("//*[@id=\"tv|season_0\"]"));
        listSeasons.click();
        WebElement seasonValue= driver.findElement(By.xpath("//*[@id=\"tv|season_0\"]/option[2]"));
        seasonValue.click();

        WebElement listManufacturers = driver.findElement(By.xpath("//*[@id=\"tv|producer_0\"]"));
        listManufacturers.click();
        WebElement manufacturerValue= driver.findElement(By.xpath("//*[@id=\"tv|producer_0\"]/option[10]"));
        manufacturerValue.click();

        WebElement listCarTypes = driver.findElement(By.xpath("//*[@id=\"tv|auto-type_0\"]"));
        listCarTypes.click();
        WebElement carTypeValue= driver.findElement(By.xpath("//*[@id=\"tv|auto-type_0\"]/option[6]"));
        carTypeValue.click();

        WebElement isStudded = driver.findElement(By.xpath("//*[@id=\"mse2_tv|stud_0\"]"));
        isStudded.click();
        WebElement isRunFlat = driver.findElement(By.xpath("//*[@id=\"mse2_tv|runflat_0\"]"));
        isRunFlat.click();

        WebElement pickUpButton = driver.findElement(By.xpath("//*[@id=\"mse2_filters\"]/div/button"));
        pickUpButton.click();

        WebElement listTires = driver.findElement(By.xpath("//*[@id=\"mse2_results\"]/div[1]"));
        Assert.assertEquals("Подходящих результатов не найдено.", listTires.getText());
    }

    @After
    public void clearResources() {
        driver.quit();
        driver = null;
    }
}
