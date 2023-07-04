package Inheritance;

class Calc {
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int sub(int n1, int n2) {
        return n1 - n2;
    }
}

class AdvCalc extends Calc {
    public int multi(int n1, int n2) {
        return n1 * n2;
    }

    public int division(int n1, int n2) {
        return n1 / n2;
    }
}

public class Maincal {
    public static void main(String[] args) {
        AdvCalc cal = new AdvCalc();
        int res = cal.add(4, 5);
        int res1 = cal.division(20, 5);
        int res2 = cal.multi(3, 2);
        int res3 = cal.sub(10, 30);
        System.out.println(res);
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }
}
