package com.pluralsight;

public class Program {
    public static void main(String[] args) {
        Person person = new Person();

        person.setName("Craig McKeachie");

        String name = person.getName();
        System.out.println(name);

        Student student = new Student();
        student.setName("Bea");
        student.setStudentID(987);
        String studentName = student.getName();
        int studentID = student.getStudentID();
        System.out.println("ID: " + studentID + " Name: " + studentName);
    }
}
