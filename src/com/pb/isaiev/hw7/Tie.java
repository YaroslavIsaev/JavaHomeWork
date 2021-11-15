package com.pb.isaiev.hw7;

public class Tie extends Clothes implements ManClothes {


    public Tie (Sizes size, String color, int cost) {
            super(size, color, cost);
        }

        @Override
        public void dressMan() {
            System.out.println(this);
        }
    }
