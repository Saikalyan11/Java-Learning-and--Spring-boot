package Experiments;

public class StringBufferexp {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" String");
        System.out.println(sb);
        sb.delete(1, 2);
        System.out.println(sb);
        sb.replace(1, 3, "Hero");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}
