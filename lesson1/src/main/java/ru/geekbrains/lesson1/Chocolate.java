package ru.geekbrains.lesson1;

public class Chocolate extends Product {

    private double volume; // Объем

    private int fat; // Содержание жирности
    private double kalorinost; // Калорийность

    public Chocolate(String name, String brand, double price, double volume, int fat, double kalorinost){
        super(name, brand, price);
        this.volume = volume;
        this.fat = fat;
        this.kalorinost = kalorinost;

    }
    public double getVolume() {
        return volume;
    }

    public int getFat() {
        return fat;
    }

    public double getKalorinost() { return kalorinost; }

    @Override
    public String displayInfo() {
        return String.format("[Шоколад] %s - %s - %.2f - v: %.2f f: %d k:%.2f ", name, brand, price, volume, fat, kalorinost);
    }
}
