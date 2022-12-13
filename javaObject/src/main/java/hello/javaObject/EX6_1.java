package hello.javaObject;

public class EX6_1 {
    public static void main(String[] args) {
        Tv11 t = new Tv11();
        t.channel = 7;
        t.channelDown();
        System.out.println("현재 채널은 " + t.channel + "입니다.");
    }
}

class Tv11 {
    String color;
    boolean power;
    int channel;

    public void channelDown() {
        --channel;
    }
}