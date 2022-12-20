package hello.javaObject;

import java.util.ArrayList;
import java.util.List;

public class Ex7_10 {
    public static void main(String[] args) {
        List<Unit> group = new ArrayList<>();
        group.add(new Marine());
        group.add(new Tank());
        group.add(new DropShip());

        for (Unit unit : group) {
            unit.move(100,200);
        }
    }
}

abstract class Unit {
    int x, y;

    abstract void move(int x, int y);

    void stop() {
        System.out.println("현 위치에 정지");
    }
}

class Marine extends Unit {
    @Override
    void move(int x, int y) {
        System.out.println("마린 이동 " + x + ","+ y);
    }
    void steamPack() {
        System.out.println("스팀팩 사용");
    }
}

class Tank extends Unit {
    @Override
    void move(int x, int y) {
        System.out.println("탱크 이동 " + x + ","+ y);
    }
    void changeMode() {
        System.out.println("모드 변경");
    }
}

class DropShip extends Unit {

    @Override
    void move(int x, int y) {
        System.out.println("드랍십 이동 " + x + ","+ y);
    }

    void load() {
        System.out.println("대상을 태운다");
    }
    void unload() {
        System.out.println("대상을 내린다");
    }
}
