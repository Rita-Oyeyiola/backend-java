package polymorphism;

public class Dog extends Animal{
    private String breed;

    public void makeSound(){
        System.out.println("Dog barks");
    }
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
