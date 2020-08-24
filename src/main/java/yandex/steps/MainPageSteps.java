package yandex.steps;

import ru.yandex.qatools.allure.annotations.Step;
import yandex.pages.MainPage;

public class MainPageSteps {

    @Step("выбран пункт меню {0}")
    public void selectMenuItem(String menuItem) throws InterruptedException {
        new MainPage().selectMainMenu(menuItem);
    }
}
