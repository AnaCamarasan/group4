import inheritance.Animal;
import inheritance.Cat;
import inheritance.Dog;

public class Main {

    public static void main(String[] args) {

        Dog animal1 = new Dog("Tony", 4, "hot-dog", "small");
        Cat animal2 = new Cat("Maddy", 3, "Tabby", false);

        Animal[] animalList = {animal1, animal2};

        for (Animal animal : animalList){
            animal.noise();
        }

        animal1.goOnAWalk();

    }
}