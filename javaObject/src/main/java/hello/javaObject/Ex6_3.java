package hello.javaObject;

public class Ex6_3 {
    public static void main(String[] args) {
        System.out.println("Card.width = " + Card.width);
        System.out.println("Card.height = " + Card.height);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);

        System.out.println();

        System.out.println("c1의 width 와 height 를 변경");
        c1.width = 50;
        c1.height = 80;

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);

    }
}

class Card {
    String kind;
    int number;
    static int width = 100;
    static int height = 250;

    @Override
    public String toString() {
        return "{" +
                "kind='" + kind + '\'' +
                ", number=" + number + '\'' +
                ", width=" + width + '\'' +
                ", height=" + height +
                '}';
    }
}
