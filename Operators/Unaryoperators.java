package Operators;

public class Unaryoperators {

    public static void main(String[] args) {
        // unary minus operator(-)
        int a = 100;
        System.out.println("Value of a = " + a);

        a = -a;
        System.out.println("Value of a after using unary operator = " + a);

        // Increment operator
        int n1 = 100;
        System.out.println("value of n1 = " + n1);

        ++n1; // pre increment
        System.out.println("pre increment " + n1);

        n1++; // post increment
        System.out.println("post increment " + n1);

        // decrement operator
        int b1 = 100;
        System.out.println("value of n1 = " + b1);

        --b1; // pre increment
        System.out.println("pre decrement " + b1);

        b1--; // post increment
        System.out.println("post decrement " + b1);

        // Not operator
        System.out.println("Not operator when !(a < b1) = " + !(a < b1));
        System.out.println("Not operator when !(b1 < a) = " + !(b1 < a));

        // bitwish complement
        int b = -20;
        System.out.println("Bitwise complement of b is " + ~b);

    }

}
