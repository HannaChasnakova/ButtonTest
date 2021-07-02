import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class FindButton {

    @BeforeTest
    public void baseData() {
        Configuration.baseUrl = "http://uitestingplayground.com";
        Configuration.browser = "chrome";

    }

    @Test
    public void primaryButtonClick() {
        Selenide.open("/classattr");
        $(byXpath("//button[contains(concat(' ', normalize-space(@class), ' '), ' btn-primary ')]")).click();
        Selenide.confirm();


    }


}
