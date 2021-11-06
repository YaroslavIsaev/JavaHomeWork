package com.pb.isaiev.hw6;

public class VetClinic {
    public static void main(String[] args) {
        Veterinarian veterinarian = new Veterinarian();
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Кости", "Двор");
        animals[1] = new Cat("Рыба", "Квартира");
        animals[2] = new Horse("Трава", "Ферма");

        for (Animal animal : animals) {
            veterinarian.treatAnimal(animal);
        }
    }
}
