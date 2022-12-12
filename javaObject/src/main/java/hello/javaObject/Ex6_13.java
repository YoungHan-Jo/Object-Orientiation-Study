package hello.javaObject;

public class Ex6_13 {
    public static void main(String[] args) {

        Car2 c1 = new Car2();
        Car2 c2 = new Car2("blue");

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);

    }
}

class Car2 {
    String color;
    String gearType;
    int door;

    public Car2() {
        this("white", "auto", 4);
    }

    public Car2(String color) {
        this(color, "auto", 4);
    }

    public Car2(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }

    @Override
    public String toString() {
        return "{" +
                "color='" + color + '\'' +
                ", gearType='" + gearType + '\'' +
                ", door=" + door +
                '}';
    }
}
