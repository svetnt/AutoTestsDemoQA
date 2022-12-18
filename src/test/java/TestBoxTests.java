import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.$;

public class TestBoxTests {

    @BeforeAll
    static void beforeAll(){

        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
    }

   @Test
    void fillFormTest(){

        open("/text-box");

        $("#userName").setValue("Murisa");
        $("#userEmail").setValue("mura@kisa.com");
        $("#currentAddress").setValue("Shilovka");
        $("#permanentAddress").setValue("VMZ");
        $("#submit").click();

        $("#output").shouldBe(Condition.visible);
        $("#output #name").shouldHave(text("Murisa"));
        $("#output #email ").shouldHave(text("mura@kisa.com"));
    }


}
