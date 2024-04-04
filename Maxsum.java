import java.util.Scanner;

public class Maxsum {
    public static int maxSumPath(int[] X, int[] Y) {
        int sumX = 0, sumY = 0, result = 0;
        int i = 0, j = 0;
        int m = X.length, n = Y.length;

        while (i < m && j < n) {
            if (X[i] < Y[j]) {
                sumX += X[i++];
            } else if (X[i] > Y[j]) {
                sumY += Y[j++];
            } else {
                result += Math.max(sumX, sumY) + X[i];
                sumX = 0;
                sumY = 0;
                i++;
                j++;
            }
        }

      
        while (i < m)
            sumX += X[i++];
        while (j < n)
            sumY += Y[j++];

        result += Math.max(sumX, sumY);

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter elements of array X (separated by spaces): ");
        String inputX = scanner.nextLine();
        String[] tokensX = inputX.split("\\s+");
        int[] X = new int[tokensX.length];
        for (int i = 0; i < tokensX.length; i++) {
            X[i] = Integer.parseInt(tokensX[i]);
        }

        System.out.print("Enter elements of array Y (separated by spaces): ");
        String inputY = scanner.nextLine();
        String[] tokensY = inputY.split("\\s+");
        int[] Y = new int[tokensY.length];
        for (int i = 0; i < tokensY.length; i++) {
            Y[i] = Integer.parseInt(tokensY[i]);
        }

        int maxSum = maxSumPath(X, Y);
        System.out.println("The Maximum sum is: " + maxSum);

        scanner.close();
    }
}
