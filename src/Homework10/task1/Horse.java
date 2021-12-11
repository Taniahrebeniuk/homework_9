package Homework10.task1;

public class Horse extends Animal {
    private double weight;

    public Horse() {
    }

    public Horse(String food, String location) {
        super(food, location);
    }

    public Horse(String food, String location, double weight) {
        this(food, location);
        this.weight = weight;
    }

    @Override
    public void eat() {
        System.out.println("Horse eating");
    }

    @Override
    public String makeNoise() {
        return "Yogogo!";
    }

    @Override
    public String toString() {
        return "Horse{" +
                "food: '" + getFood() + '\'' +
                ", location: '" + getLocation() + '\'' +
                '}';
    }
}

