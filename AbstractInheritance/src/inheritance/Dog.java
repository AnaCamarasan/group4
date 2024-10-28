package inheritance;

public class Dog extends Animal implements WalkAnimal {
    public String breed;
    public String size;

    public Dog(String name, int noOfLegs, String breed, String size) {
        super(name, noOfLegs);
        this.breed = breed;
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

    @Override
    public void goOnAWalk() {
        System.out.println("We go on a walk!");
    }
}
