package yandex.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.allure.annotations.Step;
import yandex.steps.BaseSteps;

import java.util.concurrent.TimeUnit;


public class MainPage  {

    public MainPage(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='container container__services container__line']")
    WebElement mainMenu;



    public void selectMainMenu(String menuItem) throws InterruptedException {
        String parentWindow = BaseSteps.getDriver().getWindowHandle();
        String s = BaseSteps.getDriver().getTitle();
        System.out.println("Я на странице " + s);

        mainMenu.findElement(By.xpath(".//*[contains(text(),'"+menuItem+"')]")).click();

        Thread.sleep(3000);

        for (String winHandle : BaseSteps.getDriver().getWindowHandles()) {
            if (!parentWindow.equals(winHandle)) {
                BaseSteps.getDriver().switchTo().window(winHandle);
                Thread.sleep(3000);
                break;
            }
        }
        System.out.println("Переключаемся в новое окно: " + BaseSteps.getDriver().getTitle());


    }
}





