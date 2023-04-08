package ex7_4_6;

public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    public void bark() {
        System.out.println("Dog is barking");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating bones");
    }

    @Override
    public String toString() {
        return "Dog[name=" + getName() + ", age=" + getAge() + "]";
    }
}