
import java.util.Scanner;
import java.util.InputMismatchException;

class DipositException extends Throwable {
}

class WithdrawMismatchException extends Throwable {
}

class WithdrawException extends Exception {
}

class Account {
    int balance, diposit, withdraw;
    Scanner sc = new Scanner(System.in);

    void toDiposit() throws DipositException {
        System.out.println("Enter a Diposit Ammount : ");
        diposit = sc.nextInt();
        if (diposit <= 0 || diposit >= 100000) {
            throw new DipositException();
        }
        System.out.println(" Diposite Ammount is : " + diposit);
        balance = balance + diposit;
    }

    void toWithdraw() throws WithdrawException, WithdrawMismatchException {
        System.out.println("Enter a Ammount for Withdraw : ");
        withdraw = sc.nextInt();
        if (withdraw <= 500 || withdraw >= 100000) {
            throw new WithdrawException();
        }
        if (withdraw > balance) {
            throw new WithdrawMismatchException();
        }

        System.out.println("Withdrawal Ammount is : " + withdraw);
        balance = balance - withdraw;
    }

    void showBalance() {
        System.out.println("your Account Balance is : " + balance);
        System.out.println("Thank You :) ");
    }

}

public class BankAccount {
    public static void main(String[] args) {
        Account ob = new Account();
        try {
            ob.showBalance();
            ob.toDiposit();
            ob.showBalance();
            ob.toWithdraw();
            ob.showBalance();
        } catch (InputMismatchException ex) {
            System.out.println("Enter a Ammount in Integger Format");
        } catch (DipositException ex) {
            System.out.println("you Diposit only 0 to 100000 RS");
        } catch (WithdrawException ex) {
            System.out.println("You Withdraw money between 500 to 100000");
        } catch (WithdrawMismatchException ex) {
            System.out.println("Withdraw ammount is grater than balance ");
        }
    }

}
