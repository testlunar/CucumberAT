package yandex.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import yandex.steps.BaseSteps;

import java.util.concurrent.TimeUnit;

public class YandexMarketPage extends BasePageObject  {

    @FindBy(xpath = "//div[@role='tablist']")
    WebElement yandexMarketMenu;

    @FindBy(xpath = "//div[@data-apiary-widget-name='@MarketNode/NavigationTree']")
    WebElement productColumn;

    @FindBy(xpath = "//*[contains(text(),'Все фильтры')]")
    WebElement allFilters;

    public YandexMarketPage(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void selectYandexMarketMenu(String menuItem) {
        yandexMarketMenu.findElement(By.xpath(".//*[contains(text(),'"+menuItem+"')]")).click();
    }

    public void selectProductMenu(String menuItem) {
        productColumn.findElement(By.xpath(".//*[contains(text(),'"+menuItem+"')]")).click();
    }

    public void switchToAllFilters() {
        allFilters.click();
    }
}
