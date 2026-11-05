class Vehicle {
    String brand = "Toyota";

    void start() {
        System.out.println("Vehicle is starting.");
    }
}

class Car extends Vehicle {
    String model = "Innova";

    void displayCar() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}

class Person {
    String name = "Rahul";

    void displayPerson() {
        System.out.println("Name: " + name);
    }
}

class Employee extends Person {
    int employeeId = 101;

    void displayEmployee() {
        System.out.println("Employee ID: " + employeeId);
    }
}

class Manager extends Employee {
    String department = "IT";

    void displayManager() {
        System.out.println("Department: " + department);
    }
}

class Shape {
    void display() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    double radius = 5;

    void area() {
        System.out.println("Area of Circle: " +
                (3.14 * radius * radius));
    }
}

class Rectangle extends Shape {
    int length = 10;
    int width = 4;

    void area() {
        System.out.println("Area of Rectangle: " +
                (length * width));
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("1. Single Inheritance");
        Car c = new Car();
        c.start();
        c.displayCar();

        System.out.println("\n2. Multilevel Inheritance");
        Manager m = new Manager();
        m.displayPerson();
        m.displayEmployee();
        m.displayManager();

        System.out.println("\n3. Hierarchical Inheritance");
        Circle cir = new Circle();
        cir.display();
        cir.area();

        Rectangle rect = new Rectangle();
        rect.display();
        rect.area();
    }
}
