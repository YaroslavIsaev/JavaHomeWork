package com.pb.isaiev.hw7;

public class Pants extends Clothes implements ManClothes, WomenClothes {

    public Pants (String type, Sizes size, String color, int cost) {
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
