package com.pb.isaiev.hw6;

public class Dog extends Animal {
    private String name;

    public Dog() {
    }

    public Dog(String food, String location) {
        super(food, location);
        setName("Альма");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Собака ест.");
    }

    @Override
    public String makeNoise() {
        return "Гав!";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog)) return false;
        if (!super.equals(o)) return false;

        Dog dog = (Dog) o;

        return name != null ? name.equals(dog.name) : dog.name == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Собака [" +
                " " +
                "Еда: '" + getFood() + '\'' +
                ", Локация: '" + getLocation() + '\'' + ", Кличка: '" + getName() + '\''+
                " ]";
    }
}
