package com.pb.isaiev.hw7;

public class Atelier {
    public static void main(String[] args) {
        Clothes[] clothes = new Clothes[8];
                clothes[0] = new Tshirt("Футболка", Sizes.XS, "Серый", 100);
                clothes[1] = new Tshirt("Футболка", Sizes.L, "Черный", 101);
                clothes[2] = new Pants("Штаны", Sizes.M, "Желтый", 150);
                clothes[3] = new Pants("Штаны", Sizes.XXS, "Синий", 90);
                clothes[4] = new Skirt("Юбка", Sizes.S, "Зеленый", 200);
                clothes[5] = new Skirt("Юбка", Sizes.M, "Красный", 220);
                clothes[6] = new Tie("Галстук", Sizes.L, "Белый", 250);
                clothes[7] = new Tie("Галстук", Sizes.L, "Оранжевый", 250);

        dressMan(clothes);
        dressWomen (clothes);
    }

        public static void dressMan (Clothes [] clothes) {
            System.out.println("Мужская одежда: ");
            for (Clothes c: clothes) {
                if (c instanceof ManClothes) {
                    ((ManClothes) c).dressMan();
                }
            }
    }

    public static void dressWomen (Clothes [] clothes) {
        System.out.println("Женская одежда: ");
        for (Clothes c: clothes) {
            if (c instanceof WomenClothes) {
                ((WomenClothes) c).dressWomen();
            }
        }
    }
}

