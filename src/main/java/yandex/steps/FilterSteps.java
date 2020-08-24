package yandex.steps;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import ru.yandex.qatools.allure.annotations.Step;
import yandex.pages.FilterPage;

import static org.junit.Assert.assertTrue;

public class FilterSteps {

    public String el1;
    public String el2;

    @Step("поле минимальная цена заполняется значением {1}")
    public void inputPrice(String price){
        new FilterPage().inputPrice(price);
    }

    @Step("выбирается брнед продукта {1}")
    public void selectBrand(String brand){
        new FilterPage().selectBrand(brand);
    }

    @Step("нажать кнопку Показать результаты")
    public void result(){
        new FilterPage().showResult();
    }

    @Step("проверить количество элементов на странице равно {1}")
    public void checkNumberElements(int num){
        new FilterPage().checkNumberElements(num);
    }

    @Step("запомнить первый элемент в списке")
    public String getFirstElement(){
        String el1 = new FilterPage().getFirstElement();
        return el1;
    }

    @Step("в поисковую строку введено запомненное значение")
    public void searchElementName(){
        new FilterPage().searchElementName();
    }

    @Step("запомнить первый элемент в новом поиске")
    public String getSecondElement() {
        String el2 = new FilterPage().getSecondElement();
        return el2;
    }

    @Step("проверяем, что наименование товара соответствует запомненному значению")
        public void compareElements(String el1, String el2){
        new FilterPage().compareElements(el1,el2);
    }

}
