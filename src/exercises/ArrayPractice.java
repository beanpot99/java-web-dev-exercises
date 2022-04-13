package exercises;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args){
        int[] myArray = {1,1,2,3,5,8};
        for(int oddInts : myArray){
            if(oddInts%2 !=0){
                System.out.println(oddInts);
            }
        }
        String myString = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] stringArray = myString.split(" ");
        System.out.println(Arrays.toString(stringArray));
        String[] sentanceArray = myString.split("\\.");
        System.out.println(Arrays.toString(sentanceArray));
    }
}
