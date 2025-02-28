class BankAccount {
    private double money;

    public BankAccount(double money) {
        if (money < 0) {
            System.out.println("Initial balance cannot be negative.");
            this.money = 0;
        } else {
            this.money = money;
        }
    }

    public boolean withdraw(double amount) {
        if (amount < 0) {
            System.out.println("Cannot withdraw a negative amount.");
            return false;
        }
        if (amount > money) {
            System.out.println("You don't have enough money to withdraw.");
            return false;
        }
        money -= amount;
        System.out.printf("Current money: %.2f%n", money);
        return true;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Cannot deposit a negative amount.");
            return;
        }
        money += amount;
        System.out.printf("Current money: %.2f%n", money);
    }

    public void transfer(double amount, BankAccount to) {
        if (this.withdraw(amount)) {
            to.deposit(amount);
        }
    }

    public double getBalance() {
        return money;
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount inter = new BankAccount(1000);
        BankAccount nubank = new BankAccount(1000);

        System.out.println("Inter transfers to nubank");
        inter.transfer(300, nubank);
        System.out.println("Nubank transfers to inter");
        nubank.transfer(300, inter);
        System.out.println("Inter deposits 300");
        inter.deposit(300);
        System.out.println("Nubank deposits 500");
        nubank.deposit(500);
        System.out.println("Inter withdraws 200");
        inter.withdraw(200);
        System.out.println("Nubank withdraws 500");
        nubank.withdraw(500);
    }
}
