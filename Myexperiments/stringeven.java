package Myexperiments;

public class stringeven {
    public static void main(String[] args) {
        String str = "Hello Hi there! wish your doing well";
        for (String s : str.split(" "))
            if (s.length() % 2 == 0)
                System.out.println(s);
    }
}
