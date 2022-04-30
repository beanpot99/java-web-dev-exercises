package org.launchcode.java.demos.lsn6inheritance.test;

import org.junit.Test;
import org.launchcode.java.demos.lsn6inheritance.Main.HouseCat;

import static org.junit.Assert.assertEquals;

public class catTest {
    @Test
    public void inheritsSuperInFirstConstructor(){
        HouseCat olive = new HouseCat("Olive", 12);
        assertEquals(12, olive.getWeight(), 0.001);
    }
}
