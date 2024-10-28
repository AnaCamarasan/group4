package inheritance;

public class Cat extends Animal {

    public String breed;
    public boolean isStray;

    public Cat(String name, int noOfLegs, String breed, boolean isStray) {
        super(name, noOfLegs);
        this.breed = breed;
        this.isStray = isStray;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "breed='" + breed + '\'' +
                ", isStray='" + isStray + '\'' +
                "} " + super.toString();
    }

    @Override
    public void noise() {
        System.out.println("meow");
    }
}
