package IFMA_2019;

import java.util.HashMap;

public class Main {
    public static class Account {
        public String name;
        public int number;

        public double deposit(double amount) {
            return amount * 2;
        }
    }

    public static void main(String[] args) {

        Account account1 = new Account(); // Create an instance of the inner Account class
        Account account2 = new Account();

        account1.name = "joaoderson";
        account1.number = 234;

        account2.name = "pauliete";
        account2.number = 567;

        double deposit1 = account1.deposit(98); // Store the result of the deposit
        double deposit2 = account2.deposit(108);

        HashMap<String, Account> mapaDeContas = new HashMap<>();

        mapaDeContas.put("diretor", account1);
        mapaDeContas.put("gerente", account2);

        Account director_account = mapaDeContas.get("diretor");

        System.out.println("Deposit for account1: " + deposit1);
        System.out.println("Deposit for account2: " + deposit2);
        System.out.println(director_account.name + " " + director_account.number);
    }
}
