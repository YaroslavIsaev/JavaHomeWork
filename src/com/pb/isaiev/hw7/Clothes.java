package com.pb.isaiev.hw7;

public abstract class Clothes {
    private String type;
    private Sizes size;
    private String color;
    private int cost;

    public Clothes(String type, Sizes size, String color, int cost) {
        this.type = type;
        this.size = size;
        this.color = color;
        this.cost = cost;
    }

    @Override
    public String toString() {
    return type + " [ " + "Размер: " + size + ", Цвет: " + color+ ", Цена: " + cost + " ]";
    }
}






