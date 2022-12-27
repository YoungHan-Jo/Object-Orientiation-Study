package hello.javaObject;

public class Ex8_9 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void method1() throws Exception {
        method2();
    }

    private static void method2() throws Exception {
        throw new Exception();
    }
}
