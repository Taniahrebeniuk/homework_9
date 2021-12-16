package Homework10.task1;

public class Dog extends Animal {
    private String name;
    public Dog() {
    }

    public Dog(String food, String location) {
        super(food, location);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Dog eating");
    }

    @Override
    public String makeNoise() {
        return "Woof!";
    }


    @Override
    public String toString() {
        return "Dog{" +
                "food='" + getFood() + '\'' +
                ", location='" + getLocation() + '\'' +
                '}';
    }
}
