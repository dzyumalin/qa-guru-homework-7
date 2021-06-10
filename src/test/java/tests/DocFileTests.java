package tests;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static tests.TestData.MAIN_DATA;
import static utils.Files.*;


public class DocFileTests {

    @Test
    void checkDocFile() throws IOException {
        String path = "./src/test/resources/files/1.doc";
        String expectedData = MAIN_DATA;
        String actualData = readDoc(path).getText();
        assertThat(actualData, containsString(expectedData));
    }

    @Test
    void checkDocxFile() throws IOException {
        String path = "./src/test/resources/files/1.docx";
        String expectedData = MAIN_DATA;
        String actualData = readDocx(path).getText();
        assertThat(actualData, containsString(expectedData));
    }

}
