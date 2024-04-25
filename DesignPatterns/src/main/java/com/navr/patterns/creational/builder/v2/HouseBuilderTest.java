package com.navr.patterns.creational.builder.v2;

public class HouseBuilderTest {
    public static void main(String[] args) {
        House houseLuxury = new HouseBuilder()
                .buildRooms(4)
                .buildWindows(6)
                .buildDoors(7)
                .buildSwimPool()
                .buildGarage()
                .buildGarden()
                .build();
        System.out.printf("houseLuxury=%s%n", houseLuxury);
        House houseSimple = new HouseBuilder()
                .buildRooms(2)
                .buildWindows(2)
                .buildDoors(3)
                .build();
        System.out.printf("houseSimple=%s%n", houseSimple);
    }
}
