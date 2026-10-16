class Main {
    int rollNumber;
    String name;
    int subject1, subject2, subject3;

    Main(int rollNumber, String name, int subject1, int subject2, int subject3) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    int calculateTotal() {
        return subject1 + subject2 + subject3;
    }

    double calculatePercentage() {
        return calculateTotal() / 3.0;
    }

    void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Subject 1 Marks: " + subject1);
        System.out.println("Subject 2 Marks: " + subject2);
        System.out.println("Subject 3 Marks: " + subject3);
        System.out.println("Total Marks: " + calculateTotal());
        System.out.printf("Percentage: %.2f%%%n", calculatePercentage());
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        Main s1 = new Main(101, "Aman", 85, 90, 80);
        Main s2 = new Main(102, "Priya", 92, 88, 95);
        Main s3 = new Main(103, "Rahul", 75, 82, 78);

        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }
}

