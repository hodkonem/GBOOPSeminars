package ru.geegbrains.lesson1;

public class Chocolate extends Product {
    private double weight; // вес
    private int fat; // Содержание жирности

    public Chocolate(double volume, int fat) {
        this.weight = volume;
        this.fat = fat;
    }

    public double getVolume() {
        return weight;
    }

    public int getFat() {
        return fat;
    }

    public Chocolate(String name, double weight, int fat) {
        super();
        this.weight = weight;
        this.fat = fat;
    }

    public Chocolate(String name, String brand, double price, double weight, int fat) {
        super();
        this.weight = weight;
        this.fat = fat;
    }

    public Chocolate(String name, String brand, double weight, int fat) {
        super();
        this.weight = weight;
        this.fat = fat;
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "weight=" + weight +
                ", fat=" + fat +
                '}';
    }
}