package pl.siftsystem.project.task1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class SaveWordsMapToFileWriter {
    public static void saveWordCountToTextFile(Map<String, Integer> wordCountMap, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
                String line = entry.getKey() + " --> " + entry.getValue();
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
