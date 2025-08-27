import java.util.Scanner;

class Bank_Account {
    static Scanner sc = new Scanner(System.in);
    float amount;

    // Constructor - asks total amount only once
    Bank_Account() {
        System.out.print("Enter starting balance: ");
        amount = sc.nextFloat();
    }

    void deposit() {
        System.out.print("Enter deposit amount: ");
        float deposit_amt = sc.nextFloat();
        amount += deposit_amt;
        System.out.println("Amount deposited successfully!");
    }

    void withdraw() {
        System.out.print("Enter withdraw amount: ");
        float withdraw_amt = sc.nextFloat();

        if (withdraw_amt > amount) {
            System.out.println("Insufficient balance!");
        } else {
            amount -= withdraw_amt;
            System.out.println("Amount withdrawn successfully!");
        }
    }

    void display_balance() {
        System.out.println("Current Balance: " + amount);
    }
}

public class Bank {
    public static void main(String[] args) {
        Bank_Account account = new Bank_Account(); // only one account

        account.deposit();       // first deposit
        account.withdraw();      // then withdraw
        account.display_balance(); // show balance

        Bank_Account.sc.close();
    }
}
