package exercises;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {
    public static void findSumEven(ArrayList<Integer> list){
    for(Integer number:list){
        if(number%2==0){
            System.out.println(number);
        }
    }
    }
    public static void fiveLetters(ArrayList<String> list){
        for(String word:list){
            if(word.length()==5){
                System.out.println(word);
            }
        }
    }
    public static void main(String[] args){
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(6);
        intList.add(8);
        intList.add(7);
        intList.add(9);
        intList.add(1);
        intList.add(2);
        findSumEven(intList);
        ArrayList<String> wordList = new ArrayList<>();
        wordList.add("bob");
        wordList.add("house");
        wordList.add("kitty");
        wordList.add("dog");
        wordList.add("turnip");
        wordList.add("launch");
        fiveLetters(wordList);
        String str = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] strArray = str.split(" ");
        ArrayList<String> strList = new ArrayList<String>(Arrays.asList(strArray));
        fiveLetters(strList);
    }
}
