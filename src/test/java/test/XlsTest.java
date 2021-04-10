package test;

import com.codeborne.xlstest.XLS;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static utils.Files.getXls;

public class XlsTest {
    @Test
    void xlsSimpleTest() {
        String xlsFilePath = "./src/test/resources/files/1.xls";
        String expectedData = "or";
        XLS xls = getXls(xlsFilePath);
        assertThat(xls, XLS.containsText(expectedData));
    }
    @Test
    void xlsCellTest() {
        String xlsFilePath = "./src/test/resources/files/1.xls";
        String expectedData = "Shakespeare";
        XLS xls = getXls(xlsFilePath);
        String actualData = xls.excel.getSheetAt(0).getRow(1).getCell(2).toString();
        assertThat(actualData, containsString(expectedData));
    }
}
