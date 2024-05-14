package Guessergame;

import java.util.Scanner;

public class Guesser {
    int guessingNumber;

    public int guessTheNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Gusser kindly guess the number");
        guessingNumber = sc.nextInt();
        return guessingNumber;
    }
}
