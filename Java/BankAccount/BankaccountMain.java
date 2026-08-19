class BankAccount {
    private String accNo;
    private double bal;

    BankAccount(String accNo, double bal) {
        this.accNo = accNo;
        this.bal = bal;
    }

    double getBal() {
        return bal;
    }

    String getAccNo() {
        return accNo;
    }

    void setBalance(double amount) {
        if (amount >= 0) {
            this.bal = amount;
        }
        System.out.println("After set balance: " + getBal());
    }

    void deposit(double amount) {
        if (amount > 0) {
            this.bal += amount;
        }
        System.out.println("After deposit: " + getBal());
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= this.bal) {
            this.bal -= amount;
        }
        System.out.println("After withdraw: " + getBal());
    }
}

public class BankaccountMain {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount("123456", 0);

        System.out.println("Initial balance: " + ba.getBal());

        ba.setBalance(1000);
        ba.deposit(1000);
        ba.withdraw(1000);
        ba.setBalance(10);

        System.out.println("Final balance: " + ba.getBal());
    }
}