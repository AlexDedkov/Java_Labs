package lab.java.basics.lab_1_6;

public class BankWorker extends Human implements BankWorkerInter {
    public String bankName;

    @Override
    public void printInfo() {
        System.out.println("Client Information:");
        System.out.println("Name: " + getName());
        System.out.println("Surname: " + getSurname());
        System.out.println("Bank Name: " + bankName);
    }

    public BankWorker(String name, String surname, String bankName) {
        this.name = name;
        this.surname = surname;
        this.bankName = bankName;

        greet();
    }

    @Override
    public void performDuties() {
        System.out.println("Performing bank worker duties...");

    }

}
