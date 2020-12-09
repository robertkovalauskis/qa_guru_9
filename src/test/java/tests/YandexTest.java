package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class YandexTest extends TestBase {


    @Test
    void yandexTest() {

        step("Open Yandex page", () -> {
            open("https://yandex.ru/");
        });
        step("Enter the query", () -> {
            $("#text").val("Selenium").pressEnter();
        });
        step("Assert the search result", () -> {
            $("body").shouldHave(text("selenium.dev"));
        });


    }

}
