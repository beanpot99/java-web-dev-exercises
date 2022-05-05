package exercises.technology.main;

import java.util.Random;

public abstract class AbstractEntity {
    public int getRandomID(){
        Random num = new Random();
        int uniqueId = num.nextInt(10000000);
        return uniqueId;
    }
}
