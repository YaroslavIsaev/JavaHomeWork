package com.pb.isaiev.hw7;

public class Tshirt extends Clothes implements ManClothes, WomenClothes{

    public Tshirt (Sizes size, String color, int cost) {
            super(size, color, cost);
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


