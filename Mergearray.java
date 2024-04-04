import java.util.Arrays;
import java.util.Scanner;

public class Mergearray {
    private static void merge(int[] X, int[] Y, int m, int n) {
        int k = m + n + 1;
        
        while (m >= 0 && n >= 0) {
            X[k--] = (X[m] > Y[n]) ? X[m--] : Y[n--];
        }
        
        while (n >= 0) {
            X[k--] = Y[n--];
        }
    }

    public static void rearrange(int[] X, int[] Y) {
        int k = 0;
        for (int value : X) {
            if (value != 0) {
                X[k++] = value;
            }
        }
        
        merge(X, Y, k - 1, Y.length - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter elements of array X: ");
        String inputX = scanner.nextLine();
        String[] tokensX = inputX.split("\\s+");
        int[] X = Arrays.stream(tokensX).mapToInt(Integer::parseInt).toArray();
        
        System.out.print("Enter elements of array Y: ");
        String inputY = scanner.nextLine();
        String[] tokensY = inputY.split("\\s+");
        int[] Y = Arrays.stream(tokensY).mapToInt(Integer::parseInt).toArray();
        
        rearrange(X, Y);

        System.out.println(Arrays.toString(X));
        
        scanner.close();
    }
}
