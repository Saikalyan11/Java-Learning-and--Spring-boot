package Myexperiments;

class A {
    public A() {
        System.out.println("in A");
    }

    public A(int num) {
        System.out.println("in A int");
    }
}

class B extends A {
    public B() {
        super(5);
        System.out.println("in B");
    }

    public B(int num) {
        this();
        System.out.println("in B int");
    }
}

public class constructorchaining {
    public static void main(String[] args) {
        B obj = new B(5 );
    }
}
