package inheritance.exercise;

import inheritance.WalkAnimal;

public class Animal {
    public String name;
    public int noOfLegs;

    public Animal(String name, int noOfLegs) {
        this.name = name;
        this.noOfLegs = noOfLegs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", noOfLegs=" + noOfLegs +
                '}';
    }

    public void noise() {
        System.out.println("AAAAAAA");
    }
}
