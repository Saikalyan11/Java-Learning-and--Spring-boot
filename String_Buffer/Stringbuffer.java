package String_Buffer;

public class Stringbuffer {
    public static void main(String[] args) {
        StringBuffer string = new StringBuffer();
        System.out.println("Before specifying the word " + string.capacity()); // by default 16
        string.append("Hello");
        System.out.println("After Specifying the 1st word " + string.capacity()); // now 16
        string.append("Jacob");
        System.out.println("After Specifying the 2nd word " + string.capacity()); // now 16
        string.append("Jacob");
        System.out.println("After Specifying the 2nd word " + string.capacity()); // now 16

        System.out.println("only deletes one character " + string.deleteCharAt(7)); // only deletes one character
        System.out.println("Deletes from 0 to 5 character " + string.delete(0, 6)); // oly deletes from 1 to 5
    }
}
