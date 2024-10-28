package inheritance.exercise;

public class Dog extends Animal {
    public String breed;
    public String size;

    public Dog(String name, int noOfLegs, String breed, String size) {
        super(name, noOfLegs);
        this.breed = breed;
        this.size = size;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                "} " + super.toString();
    }

    @Override
    public void noise() {
        System.out.println("woof woof");
    }
}
