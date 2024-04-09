package com.navr.patterns.creational.abstractfactory;

public class FurnitureFactoryTest {

    public static void main(String[] args) {
        FurnitureFactoryTest factoryTest = new FurnitureFactoryTest();
        FurnitureFactory modernFactory = factoryTest.getFurnitureFactory("Modern");
        FurnitureFactory victorianFactory = factoryTest.getFurnitureFactory("Victorian");
        System.out.printf("modernFactory: %s%n", modernFactory.printInfo());
        System.out.printf("victorianFactory: %s%n", victorianFactory.printInfo());
    }

    public FurnitureFactory getFurnitureFactory(String type) {
        FurnitureFactory furnitureFactory = null;
        switch(type) {
            case "Modern":
                furnitureFactory = new ModernFactory();
                break;
            case "Victorian":
                furnitureFactory = new VictorianFactory();
                break;
            default:
                break;
        }

        return furnitureFactory;
    }

}
