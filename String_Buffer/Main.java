package String_Buffer;

public class Main {
    public static void main(String[] args) {
        // Actual Type of writing because String is a class

        String sb = new String("kelvin");

        // To make it simpler

        // String sb = "Kelvin";

        System.out.println(sb);

        // To concat with the String
        String sbcon = sb.concat(" jacob");
        System.out.println(sbcon);

        // To get that particular character using index values we use charAt method
        // which is created in String class
        System.out.println(sb.charAt(3));
    }
}
