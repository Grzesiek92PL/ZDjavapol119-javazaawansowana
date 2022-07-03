package com.sda.oop.exercices.person_student_staff;

public class Staff extends Person {

    private String specialization;
    private int wage;

    public Staff(String name, String address, String specialization, int wage) {
        super(name, address);
        this.specialization = specialization;
        this.wage = wage;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "specialization='" + specialization + '\'' +
                ", wage=" + wage +
                "} " + super.toString();
    }
}
