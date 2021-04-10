//package test;
//
//import org.junit.jupiter.api.Disabled;
//import org.junit.jupiter.api.Test;
//import java.io.IOException;
//
//
//import static org.hamcrest.CoreMatchers.containsString;
//import static org.hamcrest.MatcherAssert.assertThat;
//import static utils.Files.getDoc;
//
//public class DocTest {
//    @Test
//    void docTest() throws IOException {
//        String
//                docFilePath = "./src/test/resources/files/1.doc",
//                expectedData = "Hello my dear friend",
//                actualData = getDoc(docFilePath);
//        assertThat(actualData, containsString(expectedData));
//
//    }
//}