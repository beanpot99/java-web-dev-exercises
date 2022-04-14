package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {

    public static void main(String[] args){
    HashMap<Integer, String> students= new HashMap<>();
    Scanner input = new Scanner(System.in);
    String newStudent;
    System.out.println("Enter student name: ");
    newStudent = input.nextLine();
    System.out.print("Grade: ");
    Integer newGrade = input.nextInt();
    students.put(newGrade, newStudent);
    for(Map.Entry<Integer, String> student: students.entrySet()){
        System.out.println(student.getKey() + (" ") + student.getValue());
    }
    }
}
