package yandex.steps;

import ru.yandex.qatools.allure.annotations.Step;
import yandex.pages.MainPage;
import yandex.pages.YandexMarketPage;

public class YandexMarketSteps {

    @Step("выбран пункт меню {0}")
    public void selectMenuItem(String menuItem){
        new YandexMarketPage().selectYandexMarketMenu(menuItem);
    }

    @Step("выбрана категория продукта {0}")
    public void selectProduct(String menuItem){
        new YandexMarketPage().selectProductMenu(menuItem);
    }

    @Step("переходим в расширенный поиск")
    public void allFilters(){
        new YandexMarketPage().switchToAllFilters();
    }

    @Step("переходим в расширенный поиск")
    public void goToFilters(){
        new YandexMarketPage().switchToAllFilters();
    }
}
