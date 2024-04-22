package lab.java.basics.lab_1_6;

//1.5

class DescendantAge extends MainAge {

    @Override
    public String getStuff() {
        System.out.println("OVERRIDEN: Enter your username");
        String age = newscanner.nextLine();
        return age;
    }
}