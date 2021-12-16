package Homework10.task1;

public class Cycle {
    public static void main(String[] args) {
        Veterinarian veterinarian = new Veterinarian();
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Meat and bones", "Summer cottage");
        animals[1] = new Cat("Milk and fish", "Apartment");
        animals[2] = new Horse("Hay", "Horse farm");

        for (Animal animal : animals) {
            veterinarian.treatAnimal(animal);
        }
    }
}
