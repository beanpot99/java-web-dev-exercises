package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class SchoolPractice {
    public static void main(String[] args) {
        Student grace = new Student("Grace Thompson", 241953, 1, 4.0);
        Student grant = new Student("Grant Thompson", 12345, 1, 3.8);


        Course introJava = new Course();
        introJava.addStudent(grant);
        introJava.addStudent(grace);
        introJava.setName("intro to java");
        introJava.setSubjectWeights("Math", 1);

        System.out.println("Welcome to: " + introJava.getName() + ". Our students are: "  );
        introJava.getStudents();
        introJava.printSubjectWeights();

    }
}
