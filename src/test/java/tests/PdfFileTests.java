package tests;

import com.codeborne.pdftest.PDF;
import org.junit.jupiter.api.Test;
import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static utils.Files.*;

public class PdfFileTests {

    @Test
    void checkPdfTest() throws IOException {
        String pdfFilePath = "./src/test/resources/files/1.pdf";
        String expectedData = "Connect on SoundCloud";

        PDF pdf = readPdf(pdfFilePath);
        assertThat(pdf, PDF.containsText(expectedData));
    }

}
