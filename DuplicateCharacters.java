import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String inputString = "programming";

        findDuplicateCharacters(inputString);
    }

    public static void findDuplicateCharacters(String str) {
        // Create a HashMap to store character frequencies
        Map<Character, Integer> charFrequencyMap = new HashMap<>();

        // Convert the string to character array
        char[] charArray = str.toCharArray();

        // Iterate through the character array and update character frequencies
        for (char ch : charArray) {
            // Update the frequency of the character in the map
            charFrequencyMap.put(ch, charFrequencyMap.getOrDefault(ch, 0) + 1);
        }

        // Print characters with frequency greater than 1
        System.out.println("Duplicate characters in the string:");
        for (Map.Entry<Character, Integer> entry : charFrequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }
    }
}