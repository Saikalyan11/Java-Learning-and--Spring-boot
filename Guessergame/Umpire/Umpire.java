package Guessergame.Umpire;

import Guessergame.Guesser;
import Guessergame.Player.Player;

public class Umpire {
    int numberFromGuesser;
    int numberFromPlayer1;
    int numberFromPlayer2;
    int numberFromPlayer3;

    public void collectNumFromGuesser() {
        Guesser g = new Guesser();
        numberFromGuesser = g.guessTheNumber();

    }

    public void collectNumFromPlayers() {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        numberFromPlayer1 = p1.guessTheNumber();
        numberFromPlayer2 = p2.guessTheNumber();
        numberFromPlayer3 = p3.guessTheNumber();

    }

    public void compare() {
        if (numberFromGuesser == numberFromPlayer1) {
            System.out.println("Player 1 won the game");
        } else if (numberFromGuesser == numberFromPlayer2) {
            System.out.println("Player 2 won the game");

        } else if (numberFromGuesser == numberFromPlayer3) {
            System.out.println("Player 3 won the game");
        } else {
            System.out.println("Game lost! Try Again...");
        }
    }
}
