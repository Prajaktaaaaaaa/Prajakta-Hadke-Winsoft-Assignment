import java.util.HashMap;
import java.util.Scanner;

public class WordCountUsingHashMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        int wordCount = countWords(input);
        System.out.println("Number of unique words: " + wordCount);

        scanner.close();
    }

    private static int countWords(String input) {
        HashMap<String, Integer> wordCountMap = new HashMap<>();

        // Split the input string into words
        String[] words = input.split("\\s+");

        // Count the occurrences of each word
        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        // Return the size of the word count map
        return wordCountMap.size();
    }
}
