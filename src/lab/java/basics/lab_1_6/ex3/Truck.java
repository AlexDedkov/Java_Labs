package lab.java.basics.lab_1_6.ex3;

//1.3

public class Truck extends Car {
    private int numberOfWheels;
    private int maxWeight;

    public Truck(int weight, String model, char color, float speed, int numberOfWheels, int maxWeight) {
        super(weight, model, color, speed);
        this.numberOfWheels = numberOfWheels;
        this.maxWeight = maxWeight;
    }

    public void newWheels(int newNumberOfWheels) {
        this.numberOfWheels = newNumberOfWheels;
        System.out.println("Количество колес грузовика установлено на: " + numberOfWheels);
    }
}