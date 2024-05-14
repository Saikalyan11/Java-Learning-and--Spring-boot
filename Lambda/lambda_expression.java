package Lambda;

@FunctionalInterface
interface A {
    void show();
}

public class lambda_expression {
    public static void main(String[] args) {
        A obj = () -> System.out.println("hi this is in show");
        obj.show();
    }
}
