package com.pb.isaiev.hw7;

public class Tshirt extends Clothes implements ManClothes, WomenClothes{

    public Tshirt (String type, Sizes size, String color, int cost) {
            super(type, size, color, cost);
        }

        @Override
        public void dressMan() {
            System.out.println(this);
        }
    @Override
    public void dressWomen() {
        System.out.println(this);
    }
    }


