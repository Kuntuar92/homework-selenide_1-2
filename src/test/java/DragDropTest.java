import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class DragDropTest extends TestBase{
    @Test
    void dragDropTest(){

        step("Открываем страницу", () ->{
            open("https://the-internet.herokuapp.com/drag_and_drop");});
        step("Перемещаем прямоугольник А на место В", () ->{
            $("#column-a").dragAndDropTo("#column-b");});
        step("Проверяем что прямоугольники действительно поменялись", () ->{
            $("#column-a").shouldHave(text("B"));
            $("#column-b").shouldHave(text("A"));
        });
    }

}
