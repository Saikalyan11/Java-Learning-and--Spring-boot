public class Bitwiseoperator {

    public static void main(String[] args) {

        // bitwise OR (|)
        int a = 5;
        int b = 7;
        int ORresult = (a | b);

        System.out.println(ORresult);

        // Bitwise AND(&)
        int ANDresult1 = (a & b);
        System.out.println(ANDresult1);

        // Bitwise XOR(~)
        int XORresult = (a ^ b);
        System.out.println(XORresult);

        // Bitwise complement(~)
        int complementresult = ~a;
        System.out.println(complementresult);
    }

}
