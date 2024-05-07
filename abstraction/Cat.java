package abstraction;

public class Cat extends Animal {
    @Override
    void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    void sound() {
        System.out.println("cat meow");
    }
}
