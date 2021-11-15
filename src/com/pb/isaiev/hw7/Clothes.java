package com.pb.isaiev.hw7;

public abstract class Clothes {
    private Sizes size;
    private String color;
    private int cost;

    public Clothes(Sizes size, String color, int cost) {
        this.size = size;
        this.color = color;
        this.cost = cost;
    }

    @Override
    public String toString() {
    return "[ " + "Размер: " + size + ", Цвет: " + color+ ", Цена: " + cost + " ]";
    }
}






