package com.navr.patterns.structural.adapter;

public class DataOne {

    private String firstName;
    private String lastName;
    private String birthDate; // "YYYY-MM-DD" format

    public DataOne() {
    }

    public DataOne(String firstName, String lastName, String birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "{ firstName: " + firstName + ", lastName: " + lastName + ", birthDate: " + birthDate + " }";
    }
}
