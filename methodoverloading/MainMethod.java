package methodoverloading;

public class MainMethod {
    public static void main(String[] args) {
        add Add = new add();
        int Result = Add.addsum(19, 4);
        int Result1 = Add.addsum(19, 4, 37);
        int Result2 = Add.addsum(19, 4, 44444, 55555);
        System.out.println(Result);
        System.out.println(Result1);
        System.out.println(Result2);
    }
}
