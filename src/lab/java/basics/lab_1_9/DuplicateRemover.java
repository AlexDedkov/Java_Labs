package lab.java.basics.lab_1_9;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class DuplicateRemover {
    public static <T> Collection<T> removeDuplicates(Collection<T> collection) {

        Set<T> uniqueElements = new HashSet<>(collection);


        return uniqueElements;
    }

    public static void main(String[] args) {

        Set<Integer> numbersWithDuplicates = new HashSet<>();
        numbersWithDuplicates.add(1);
        numbersWithDuplicates.add(2);
        numbersWithDuplicates.add(3);
        numbersWithDuplicates.add(1); // Duplicate
        numbersWithDuplicates.add(4);

        Collection<Integer> uniqueNumbers = removeDuplicates(numbersWithDuplicates);

        System.out.println("Original collection: " + numbersWithDuplicates);
        System.out.println("Collection without duplicates: " + uniqueNumbers);
    }
}