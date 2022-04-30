package org.launchcode.java.demos.lsn6inheritance.Main;

public class Main {
    public static void main(String[] args){
        HouseCat olive = new HouseCat("Olive", 12);
        olive.eat();
        System.out.println(olive.isTired());
    }
}
