package ex7_4_6;

public class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    public void fly() {
        System.out.println("Bird is flying");
    }

    @Override
    public void eat() {
        System.out.println("Bird is eating seeds");
    }

    @Override
    public String toString() {
        return "Bird[name=" + getName() + ", age=" + getAge() + "]";
    }
}