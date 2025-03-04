import java.util.ArrayList;
import java.util.List;

class Cashier implements Runnable {
    private int id;

    public Cashier(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        while (true) {
            try {
                int time = (int) (Math.random() * 4000) + 1000;
                System.out.printf("Cashier %d is attending a customer...\n", id);
                Thread.sleep(time);
                System.out.printf("Cashier %d finishes the attendant!\n", id);
            } catch (InterruptedException e) {
                System.out.printf("Cashier %d stopped!\n", id);
                break;
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int numCashiers = 3;
        List<Thread> cashiers = new ArrayList<>();

        System.out.println("Supermarket open! starting cashiers...\n");

        for (int i = 1; i <= numCashiers; i++) {
            Thread cashierThread = new Thread(new Cashier(i));
            cashiers.add(cashierThread);
            cashierThread.start();
        }

        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\n Supermarket closing! Finishing cashiers...");

        for (Thread cashier : cashiers) {
            cashier.interrupt();
        }

        System.out.println("Supermarket closed!");
    }
}
