package lab.java.basics.lab1_2;

public class Fridge {

    private String model;
    private Integer serialNumber;
    private Double weight;
    private String name;


    public String getModel() {

        return model;
    }

    public void setModel(String model) {

        this.model = model;
    }

    public Integer getSerialNumber() {

        return serialNumber;
    }

    public void setSerialNumber(Integer serialNumber) {

        this.serialNumber = serialNumber;
    }

    public Double getWeight() {

        return weight;
    }

    public void setWeight(Double weight) {

        this.weight = weight;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }


    public Fridge() {
    }

    public Fridge(String model, Integer serialNumber, Double weight, String name) {
        this.model = model;
        this.serialNumber = serialNumber;
        this.weight = weight;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Fridge{" +
                "model='" + model + '\'' +
                ", serialNumber=" + serialNumber +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }

}
