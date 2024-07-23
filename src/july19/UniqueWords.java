package july19;

import java.util.HashSet;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

//"The quick brown fox jumps over the lazy dog"

public class UniqueWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        String[] words = sentence.split("\\s+");
        HashSet<String> uniqueWords = new HashSet<>();
        for (String word : words) {
            uniqueWords.add(word.toLowerCase());
        }
        ArrayList<String> sortedWords = new ArrayList<>(uniqueWords);
        Collections.sort(sortedWords);
        System.out.println(sortedWords);
    }
}
