import java.util.Scanner;

class Animal2 {
    protected String name;
    protected int age;

    public void makeSound() {
        System.out.println("I am an animal.");
    }

    public void displayInfo() {
        System.out.print("Name: " + name + ", Age: " + age + " ");
    }
}

class Cat extends Animal2 {
    @Override
    public void makeSound() {
        System.out.println("Meowl");
    }
}

public class Lab5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String name = sc.next();
        int age = sc.nextInt();
        
        Cat cat = new Cat();
        cat.name = name;
        cat.age = age;
        
        cat.displayInfo();
        cat.makeSound();
        
        sc.close();
    }
}
