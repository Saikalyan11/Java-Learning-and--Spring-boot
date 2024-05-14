package Inheritance;

class A {
    public void show() {
        System.out.println("In A Show");
    }

    public void config() {
        System.out.println("In A config");
    }
}

class B extends A {
    public void show() { // This show() method in class Aoverrides the show() method in class A
        System.out.println("In B Show");
    }
}

public class methodoverriding {
    public static void main(String[] args) {
        B clb = new B();
        clb.show();
        clb.config();
    }
}
