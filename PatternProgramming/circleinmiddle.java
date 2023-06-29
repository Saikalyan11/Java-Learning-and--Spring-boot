package PastternProgramming;

import java.util.Scanner;

public class circleinmiddle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= n - 1; j++) {
                if (j == (n - 1) / 4 && i < n - 1 && i > 0 ||
                        j == (3 * n) / 4 && i < n - 1 && i > 0 ||
                        i == 0 && j > (n - 1) / 4 && j < (3 * n) / 4 ||
                        i == n - 1 && j > (n - 1) / 4 && j < (3 * n) / 4) {

                    System.out.print("*");
                }

                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
