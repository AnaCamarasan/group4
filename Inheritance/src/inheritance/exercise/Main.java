package inheritance.exercise;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Tony", 4, "hot-dog", "small");
        dog1.noise();
        System.out.println(dog1);

        Dog dog2 = new Dog("Lisa", 4, "german sheppard", "big");

        Animal animal1 = new Animal("Jess", 2);

        Animal[] animalList = {dog1, dog2, animal1};

        for (Animal animal : animalList) {
            System.out.println(animal.getName());
            animal.noise();
        }
    }
}
