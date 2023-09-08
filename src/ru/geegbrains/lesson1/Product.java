package ru.geegbrains.lesson1;

/**
 * Товар
 */
public class Product {
    protected String name; // Наименование
    protected String brand; // Изготовитель
    protected double price; // Стоимость товара

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 100) {
            throw new RuntimeException("Некорректная цена товара");
        }
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        checkName(name);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        checkBrand(brand);
    }

    public Product() {
        this("Noname");
    }

    public Product(String name) {
        this(name, "Noname");
        this.name = name;
    }


    public Product(String name, String brand, double price) {
        if (price < 100) {
            throw new RuntimeException();
        } else {
            this.price = price;
        }
        checkName(name);
        checkBrand(brand);

        this.price = price;
    }

    private void checkName(String name) {
        if (name == null || name.length() < 3) {
            this.name = "Noname";
        } else {
            this.name = name;
        }
    }

    private void checkBrand(String brand) {
        if (brand == null) {
            this.brand = "Noname";
        } else this.brand = brand;
    }


    public Product(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    public String displayInfo() {
        return String.format("%s - %s - %.2f", name, brand, price);
    }


}
