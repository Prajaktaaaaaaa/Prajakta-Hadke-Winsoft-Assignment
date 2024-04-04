import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) {
        String inputString = "This is a sample string with some words. This string will be used to count the number of words.";
        countWords(inputString);
    }

    public static void countWords(String input) {
        if (input == null || input.isEmpty()) {
            System.out.println("Input string is empty.");
            return;
        }

        Map<String, Integer> wordCountMap = new HashMap<>();
        String[] words = input.split("\\s+");

        for (String word : words) {
            
            word = word.toLowerCase();
            
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

     
        System.out.println("Word count in the string:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
