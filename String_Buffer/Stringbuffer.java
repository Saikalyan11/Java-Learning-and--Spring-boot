package String_Buffer;

public class Stringbuffer {
    public static void main(String[] args) {
        StringBuffer string = new StringBuffer();

        // ensure capacity
        string.ensureCapacity(100);
        System.out.println(string.capacity());

        // cannot assign String buffer to normal string
        String str = string.toString();

        // appends
        System.out.println("Before specifying the word " + string.capacity()); // by default 16
        string.append("Hello");
        System.out.println("After Specifying the 1st word " + string.capacity()); // now 16
        string.append("Jacob");
        System.out.println("After Specifying the 2nd word " + string.capacity()); // now 16

        // Delete from-to
        System.out.println("only deletes one character " + string.deleteCharAt(7)); // only deletes one character
        System.out.println("Deletes from 0 to 5 character " + string.delete(0, 6)); // oly deletes from 1 to 5

        // length of String buffer
        System.out.println("length of the String " + string.length());

        // Inserting data
        System.out.println("// Inserting data " + string.insert(0, "Hello "));

        // Reverse the Stringbuffer
        System.out.println("Reverse String buffer " + string.reverse());
    }
}
