package com.pb.isaiev.hw7;

public class Skirt extends Clothes implements WomenClothes{

    public Skirt (String type, Sizes size, String color, int cost) {
            super(type, size, color, cost);
        }

        @Override
        public void dressWomen() {
            System.out.println(this);
        }
    }
