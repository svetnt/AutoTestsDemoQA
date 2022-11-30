import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.$;

public class TestBoxTests {

   @Test
    void fillFormTest(){

        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";

        open("/text-box");

        $("#userName").setValue("Murisa");
        $("#userEmail").setValue("mura@kisa.com");
        $("#currentAddress").setValue("Shilovka");
        $("#permanentAddress").setValue("VMZ");
        $("#submit").click();

        $("#output").shouldBe(Condition.visible);
    }


}
