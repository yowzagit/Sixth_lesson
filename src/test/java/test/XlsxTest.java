package test;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;
import static utils.Files.readXlsxFromPath;

public class XlsxTest {
    @Test
    void xlsxTest() {
        String xlsxFilePath = "./src/test/resources/files/1.xlsx";
        String expectedData = "Shakespeare";
        String actualData = readXlsxFromPath(xlsxFilePath);
        assertThat(actualData, containsString(expectedData));
    }
}
