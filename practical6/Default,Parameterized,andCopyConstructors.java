class Book {
    String title;
    String author;
    double price;

    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0;
    }

    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    Book(Book b) {
        title = b.title;
        author = b.author;
        price = b.price;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {

        Book b1 = new Book();
        Book b2 = new Book("Java Programming", "James", 500);
        Book b3 = new Book(b2);

        System.out.println("Default Constructor:");
        b1.display();

        System.out.println("Parameterized Constructor:");
        b2.display();

        System.out.println("Copy Constructor:");
        b3.display();

        b3.price = 600;

        System.out.println("After Modifying Copied Object:");

        System.out.println("Original Book:");
        b2.display();

        System.out.println("Copied Book:");
        b3.display();
    }
}
