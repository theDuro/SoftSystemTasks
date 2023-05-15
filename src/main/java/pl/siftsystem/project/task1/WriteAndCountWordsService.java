package pl.siftsystem.project.task1;

import java.util.List;
import java.util.Map;

public class WriteAndCountWordsService {
    private static final String TEST_FILE_NAME = "test.txt";
    private static final  String RESAULT_FILE_NAME = "result.txt";

    public void saveWordsFRomFileAsCountWoridsINExtFile(){
        List<String> listOfWords = WordFromFileReader.readWordsFromFile(TEST_FILE_NAME);
        Map<String,Integer> countedWords = ListOfWordsToMapMapper.countWords(listOfWords);
        SaveWordsMapToFileWriter.saveWordCountToTextFile(countedWords,RESAULT_FILE_NAME);
    }
}
