package Myexperiments;

import java.util.*;

public class vowels {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String sentence = sc.next();
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == 'a' ||
                    sentence.charAt(i) == 'e' ||
                    sentence.charAt(i) == 'i' ||
                    sentence.charAt(i) == 'o' ||
                    sentence.charAt(i) == 'u') {
                count++;

            }

        }
        System.out.println("Vowel count = " + count);

    }
}
