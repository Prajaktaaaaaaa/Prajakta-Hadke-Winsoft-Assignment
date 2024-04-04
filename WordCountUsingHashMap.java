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




euuU1

EUUU2:

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
            // Convert word to lowercase to treat uppercase and lowercase words as same
            word = word.toLowerCase();
            // Update word count in the map
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        // Display word count in the string
        System.out.println("Word count in the string:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}

*************************************
Q3 


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


***************************************

Q1

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] X = {0, 2, 0, 3, 0, 5, 6, 0, 0};
        int[] Y = {1, 8, 9, 10, 15};

        mergeArrays(X, Y);

        System.out.println("Merged Array X: " + Arrays.toString(X));
    }

    public static void mergeArrays(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;

        int i = m - n - 1;
        int j = 0;
        int k = 0;

        // Move non-zero elements of X to the end
        while (i >= 0 && X[i] == 0)
            i--;

        // Merge X and Y
        while (i >= 0 && j < n) {
            if (X[i] > Y[j]) {
                X[k++] = Y[j++];
            } else {
                X[k++] = X[i--];
            }
        }

        // If elements in Y[] are remaining, copy them to X[]
        while (j < n) {
            X[k++] = Y[j++];
        }
    }
}



*******************************************
Q4

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


***************************************
Q2

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

public class MaxSumPath {
    private static final Logger logger = Logger.getLogger(MaxSumPath.class.getName());

    public static long maxSumPath(int[] X, int[] Y) {
        if (X == null || Y == null || X.length == 0 || Y.length == 0) {
            logger.log(Level.SEVERE, "Invalid input arrays. Please provide non-null and non-empty arrays.");
            throw new IllegalArgumentException("Both input arrays are empty or null.");
        }

        long sum = 0; 

        int i = 0, j = 0;
        long sumX = 0, sumY = 0; 

        while (i < X.length && j < Y.length) {
            if (X[i] < Y[j]) {
                sumX += X[i];
                i++;
            }
            else if (Y[j] < X[i]) {
                sumY += Y[j];
                j++;
            }
            else {
                sum += Math.max(sumX, sumY) + X[i];
                sumX = 0;
                sumY = 0;
                i++;
                j++;
            }
        }

        while (i < X.length) {
            sumX += X[i];
            i++;
        }

        while (j < Y.length) {
            sumY += Y[j];
            j++;
        }

        sum += Math.max(sumX, sumY);

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the size of array X:");
        int sizeX = scanner.nextInt();
        int[] X = new int[sizeX];
        System.out.println("Enter the elements of array X:");
        for (int i = 0; i < sizeX; i++) {
            X[i] = scanner.nextInt();
        }

        System.out.println("Enter the size of array Y:");
        int sizeY = scanner.nextInt();
        int[] Y = new int[sizeY];
        System.out.println("Enter the elements of array Y:");
        for (int i = 0; i < sizeY; i++) {
            Y[i] = scanner.nextInt();
        }

        try {
            long maxSum = maxSumPath(X, Y);
            System.out.println("Maximum sum path is: " + maxSum);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}




