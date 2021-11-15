package com.pb.isaiev.hw7;

public class Tie extends Clothes implements ManClothes {


    public Tie (String type, Sizes size, String color, int cost) {
        super(type, size, color, cost);
        }

        @Override
        public void dressMan() {
            System.out.println(this);
        }
    }
