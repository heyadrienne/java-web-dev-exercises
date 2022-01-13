package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student adrienne = new Student();
        adrienne.setName("Adrienne");
        adrienne.setStudentId(6);
        adrienne.setNumberOfCredits(1);
        adrienne.setGpa(4.0);

        Student nick = new Student("Nick", 7, 4,3.0);

        System.out.println("Student name: " + adrienne.getName());
        System.out.println("Student ID: " + adrienne.getStudentId());
        System.out.println("Number of Credits: " + adrienne.getNumberOfCredits());
        System.out.println("Current GPA: " + adrienne.getGpa());

        System.out.println("Student name: " + nick.getName());
        System.out.println("Student ID: " + nick.getStudentId());
        System.out.println("Number of Credits: " + nick.getNumberOfCredits());
        System.out.println("Current GPA: " + nick.getGpa());
    }
}
