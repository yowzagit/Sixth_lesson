import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DownloadFileTests {
    @Test
    void selenideDownloadReadMeTest() throws FileNotFoundException {
        open("https://github.com/selenide/selenide/blob/master/README.md");
        $("raw-url").download();
    }
}
