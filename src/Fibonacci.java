import java.util.Scanner;

/**
 * Created by m7_berzin_n on 11/10/2017.
 */
public class Fibonacci {
    public static void main(String args[]) {

        int n = 0;
        Scanner input = new Scanner(System.in);
        while (n < 2 || n > 49) {
            System.out.print("Please enter an integer: ");
            n = input.nextInt();
        }

        int[] fibonacci = new int[n];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
        }

    }
}
