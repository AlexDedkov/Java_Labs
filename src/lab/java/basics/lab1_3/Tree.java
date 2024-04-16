package lab.java.basics.lab1_3;

public class Tree {
    Integer age;
    Boolean alive;
    String name;

    public Tree(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public Tree(Integer age, Boolean alive, String name) {
        this.age = age;
        this.alive = alive;
        this.name = name;
    }

    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }
}
