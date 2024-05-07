package abstraction;

public class Dog extends Animal{
    @Override
    void eat() {
        System.out.println("Dog is eating");
    }
    void sound(){
        System.out.println("Dog barks");
    }
}
