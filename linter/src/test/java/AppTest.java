import linter.App;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {


        @Test
        public void testEmpty(){
            String testPath = "./src/test/resources/empty.js";
            ArrayList<String> outList = new ArrayList<>();
            assertEquals( outList , App.linter(testPath));
        }

        @Test public void testFewError(){
            String testPath = "./src/test/resources/few errors.js";
            ArrayList<String> outList = new ArrayList<>();
            outList.add("Line 3 : Missing semicolon.");
            outList.add("Line 6 : Missing semicolon.");
            outList.add("Line 15 : Missing semicolon.");
            outList.add("Line 17 : Missing semicolon.");
            assertEquals( outList ,App.linter(testPath));
        }

        @Test public void testManyError(){
            String testPath = "./src/test/resources/many errors.js";
            ArrayList<String> outList = new ArrayList<>();
            outList.add("Line 3 : Missing semicolon.");
            outList.add("Line 11 : Missing semicolon.");
            outList.add("Line 13 : Missing semicolon.");
            outList.add("Line 15 : Missing semicolon.");
            outList.add("Line 20 : Missing semicolon.");
            outList.add("Line 26 : Missing semicolon.");
            outList.add("Line 28 : Missing semicolon.");
            outList.add("Line 32 : Missing semicolon.");
            outList.add("Line 36 : Missing semicolon.");
            outList.add("Line 40 : Missing semicolon.");
            outList.add("Line 41 : Missing semicolon.");
            outList.add("Line 50 : Missing semicolon.");
            assertEquals( outList ,App.linter(testPath));
        }

        @Test public void testNoError(){
            String testPath = "./src/test/resources/no errors.js";
            ArrayList<String> outList = new ArrayList<>();
            assertEquals( outList , App.linter(testPath));
        }

        @Test public void testOneError(){
            String testPath = "./src/test/resources/one error.js";
            ArrayList<String> outList = new ArrayList<>();
            outList.add("Line 1 : Missing semicolon.");
            assertEquals( outList , App.linter(testPath));
        }


}
