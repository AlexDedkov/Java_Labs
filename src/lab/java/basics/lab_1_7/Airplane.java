package lab.java.basics.lab_1_7;

public class Airplane {
    static class Wing {
        int weight;

        public Wing(int weight) {
            this.weight = weight;
        }

        public void showWeight() {
            System.out.println(this.weight);
        }
    }
}
