class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

class Employee {
    double calculatePay() {
        return 20000;
    }
}

class Manager extends Employee {
    double calculatePay() {
        return 50000;
    }
}

class Developer extends Employee {
    double calculatePay() {
        return 35000;
    }
}

public class Main {
    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println("Addition of two numbers: " + c.add(10, 20));
        System.out.println("Addition of three numbers: " + c.add(10, 20, 30));
        System.out.println("Addition of decimal numbers: " + c.add(10.5, 20.5));

        Employee e;

        e = new Manager();
        System.out.println("Manager Pay: " + e.calculatePay());

        e = new Developer();
        System.out.println("Developer Pay: " + e.calculatePay());
    }
}
