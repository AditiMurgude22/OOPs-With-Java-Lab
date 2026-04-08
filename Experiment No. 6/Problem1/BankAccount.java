public class BankAccount {

    double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void balanceEnquiry() {
        System.out.println("Current Balance: " + balance);
    }

    public void deposit(double amount) throws NegativeNumberException {
        if (amount < 0) {
            throw new NegativeNumberException("Cannot deposit negative amount");
        }
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount)
            throws LowBalanceException, NegativeNumberException {

        if (amount < 0) {
            throw new NegativeNumberException("Cannot withdraw negative amount");
        }

        if (amount > balance) {
            throw new LowBalanceException("Insufficient Balance");
        }

        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }
}