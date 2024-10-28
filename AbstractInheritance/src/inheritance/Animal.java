package inheritance;

public abstract class Animal {

    public String name;
    public int noOfLegs;

    public Animal(String name, int noOfLegs) {
        this.name = name;
        this.noOfLegs = noOfLegs;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", noOfLegs=" + noOfLegs +
                '}';
    }

    public abstract void noise();

}
