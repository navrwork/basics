package com.navr.patterns.creational.factorymethod;



public class FoodFactory {

    public IFood getFoodByShape(String foodShape) {
        if (foodShape == null) {
            return null;
        }

        IFood food = null;
        switch (foodShape) {
            case "round":
                food = new Pizza();
                break;
            case "rectangle":
                food = new Cake();
                break;
            default:
                break;
        }
        return food;
    }

}
