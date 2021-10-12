package linter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        String path = "./src/main/resources/gates.js";
        System.out.println(linter(path));
    }
    public static ArrayList<String> linter(String filePath) {
        ArrayList<String> finalLines = new ArrayList<>();
        Path path = Paths.get(filePath);

        try {
            List<String> fileLines = Files.readAllLines(path);
            int lineNumber = 1;
            for(String line : fileLines) {
                if (!line.endsWith(";") && !line.endsWith("}") && !line.endsWith("{")
                        && !line.contains("else") && !line.contains("if") && !line.equals("")){
                    String printLine = "Line " + lineNumber + " : Missing semicolon.";
                    finalLines.add(printLine);
                }
                lineNumber++;
            }
        } catch (IOException exception){
            System.out.println("An error occurred while reading from file");
        }
        return finalLines;
    }
}