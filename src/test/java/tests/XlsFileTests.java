package tests;

import com.codeborne.xlstest.XLS;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static tests.TestData.MAIN_DATA;
import static utils.Files.*;

public class XlsFileTests {

    @Test
    void checkXlsTest() throws IOException {
        String xlsFilePath = "./src/test/resources/files/1.xls";
        String expectedData = MAIN_DATA;

        XLS xls = readXls(xlsFilePath);
        assertThat(xls, XLS.containsText(expectedData));
    }

    @Test
    void checkCellTest() throws IOException {
        String xlsFilePath = "./src/test/resources/files/1.xls";
        String expectedData = MAIN_DATA;

        XLS xls = readXls(xlsFilePath);
        String actualData = xls.excel.getSheetAt(1).getRow(1).getCell(1).toString();
        assertThat(actualData, containsString(expectedData));
    }

    @Test
    void xlsxTest() {
        String xlsFilePath = "./src/test/resources/files/1.xlsx";
        String expectedData = MAIN_DATA;

        String actualData = readXlsxFromPath(xlsFilePath);
        assertThat(actualData, containsString(expectedData));
    }

}
