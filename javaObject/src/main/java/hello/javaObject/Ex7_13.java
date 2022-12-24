package hello.javaObject;

public class Ex7_13 {


    class InstanceInner {
    }

    static class StaticInner {
    }


    InstanceInner iv = new InstanceInner();
    static StaticInner cv = new StaticInner();

    static void staticMethod() {
//        InstanceInner iv = new InstanceInner();
        StaticInner cv = new StaticInner();

        Ex7_13 outer = new Ex7_13();
        InstanceInner instanceInner = outer.new InstanceInner();
    }

    void instanceMethod() {
        InstanceInner iv = new InstanceInner();
        StaticInner cv = new StaticInner();
    }

    void myMethod() {
        class LocalInner {
        }
        LocalInner localInner = new LocalInner();
    }


}
