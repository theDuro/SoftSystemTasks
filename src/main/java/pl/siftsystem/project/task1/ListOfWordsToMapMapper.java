package pl.siftsystem.project.task1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListOfWordsToMapMapper {
    public static Map<String, Integer> countWords(List<String> words) {
        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {
            String lowercaseWord = word.toLowerCase();
            wordCountMap.put(lowercaseWord, wordCountMap.getOrDefault(lowercaseWord, 0) + 1);
        }
        return wordCountMap;
    }
}
