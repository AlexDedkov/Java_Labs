package lab.java.basics.lab1_3;

public class Car {
    String color;
    String name;
    Integer weight;

    public Car(String color) {
        this.color = color;
    }

    public Car(String color, Integer weight) {
        this.color = color;
        this.weight = weight;
    }

    public Car() {
    }

    @Override
    public String toString() {
        return "Car details: " +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight;
    }
}
