package yandex.util;

import gherkin.formatter.model.Result;

    public class AllureReporter extends ru.yandex.qatools.allure.cucumberjvm.AllureReporter {


        @Override

        public void result(Result result) {
            if ("failed".equals(result.getStatus())) System.out.println("Тест упал!");
            super.result(result);
        }




    }


