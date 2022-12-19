import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;


public class GithubTest extends TestBase{
    @Test
    void gitHubTest(){

        step("Открываем страницу GitHub", () ->{
            open("https://github.com/");});
        step("Наводим мышку на Enterprise", () ->{
            $("ul.d-lg-flex.list-style-none > li.HeaderMenu-item").sibling(1).hover();});
        step("Нажимаем на Enterprise", () ->{
            $(byLinkText("Enterprise")).click();});
        step("Проверяем текст Build like the best", () ->{
            $(".h1-mktg.mb-3").shouldHave(text("Build like the best"));;});
    }
}
