package Myexperiments;

public class vowels {
    public static void main(String[] args) {
        String sentence = "How you doing my dear love";
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == 'a' || sentence.charAt(i) == 'e'
                    || sentence.charAt(i) == 'i' || sentence.charAt(i) == 'o'
                    || sentence.charAt(i) == 'u') {
                System.out.print(" " + sentence.charAt(i) + " ");
            }
        }

    }
}
