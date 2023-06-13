package ConditionalStatement;

public class elseif {
    public static void main(String[] args) {
        int x = 8;
        int y = 7;
        int z = 9;

        if (x > y && x > z) // If this block is false it goes to else if
            System.out.println(x);
        else if (y > x && y > z) // if this block is also false then i executes else block
            System.out.println(y);
        else
            System.out.println(z);
    }
}
