package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Course {
    private ArrayList<Student> students = new ArrayList<>();
    private String name;
    private HashMap<String, Integer> subjectWeights = new HashMap<>();

    // parametrized constructor
    public Course(ArrayList students, String name, HashMap subjectWeights) {
        this.students = students;
        this.name = name;
        this.subjectWeights = subjectWeights;
    }

    // default constructor
    public Course() {

    }

    // alternative parametrized constructor
    public Course(String name) {
        this.name = name;
    }

    // Can use this function to add in studnets later
    public void addStudent(Student student) {
        students.add(student);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getStudents() {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getName() + ", " + students.get(i).getStudentId());
            if (!(i == students.size() - 1)) {
                System.out.println(", ");
            }
        }
    }

    public int getSubjectWeight(String subject) {
        return subjectWeights.get(subject);
    }
    public void setSubjectWeights(String name, int weight){
        subjectWeights.put(name, weight);
    }
    public void printSubjectWeights(){
        for(Map.Entry entry:subjectWeights.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

//Map = single key and value
}
