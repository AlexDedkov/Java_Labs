package lab.java.basics.lab_1_6;

public class Client extends Human {
    public String bankName;

    @Override
    public void printInfo() {
        System.out.println("Client Information:");
        System.out.println("Name: " + getName());
        System.out.println("Surname: " + getSurname());
        System.out.println("Bank Name: " + bankName);
    }

    public Client(String name, String surname, String bankName) {
        this.name = name;
        this.surname = surname;
        this.bankName = bankName;
    }

}
