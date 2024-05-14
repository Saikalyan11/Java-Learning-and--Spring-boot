package Lambda;

@FunctionalInterface
interface B {
    void show(int i);
}

public class withvariable {
    public static void main(String[] args) {
        B obj = i -> System.out.println("in show" + i);
        obj.show(5);
    }
}
