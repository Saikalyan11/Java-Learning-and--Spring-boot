package PatternProgramming;

import java.util.Scanner;

public class zee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // we get perfect output if we use odd numbers like 3,5,7,9,11,13,......
                if (i == 0 || i == n - 1 || i + j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
