package main.java.lab7;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class task12 {

    public static void main(String[] args) throws IOException {
        TextFileProcessor textFileProcessor = new TextFileProcessor();
        Path directory = Paths.get("D:\\прога\\Java1-main\\src");
        Files.walkFileTree(directory,textFileProcessor);
        System.out.println("Всего слов: " + textFileProcessor.getTotalWordsCount());
    }

}

