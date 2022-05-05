package exercises.technology.main;

import exercises.technology.main.Computer;

public class SmartPhone extends Computer {
    private String serviceProvider;
    private int phoneID = getRandomID();
    public SmartPhone(String name, String operatingSystem, int yearMade, String serviceProviders){
        super(name, operatingSystem, yearMade);
        serviceProviders=serviceProvider;
    }
    public int getPhoneID(){
        return phoneID;
    }
    public String getServiceProvider(){
        return serviceProvider;
    }
    public String phoneCall(){
        return "This " + this.getName() + " was released in " + this.getYearMade();
    }
    @Override
    public  String onSound(){
        return "riiiiiiiiing";
    }
}
