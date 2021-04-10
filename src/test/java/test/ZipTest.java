package test;

import net.lingala.zip4j.exception.ZipException;
import org.junit.jupiter.api.Test;
import java.io.IOException;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static utils.Files.readTextFromPath;
import static utils.Zip.unzip;
import static utils.Zip.unzipSimple;

public class ZipTest {
    @Test
    void zipWithPasswordTest() throws IOException, ZipException {
        String zipFilePath = "./src/test/resources/files/2.zip";
        String unzipFolderPath = "./src/test/resources/files/unzip";
        String zipPassword = "321";
        String unzipTxtFilePath = "./src/test/resources/files/unzip/2.txt";
        String expectedData = "ooops, i did it again";

        unzip(zipFilePath, unzipFolderPath, zipPassword);

        String actualData = readTextFromPath(unzipTxtFilePath);
        assertThat(actualData, containsString(expectedData));
    }

    @Test
    void zipTest() throws IOException, ZipException {
        String
                zipFilePath = "./src/test/resources/files/1.zip",
                unzipFolderPath = "./src/test/resources/files/unzip",
                unzipTxtFilePath = "./src/test/resources/files/unzip/1.txt",
                expectedData = "to be or not to be";

        unzipSimple(zipFilePath, unzipFolderPath);

        String actualData = readTextFromPath(unzipTxtFilePath);
        assertThat(actualData, containsString(expectedData));
    }
}
