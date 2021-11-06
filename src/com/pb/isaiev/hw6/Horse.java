package com.pb.isaiev.hw6;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Horse extends Animal {
    private double weight;

    public Horse() {
    }

    public Horse(String food, String location) {
        super(food, location);
        setName("Флэш");
    }

    public Horse(String food, String location, double weight) {
        this(food, location);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void eat() {
        System.out.println("Лошадь ест.");
    }

    @Override
    public String makeNoise() {
        return "Иго-го!";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Horse)) return false;
        if (!super.equals(o)) return false;

        Horse horse = (Horse) o;

        return Double.compare(horse.weight, weight) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Конь [" +
                " " +
                "Еда: '" + getFood() + '\'' +
                ", Локация: '" + getLocation() + '\'' + ", Кличка: '" + getName() + '\''+
                " ]";
    }

    private void writeObject(ObjectOutputStream os) {
        try {
            os.defaultWriteObject();
            os.writeObject(getFood());
            os.writeObject(getLocation());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void readObject(ObjectInputStream is) {
        try {
            is.defaultReadObject();
            this.setFood((String) is.readObject());
            this.setLocation((String) is.readObject());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
