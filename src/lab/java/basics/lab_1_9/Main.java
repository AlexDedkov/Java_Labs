package lab.java.basics.lab_1_9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        addElements(arrayList, 1000000);
        addElements(linkedList, 1000000);


        selectRandomElements(arrayList, 100000); //Очень быстро
        selectRandomElements(linkedList, 100000); //Долго, около 30 секунд,LinkedList имеет другую структуру
    }

    public static void addElements(List<Integer> list, int count) {
        for (int i = 0; i < count; i++) {
            list.add(i);
        }
    }

    public static void selectRandomElements(List<Integer> list, int times) {
        Random random = new Random();
        int size = list.size();

        for (int i = 0; i < times; i++) {
            int randomIndex = random.nextInt(size);
            int randomElement = list.get(randomIndex);
        }
    }
}