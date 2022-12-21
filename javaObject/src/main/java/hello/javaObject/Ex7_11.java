package hello.javaObject;

public class Ex7_11 {
    public static void main(String[] args) {
        Child3 c = new Child3();
        c.method1();
        c.method2();
        MyInterface.staticMethod();
        MyInterface2.staticMethod();
    }
}

class Child3 extends Parent3 implements MyInterface, MyInterface2 {

    @Override
    public void method1() {
        System.out.println("Child3.method1 오버라이딩");
    }
}

class Parent3 {
    public void method2() {
        System.out.println("Parent3.method2");
    }
}

interface MyInterface {
    default void method1() {
        System.out.println("MyInterface.method1");
    }
    default void method2() {
        System.out.println("MyInterface.method2");
    }

    static void staticMethod() {
        System.out.println("MyInterface.staticMethod");
    }
}

interface MyInterface2 {
    default void method1() {
        System.out.println("MyInterface2.method1");
    }

    static void staticMethod() {
        System.out.println("MyInterface2.staticMethod");
    }
}
