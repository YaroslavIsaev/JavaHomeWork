package com.pb.isaiev.hw7;

public enum Sizes {
        XXS ("Детский размер",32),
        XS ("Взрослый размер", 34),
        S ("Взрослый размер", 36),
        M ("Взрослый размер", 38),
        L ("Взрослый размер", 40);

        Sizes(String description, int size) {
        this.description = description;
        this.size = size;}

        String description;
        int size;

        public String getDescription () {
            return this.description;
        }

        public int getEuroSize() {
            return this.size;
        }
}