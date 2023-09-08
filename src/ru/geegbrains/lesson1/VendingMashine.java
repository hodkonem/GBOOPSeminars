package ru.geegbrains.lesson1;

import java.util.List;

public class VendingMashine {
    private List<Product> products;

    public VendingMashine(List<Product> products) {
        this.products = products;
    }

    public Product getBottleOfWater(String name, double volume){
        for (Product product : products) {
            if (product instanceof  BottleOfWater) {
                BottleOfWater bottleOfWater = (BottleOfWater) product;
                if (bottleOfWater.getName().equals(name) && bottleOfWater.getVolume() == volume) {
                    return bottleOfWater;
                }
            }
        }
        return null;
    }

}
