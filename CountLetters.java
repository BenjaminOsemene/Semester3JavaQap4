// This program has been modified to handle phrase with non-letter characters  
import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        int[] counts = new int[26];
        Scanner scan = new Scanner(System.in);

        // Then prompts the user to enter a phrase 
        System.out.print("Enter a phrase (letters, spaces, and punctuation are allowed): ");
        String phrase = scan.nextLine();

        // Convert to all upper case
        phrase = phrase.toUpperCase();

        // Count frequency of each letter in string using a try-catch block
        for (int i = 0; i < phrase.length(); i++) {
            try {
                // Try counting the character and leaving catch block empty to ignore non-letter characters
                counts[phrase.charAt(i) - 'A']++;
            } catch (ArrayIndexOutOfBoundsException e) {
                // Then printing a message for non-letter characters
                System.out.println("Not a letter: " + phrase.charAt(i));
            }
        }

        // Also printing the letter frequencies
        System.out.println("\nLetter frequencies:");
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] != 0) {
                System.out.println((char)(i + 'A') + ": " + counts[i]);
            }
        }
    }
}