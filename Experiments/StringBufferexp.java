package Experiments;

public class StringBufferexp {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        // adding an another string to the Stringbuffer
        sb.append(" String");
        System.out.println(sb);
        // Deleting the characters by using the start and end index numbers
        sb.delete(1, 2);
        System.out.println(sb);
        // Replacing the characters by using the start and end index numbers
        sb.replace(1, 3, "Hero");
        System.out.println(sb);
        // Reversing the total StringBuffer
        sb.reverse();
        System.out.println(sb);
        // To check the capacity of a StringBuffer
        int res = sb.capacity();
        System.out.println(res);
    }
}
