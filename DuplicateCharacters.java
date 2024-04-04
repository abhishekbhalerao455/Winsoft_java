import java.util.Scanner;

public class DuplicateCharacters {
    public static void findDuplicateCharacters(String str) {
        int count;
        char[] string = str.toCharArray();
        
        System.out.println("Duplicate characters in the given string:");
        for (int i = 0; i < string.length; i++) {
            count = 1;
            for (int j = i + 1; j < string.length; j++) {
                if (string[i] == string[j] && string[i] != ' ') {
                    count++;
                    // Set string[j] to 0 to avoid printing visited character
                    string[j] = '0';
                }
            }
            // A character is considered as duplicate if count is greater than 1
            if (count > 1 && string[i] != '0') {
                System.out.println(string[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        findDuplicateCharacters(inputString);
        
        scanner.close();
    }
}
