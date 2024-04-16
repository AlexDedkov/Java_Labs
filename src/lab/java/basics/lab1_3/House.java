package lab.java.basics.lab1_3;

import java.time.LocalDate;

public class House {
    Integer year;
    String name;
    Integer floors;

    public void setYear(Integer year) {
        this.year = year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFloors(Integer floors) {
        this.floors = floors;
    }

    @Override
    public String toString() {
        return "House details: " +
                "year=" + year +
                ", name='" + name + '\'' +
                ", floors=" + floors +
                ", Years since built: " + yearsSince();
    }
    public Integer yearsSince(){
        LocalDate.now().getYear();
        Integer result = LocalDate.now().getYear() - year;
        return result;
    }
}
