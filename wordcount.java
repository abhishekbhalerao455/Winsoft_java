import java.util.HashMap;
import java.util.Scanner;

public class wordcount {
    static HashMap<String, Integer> countWords(String string) {
        HashMap<String, Integer> wordCount = new HashMap<>();
        String[] words = string.trim().split("\\s+");
        
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        
        return wordCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String string = scanner.nextLine();

        HashMap<String, Integer> wordCount = countWords(string);

        System.out.println("Word count:");
        for (String word : wordCount.keySet()) {
            System.out.println(word + ": " + wordCount.get(word));
        }

        scanner.close();
    }
}
