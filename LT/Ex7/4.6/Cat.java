package ex7_4_6;

public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    public void meow() {
        System.out.println("Cat is meowing");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating fish");
    }

    @Override
    public String toString() {
        return "Cat[name=" + getName() + ", age=" + getAge() + "]";
    }
}