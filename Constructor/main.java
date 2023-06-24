package Constructor;

public class main {
    public static void main(String[] args) {
        constructor cons = new constructor();
        System.out.println("The default Constructor " + "'" + cons.toString() + "'");
        constructor conswithparameters = new constructor("Sai Kalyan",
                132, "ECE",
                "Computer Science");
        System.out.println("The Parameterized Constructor " + "'" + conswithparameters.toString() + "'");
    }
}
