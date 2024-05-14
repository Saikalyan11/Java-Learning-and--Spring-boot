package Myexperiments;

class factorial {
    int fact;

    public int factorialnumber(int num) {

        for (int i = 0; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }
}

public class Fact {
    public static void main(String[] args) {
        factorial obj = new factorial();
        int result = obj.factorialnumber(5);
        System.out.println(result);
    }
}
