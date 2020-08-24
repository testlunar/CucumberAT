package yandex.pages;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import yandex.steps.BaseSteps;

import java.sql.SQLOutput;
import java.util.List;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class FilterPage extends BasePageObject {
    @FindBy(xpath = "//input[@class='_2xtC2uTwPF'][1]")
    WebElement minPrice;

    @FindBy(xpath = "//div[@data-filter-id='7893318']")
    WebElement productBrand;

    @FindBy(xpath = "//div[@class='_1Mk5atr-TQ']//*[contains(text(),'Показать')]")
    WebElement showResult;

    @FindBy(xpath = "//article[@class='_1_IxNTwqll cia-vs cia-cs']")
    WebElement productElement;

    @FindBy(xpath = "//article[@class='_1_IxNTwqll cia-vs cia-cs'][1]//span[@class='']")
    WebElement firstElement;

    @FindBy(xpath = "//input[@class='nQ8aBP7fBN']")
    WebElement search;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement searchButton;

    @FindBy(xpath = "//span[@class='_29F8FeAhp-'][1]")
    WebElement secondElementclick;

    @FindBy(xpath = "//h3[@class='_3dCGE8Y9v3 cLo1fZHm2y']//a[@class='_27nuSZ19h7 wwZc93J2Ao cia-cs'][1]")
    WebElement secondElement;






    public FilterPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void inputPrice(String price)  {
        minPrice.click();
        minPrice.sendKeys(price);
    }

    public void selectBrand(String brand)  {
        WebElement searchBrand = productBrand.findElement(By.xpath("//div[@data-filter-id='7893318']//*[contains(text(),'"+brand+"')]"));
        ((JavascriptExecutor) BaseSteps.getDriver()).executeScript("arguments[0].scrollIntoView();", searchBrand);
        searchBrand.click();
    }

    public void showResult()  {
        showResult.click();
    }

    public void checkNumberElements(int num) {
        WebDriver driver= BaseSteps.getDriver();
        int list = driver.findElements(By.xpath("//article[@class='_1_IxNTwqll cia-vs cia-cs']")).size();

        assertThat(list,equalTo(num));
        System.out.println("Количество элементов на странице "+list);

    }

    public String getFirstElement() {
        String firstElementName1 = firstElement.getText();
              return firstElementName1;
    }

    public String getSecondElement()  {
        String secondElement1 = secondElement.getText();
        return secondElement1;
    }

    public void searchElementName() {
        search.click();
        search.sendKeys(firstElement.getText());
        searchButton.click();
    }

    public void compareElements(String el1, String el2) {
        Assert.assertTrue(el1.equals(el2));
        System.out.println("Названия совпадают");
    }







}


