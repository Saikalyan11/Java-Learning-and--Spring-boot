package Experiments;

public class Fibonacci_series {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        int res;
        for (int i = 0; i < 10; i++) {

            res = second + first;
            System.out.println(res);
            first = second;
            second = res;
        }
    }
}
