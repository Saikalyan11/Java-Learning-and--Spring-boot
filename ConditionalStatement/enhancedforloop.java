package ConditionalStatement;

import java.util.*;

public class enhancedforloop {
    public static void main(String[] args) {

        int students[] = new int[8];

        for (int n : students) {
            int result = (int) (n + (Math.random() * 30));
            System.out.println(result);
        }
    }
}
