
class MyClass {

    MyClass() {
        System.out.println("Object is created");
    }

    void display() {
        System.out.println("Object is being used");
    }
}

public class Main {
    public static void main(String[] args) {

        MyClass obj = new MyClass();

        obj.display();

        obj = null;
        System.out.println("Object reference removed");

        System.out.println("Garbage collection requested");
        System.gc();

        System.out.println("Program execution completed");
    }
}

