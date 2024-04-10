package com.navr.patterns.structural.adapter;

public class DataAdapterTest {

    public static void main(String[] args) {
        DataOne dataOne = generateDataOne();
        DataTwo dataTwo = DataAdapter.convert(dataOne);
        System.out.printf("dataOne=%s%n", dataOne.toString());
        System.out.printf("dataTwo=%s%n", dataTwo.toString());
    }

    private static DataOne generateDataOne() {
        DataOne dataOne = new DataOne();
        dataOne.setFirstName("Mukesh");
        dataOne.setLastName("Ambani");
        dataOne.setBirthDate("1960-01-01");
        return dataOne;
    }
}
