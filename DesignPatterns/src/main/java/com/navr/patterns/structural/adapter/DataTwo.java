package com.navr.patterns.structural.adapter;

import java.time.LocalDate;

public class DataTwo {

    private String name; // "firstname lastname"
    private LocalDate birthDate;

    public DataTwo() {
    }

    public DataTwo(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "{ name: "+name+", birthDate: "+birthDate.toString()+" }";
    }
}
