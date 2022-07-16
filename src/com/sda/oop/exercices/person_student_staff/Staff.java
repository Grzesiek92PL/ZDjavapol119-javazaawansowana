package com.sda.oop.exercices.person_student_staff;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Staff staff = (Staff) o;
        return wage == staff.wage && Objects.equals(specialization, staff.specialization) && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), specialization, wage);
    }

    @Override
    public String toString() {
        return "Staff{" +
                "specialization='" + specialization + '\'' +
                ", wage=" + wage +
                "} " + super.toString();
    }
}
