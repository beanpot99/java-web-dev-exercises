package exercises.technology.main;

import exercises.technology.main.Computer;

public class Laptop extends Computer {
    private double thickness;
    private int laptopID = getRandomID();
    public Laptop(String name, String operatingSystem, int yearMade, double thick){
        super(name, operatingSystem, yearMade);
        thick = thickness;
    }
    public double getThickness(){
        return thickness;
    }
    public int getLaptopID(){
        return laptopID;
    }
    public String advertisement(){
        return "Wow! This " + this.getName() + " is only " + this.getThickness() + "mm thick!!";
    }
    @Override
    public String onSound(){
        return "diiiiiiing";
    }

}
