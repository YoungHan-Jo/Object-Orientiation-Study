package hello.javaObject;

public class Ex7_8 {
    public static void main(String[] args) {

        Buyer b = new Buyer();
        b.buy(new Tv1(100));
        b.buy(new Computer(200));

        System.out.println("b = " + b);


    }
}

class Product {
    int price;
    int bonusPoint;

    public Product(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }
}

class Tv1 extends Product {
    public Tv1(int price) {
        super(price);
    }

    @Override
    public String toString() {
        return "Tv";
    }
}

class Computer extends Product {
    public Computer(int price) {
        super(price);
    }

    @Override
    public String toString() {
        return "Computer";
    }
}

class Buyer {
    int money = 1000;
    int bonusPoint = 0;

    public void buy(Product p) {
        if (money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다");
            return;
        }

        money -= p.price;
        bonusPoint += p.bonusPoint;
        System.out.println(p + "을/를 구입하셨습니다.");
    }

    @Override
    public String toString() {
        return "{" +
                "money=" + money +
                ", bonusPoint=" + bonusPoint +
                '}';
    }
}


