package Wrapperclass;

public class AllWrapperClass {
    public static void main(String[] args) {
        int num = 10;
        Integer num1 = new Integer(30); // Boxing
        Integer num2 = 20; // AutoBoxing
        Integer num3 = num; // AutoBoxing
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        int num4 = num3.intValue(); // Unboxing
        int num5 = num3; // Auto-Unboxing
        System.out.println(num4);
        System.out.println(num5);

        String str = "15"; // Converting str data which has a number into int
        int data = Integer.parseInt(str);
        System.out.println(data * 2);

    }
}
