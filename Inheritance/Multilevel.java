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

class VeryAdv extends AdvCalc {
    public int power(int n1, int n2) {
        return (int) Math.pow(n1, n2);
    }
}

public class Multilevel {
    public static void main(String[] a) {
        VeryAdv cal = new VeryAdv();
        int respower = cal.power(2, 10);
        int res = cal.add(4, 5);
        int res1 = cal.division(20, 5);
        int res2 = cal.multi(3, 2);
        int res3 = cal.sub(10, 30);
        System.out.println(res);
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(respower);
    }
}
