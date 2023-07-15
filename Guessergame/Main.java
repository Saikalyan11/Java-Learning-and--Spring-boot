package Guessergame;

import Guessergame.Umpire.Umpire;

public class Main {
    public static void main(String[] args) {
        Umpire um = new Umpire();
        um.collectNumFromGuesser();
        um.collectNumFromPlayers();
        um.compare();
    }
}
