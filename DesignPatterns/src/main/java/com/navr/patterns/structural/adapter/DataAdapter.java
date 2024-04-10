package com.navr.patterns.structural.adapter;

import java.time.LocalDate;

public class DataAdapter {

    public static DataTwo convert(DataOne dataOne) {
        DataTwo dataTwo = null;
        if (dataOne !=null) {
            dataTwo = new DataTwo();
            dataTwo.setName(dataOne.getFirstName()+" "+dataOne.getLastName());
            if (dataOne.getBirthDate()!=null) {
                String[] dateSplit = dataOne.getBirthDate().split("-");
                dataTwo.setBirthDate(LocalDate.of(Integer.parseInt(dateSplit[0]), Integer.parseInt(dateSplit[1]), Integer.parseInt(dateSplit[2])));
            }
        }
        return dataTwo;
    }
}
