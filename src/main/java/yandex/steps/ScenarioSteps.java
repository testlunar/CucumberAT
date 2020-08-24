package yandex.steps;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.sql.SQLOutput;

public class ScenarioSteps {
    MainPageSteps mainPageSteps = new MainPageSteps();
    YandexMarketSteps yandexMarketSteps = new YandexMarketSteps();
    FilterSteps filterSteps= new FilterSteps();
    public String el1;
    public String el2;

    @When("^выбран пункт меню \"(.+)\"$")
    public void selectMenuItem(String menuName) throws InterruptedException {
        mainPageSteps.selectMenuItem(menuName);
    }

    @When("^выбран пункт подменю  \"(.+)\"$")
    public void selectSubMenuItem(String menuName) {
        yandexMarketSteps.selectMenuItem(menuName);
    }

    @When("^выбрана категория продукта \"(.+)\"$")
    public void selectProduct(String menuName) {
        yandexMarketSteps.selectProduct(menuName);
    }

    @Then("^переходим в расширенный поиск$")
    public void allFilters() {
        yandexMarketSteps.allFilters();
    }

    @When("^заполняем минимальную цену \"(.+)\"$")
    public void inputPrice(String price) {
         filterSteps.inputPrice(price);
    }

    @When("^выбираем бренд продукта  \"(.+)\"$")
    public void selectBrand(String brand) {
           filterSteps.selectBrand(brand);
    }

    @Then("^нажимаем кнопку Показать результаты$")
    public void showResult() {
        filterSteps.result();
    }

    @Then("^проверяем количество элементов на странице\"(.+)\"$")
    public void checkElements(String num) {
        filterSteps.checkNumberElements(Integer.parseInt(num));
    }

    @When("^запомнить первый элемент в списке$")
    public void getFirstElement1() {
         el1 = filterSteps.getFirstElement();
        System.out.println("Первый элемент " +el1);
    }

    @When("^в поисковую строку вводим запомненное значение$")
    public void searchElementName() {
         filterSteps.searchElementName();
    }

    @When("^запомнить первый элемент в списке на новой странице поиска$")
    public void getFirstElement2()  {
         el2 = filterSteps.getSecondElement();
        System.out.println("Второй элемент " +el2);
    }


    @Then("^проверяем, что наименование товара соответствует запомненному значению$")
    public void compareElements() {
        filterSteps.compareElements(el1,el2);
    }


}