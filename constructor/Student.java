package constructor;

public class Student {
    String name;
    int age;

    Student(){
        name ="Mabel";
        age = 15;
    }

    Student (String name, int age){
        this.name = name;
        this.age = age;
    }
}
