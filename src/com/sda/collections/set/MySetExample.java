package com.sda.collections.set;

import com.sda.oop.exercices.person_student_staff.Staff;
import com.sda.oop.exercices.person_student_staff.Student;

import java.util.HashSet;
import java.util.Set;

public class MySetExample {

    public static void main(String[] args) {

        Set<String> mySet = new HashSet<>();
        System.out.println(mySet.add("John"));
        System.out.println(mySet.add("Neeki"));
        mySet.add("Packia");
        System.out.println(mySet.add("John"));

        if (mySet.contains("John")) {
            System.out.println("Element istnieje");
        }

        for (String name : mySet) {
            System.out.println(name);
        }

        Student student = new Student("Piotr", "Warszawa", "Mechatronika", 2015, 0);

        System.out.println("HASH CODE EXAMPLE!");
        System.out.println(student.hashCode());

        student.setStudiesPrice(999999);
        System.out.println(student.hashCode());

        student.setName("Nowe imie");
        System.out.println(student.hashCode());

        Set<Staff> staffSet = new HashSet<>();

        Staff staff1 = new Staff("name", "address", "spec", 5);
        Staff staff2 = new Staff("name", "address", "spec", 10);

        System.out.println("NO HashCode & Equals implementation example");
        System.out.println(staff1.equals(staff2));
        System.out.println(staff1.hashCode());
        System.out.println(staff2.hashCode());

        System.out.println(staffSet.add(staff1));
        System.out.println(staffSet.add(staff2));

        System.out.println("Test ,modyfikacji");
        staff2.setWage(5);
        System.out.println(staffSet.size());
        for (Staff staff : staffSet) {
            System.out.println(staff.toString());
        }

        System.out.println("Poza pętlą");
        System.out.println(staff1.toString());
        System.out.println(staff2.toString());

        Set<Staff> newSet = new HashSet<>(staffSet);
        System.out.println(newSet.size());



    }


}
