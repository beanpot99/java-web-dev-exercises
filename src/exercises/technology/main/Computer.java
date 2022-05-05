package exercises.technology.main;

import java.util.Date;

public class Computer extends AbstractEntity {
    private String name;
    private String operatingSystem;
    private int yearMade;

    private Boolean isPortable=true;

    public Computer(){

    }
    public Computer(String name, String operatingSystem, int yearMade){
        this.name=name;
        this.operatingSystem=operatingSystem;
        this.yearMade=yearMade;
    }
    public Boolean getPortable() {
        return isPortable;
    }
    public String getName(){
        return name;
    }
    public String getOperatingSystem(){
        return operatingSystem;
    }

    public int getYearMade() {
        return yearMade;
    }
    public String onSound(){
        return "Beeeeeeeeep";

    }
    public int printCompAge(){

        int currentYear = 2022;
        int compAge = currentYear-getYearMade();
        return compAge;
    }
}
