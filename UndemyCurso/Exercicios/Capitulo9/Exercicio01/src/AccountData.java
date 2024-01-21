public class AccountData {
    private static final double tax = 5.00;
    private final int numberAccount;
    public String name;
    private double balance;


    public AccountData(int numberAccount, String name, double initialValue) {
        this.numberAccount = numberAccount;
        this.name = name;
        this.balance = initialValue;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance += balance;

    }

    public void withdraw(double withdraw) {
        balance = balance - withdraw - tax;
    }


    public String toString() {
        return numberAccount
                + ", "
                + "Holder: " + name
                + ", "
                + "Balance: $ "
                + String.format("%.2f", balance);
    }


}
