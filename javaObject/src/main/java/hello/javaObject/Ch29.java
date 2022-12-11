package hello.javaObject;

public class Ch29 {
    public static void main(String[] args) {

    }
}

class TestClass {
    void instanceMethod() {}
    static void staticMethod(){}

    void instanceMethod2() {
        instanceMethod();
        staticMethod();
    }

    static void staticMethod2() {
//        instanceMethod(); // static메서드는 인스턴스 메서드를 호출 할 수 없다.
        staticMethod();
    }
}

class TestClass2 {
    int iv;
    static int cv;

    void instanceMethod() {
        System.out.println(iv);
        System.out.println(cv);
    }

    static void staticMethod() {
//        System.out.println(iv); // static 메서드는 인스턴스 변수를 사용 할 수 없다.
        System.out.println(cv);
    }
}
