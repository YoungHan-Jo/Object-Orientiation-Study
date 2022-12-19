package hello.javaObject;

import java.util.ArrayList;
import java.util.List;

public class Ex7_9 {
    public static void main(String[] args) {
        Buyer2 b = new Buyer2();

        b.buy(new Tv2());
        b.buy(new Computer2());
        b.buy(new Audio2());

        b.summary();
    }
}

class Product2 {
    int price;
    int bonusPoint;

    public Product2(int price) {
        this.price = price;
        this.bonusPoint = (int)(price/10.0);
    }

    public Product2() {
    }
}

class Tv2 extends Product2 {
    public Tv2() {
        super(100);
    }



    @Override
    public String toString() {
        return "Tv";
    }
}

class Computer2 extends Product2 {
    public Computer2() {
        super(200);
    }

    @Override
    public String toString() {
        return "Computer";
    }
}

class Audio2 extends Product2 {
    public Audio2() {
        super(50);
    }

    @Override
    public String toString() {
        return "Audio";
    }
}

class Buyer2 {
    int money = 1000;
    int bonusPoint = 0;
    List<Product2> cart = new ArrayList<>();

    int i = 0;

    void buy(Product2 p) {
        if (money < p.price) {
            System.out.println("잔액이 부족하여 구매할 수 없습니다.");
            return;
        }

        money -= p.price;
        bonusPoint += p.bonusPoint;
        cart.add(p);
        System.out.println(p + "을/를 구입하셨습니다.");
    }

    void summary() {
        int sum = 0;
        String itemList = "";

        for (Product2 p: cart) {
            sum += p.price;
            itemList += p + ", ";
        }

        System.out.println("구입하신 물품 총 금액 : " + sum + "만원");
        System.out.println("구입하신 제품은 : " + itemList + "입니다.");
    }
}
