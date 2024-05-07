package polymorphism;

public class Animal {
    private String name;

    public void makeSound(){
        System.out.println("Animal makes a sound");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
