package lab.java.basics.lab_1_9;
import java.util.*;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<User, Integer> userPointsMap = new HashMap<>();


        User alice = new User("Alice");
        User bob = new User("Bob");
        User charlie = new User("Charlie");
        User david = new User("David");
        User alex = new User("Alex");


        userPointsMap.put(alice, 80);
        userPointsMap.put(bob, 70);
        userPointsMap.put(charlie, 90);
        userPointsMap.put(david, 85);
        userPointsMap.put(alex, 100);


        System.out.print("Enter user name: ");
        String inputName = scanner.nextLine();


        User userInput = new User(inputName);
        Integer points = userPointsMap.get(userInput);
        if (points != null) {
            System.out.println(inputName + " has " + points + " points.");
        } else {
            System.out.println("User not found.");
        }

        scanner.close();
    }
}
