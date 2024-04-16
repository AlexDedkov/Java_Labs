package lab.java.basics.lab1_3;

public class JavaProgram {
    public static void main(String[] args) {
        //1
        Study java = new Study("Изучение Java - это просто!");
        System.out.println(java.printCourse());

        //2
        Car hyundai = new Car("Red");
        Car audi = new Car("Yellow",400);
        System.out.println(hyundai.toString());
        System.out.println(audi.toString());

        //3
        House oldHouse = new House();
        oldHouse.setYear(1994);
        oldHouse.setName("Old House");
        oldHouse.setFloors(4);
        System.out.println(oldHouse.toString());
        House modernHouse = new House();
        modernHouse.setFloors(12);
        modernHouse.setName("Modern house");
        modernHouse.setYear(2012);
        System.out.println(modernHouse.toString());

        //4
        Tree dead = new Tree(30,false, "Dead tree");
        Tree living = new Tree(35,"Living Tree");
        Tree notExistent = new Tree();

    }
}
