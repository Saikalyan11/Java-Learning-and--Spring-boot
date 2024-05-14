package methodoverloading;

public class add {
    public int addsum(int a, int b) {
        return a + b;
    }

    public int addsum(int a, int b, int c) {
        return a + b + c;
    }

    public int addsum(int a, int b, int c, int d) {
        return a + b + c;
    }
}
