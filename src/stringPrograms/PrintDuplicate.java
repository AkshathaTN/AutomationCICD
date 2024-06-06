package stringPrograms;

import java.util.HashMap;

public class PrintDuplicate {
    public static void printDuplicateCharacters(String str) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Traverse the string and increase the count of each character
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Print the characters with frequency greater than 1
        for (char c : charCountMap.keySet()) {
            if (charCountMap.get(c) > 1) {
                System.out.println(c);
            }
        }
    }

    public static void main(String[] args) {
        String str = "Hello, World!";
        printDuplicateCharacters(str);
    }
}
