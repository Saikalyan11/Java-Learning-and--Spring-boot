package Guessergame.Player;

import java.util.Scanner;

public class Player {
    int playerGuess;

    public int guessTheNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the players values");
        playerGuess = sc.nextInt();
        return playerGuess;
    }
}
