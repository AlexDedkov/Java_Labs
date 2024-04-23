package lab.java.basics.lab_1_6.ex5;

//1.5

class DescendantAge extends MainAge {

    @Override
    public void getStuff() {
        System.out.println("OVERRIDEN: Enter your username");
        String age = newscanner.nextLine();
        System.out.println("Username: "+ age);
    }
}