import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String inputString = "programming";

        findDuplicateCharacters(inputString);
    }

    public static void findDuplicateCharacters(String str) {
       
        Map<Character, Integer> charFrequencyMap = new HashMap<>();

        
        char[] charArray = str.toCharArray();

        
        for (char ch : charArray) {
            
            charFrequencyMap.put(ch, charFrequencyMap.getOrDefault(ch, 0) + 1);
        }

       
        System.out.println("Duplicate characters in the string:");
        for (Map.Entry<Character, Integer> entry : charFrequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }
    }
}
