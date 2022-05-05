package exercises.technology.test;

import exercises.technology.main.Computer;
import exercises.technology.main.Laptop;
import exercises.technology.main.SmartPhone;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class computerTest {
    @Test
    public void inheritsPrintCompAge(){
        Laptop macbook = new Laptop("Macbook", "ElCaptian", 2012, 4.55);
        assertEquals(10, macbook.printCompAge(), 0.001);
    }
    @Test
    public void laptopCastingWorks(){
        Computer surfacePro = new Laptop("Surface pro 3", "Windows", 2015, 2.34);
        assertEquals(7,((Laptop)surfacePro).printCompAge());
    }
    @Test
    public void laptopIsPortable(){
        Laptop macbook2 = new Laptop("Macbook", "ElCaptian", 2012, 4.55);
        assertEquals(true,macbook2.getPortable());
    }
    @Test
    public void inheritSmartPrint() {
        SmartPhone iphone = new SmartPhone("Iphone 10", "Apple", 2018, "Verizon");
        assertEquals(4, iphone.printCompAge(), 0.001);
    }
    @Test
    public void smartPhoneCastWorks(){
        Computer samGalaxy = new SmartPhone("Samsung galaxy", "Android", 2013, "ATT");
        assertEquals(9,samGalaxy.printCompAge(),0.001);
    }
    @Test
    public void smartPhoneIsPortable(){
        SmartPhone iphone = new SmartPhone("Iphone 10", "Apple", 2018, "Verizon");
        assertEquals(true,iphone.getPortable());
    }
}
