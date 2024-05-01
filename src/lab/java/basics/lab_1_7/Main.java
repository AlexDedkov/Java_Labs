package lab.java.basics.lab_1_7;

public class Main {
    public static void main(String[] args) {

        Airplane airplane = new Airplane();
        Airplane.Wing wing = new Airplane.Wing(35);
        Airplane.Wing wing2 = new Airplane.Wing(45);
        wing.showWeight();
        wing2.showWeight();

    }
}
