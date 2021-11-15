package com.pb.isaiev.hw7;

public class Skirt extends Clothes implements WomenClothes{

    public Skirt (Sizes size, String color, int cost) {
            super(size, color, cost);
        }

        @Override
        public void dressWomen() {
            System.out.println(this);
        }
    }
