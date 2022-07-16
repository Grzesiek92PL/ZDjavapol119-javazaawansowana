package com.sda.oop.exercices.person_student_staff;

import java.util.Objects;

public class Student extends Person {

    private String studiesType;
    private int studiesYear;
    private int studiesPrice;

    public Student(String name, String address, String studiesType, int studiesYear, int studiesPrice) {
        super(name, address);
        this.studiesType = studiesType;
        this.studiesYear = studiesYear;
        this.studiesPrice = studiesPrice;
    }

    public String getStudiesType() {
        return studiesType;
    }

    public void setStudiesType(String studiesType) {
        this.studiesType = studiesType;
    }

    public int getStudiesYear() {
        return studiesYear;
    }

    public void setStudiesYear(int studiesYear) {
        this.studiesYear = studiesYear;
    }

    public int getStudiesPrice() {
        return studiesPrice;
    }

    public void setStudiesPrice(int studiesPrice) {
        this.studiesPrice = studiesPrice;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studiesType='" + studiesType + '\'' +
                ", studiesYear=" + studiesYear +
                ", studiesPrice=" + studiesPrice +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studiesYear == student.studiesYear && studiesPrice == student.studiesPrice && Objects.equals(studiesType, student.studiesType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studiesType, studiesYear, studiesPrice) + super.hashCode();
    }
}
