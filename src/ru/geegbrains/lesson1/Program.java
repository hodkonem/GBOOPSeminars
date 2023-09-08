package ru.geegbrains.lesson1;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setName("Product1");
        product1.setBrand("Brand1");
        product1.setPrice(200);

        System.out.println(product1.displayInfo());

        Product product2 = new Product("Product2", "Brand2", 100);
        System.out.println(product1.displayInfo());

        Product bottleOfMilk1 = new BottleOfMilk("Бутылка с молоком", "ООО Молоко", 1.5, 1.5, 350);
        System.out.println(bottleOfMilk1.displayInfo());

        Product bottleOfWater1 = new BottleOfWater("Бутылка с водой", "ООО Источник", 350, 1.5);
        System.out.println(bottleOfWater1.displayInfo());

        Product bottleOfWater2 = new BottleOfWater("Бутылка с водой", "ООО Источник", 150, 1.0);
        System.out.println(bottleOfWater2.displayInfo());

        Product bottleOfWater3 = new BottleOfWater("Бутылка с водой", "ООО Источник", 250, 2.5);
        System.out.println(bottleOfWater3.displayInfo());

        Product chocolate = new Chocolate("Аленка", "Алёнка", 200, 34);

        List<Product> products = new ArrayList<>();
        products.add(bottleOfMilk1);
        products.add(bottleOfWater1);
        products.add(bottleOfWater2);
        products.add(bottleOfWater3);
        products.add(chocolate);

        VendingMashine vendingMashine = new VendingMashine(products);
        BottleOfWater bottleOfWater = (BottleOfWater) vendingMashine.getBottleOfWater("Бутылка с водой", 1.5);
        if (bottleOfWater != null) {
            System.out.println("Вы получили: ");
            System.out.println(bottleOfWater.displayInfo());
        } else {
            System.out.println("Такой бутылки с водой нет в автомате.");
        }

    }
}
