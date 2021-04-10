package test;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static utils.Files.readTextFromPath;

public class CsvTest {

    @Test
    void csvTest() throws IOException {
        String csvFilePath = "./src/test/resources/files/1.csv";
        String expectedData = "Hello, World!";
        String actualData = readTextFromPath(csvFilePath);
        assertThat(actualData, containsString(expectedData));
    }
}
