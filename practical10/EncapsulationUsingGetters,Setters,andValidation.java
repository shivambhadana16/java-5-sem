
class BankAccount {

    private String accountHolder;
    private int accountNumber;
    private double balance;

    BankAccount(String holder, int number, double balance) {
        this.accountHolder = holder;
        this.accountNumber = number;
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
        } else if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful: " + amount);
        }
    }
}

public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount("Rahul", 12345, 5000);

        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: " + account.getBalance());

        System.out.println("----------------------");

        account.deposit(2000);
        account.deposit(-500);

        account.withdraw(1000);
        account.withdraw(0);
        account.withdraw(-200);
        account.withdraw(10000);

        System.out.println("----------------------");
        System.out.println("Updated Balance: " + account.getBalance());
    }
}

