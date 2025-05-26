public class BankAccount {
    private final String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double initialBalance) {

        this.accountHolder = accountHolder;
        this.balance = initialBalance;

        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be below 0.");
        }
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Deposit amount must be above 0.");
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdraw must be at least 0.01");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Not enough funds.");
        }
        balance -= amount;
    }

    @Override
    public String toString() {
        return "BankAccount{\n" +
                "accountHolder= '" + accountHolder + '\'' +
                ", \nbalance= $" + balance +
                "\n}";
    }
}
