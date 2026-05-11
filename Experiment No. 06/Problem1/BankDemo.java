public class BankDemo {

    public static void main(String[] args) {

        BankAccount acc = new BankAccount(1000);

        try {
            acc.deposit(500);
            acc.withdraw(200);
            acc.withdraw(2000);
        }

        catch (LowBalanceException e) {
            System.out.println(e.getMessage());
        }

        catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
        }

        acc.balanceEnquiry();
    }
}