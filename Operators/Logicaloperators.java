public class Logicaloperators {
    public static void main(String[] args) {
        int a = 40;
        int b = 60;
        int c = 40;

        // AND operator -- the 2nd condition is not evaluated if the 1st one is false
        if ((a < b) && (a == c)) {
            int d = a + b + c;
            System.out.println("And operator output: " + d);
        }

        // OR operator -- the 2nd condition is not evaluated if the 1st one is true
        if ((a < b) || (a == b)) {
            int d = a + b;
            System.out.println("OR operator ouput: " + d);
        }

        // Not operator
        if ((a != b)) {
            System.out.println("A is not equal to b");
        }
    }
}
