package Homework10.task1;

public class Cat extends Animal {
    private String color;

    public Cat() {
    }

    public Cat(String food, String location) {
        super(food, location);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void eat() {
        System.out.println("Cat eating");
    }

    @Override
    public String makeNoise() {
        return "Meow!";
    }


    @Override
    public String toString() {
        return "Cat{" +
                "food='" + getFood() + '\'' +
                ", location='" + getLocation() + '\'' +
                '}';
    }
}