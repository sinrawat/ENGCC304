import java.util.Scanner;

class Animal {
    protected String name;
    protected int age;

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

public class Lab5_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        
        Dog dog = new Dog();
        
        dog.name = name;
        dog.age = age;
        
        dog.makeSound();
        dog.displayInfo();
        
        scanner.close();
    }
}
