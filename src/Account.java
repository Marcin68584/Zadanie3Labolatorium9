public class Account {
    private String owner;
    private int balance;
    private String accountNumber;

    public Account(String owner, int balance, String accountNumber) {
        this.owner = owner;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void transfer(int amount) throws NotEnoughMoneyException {
        if (amount > balance) {
            throw new NotEnoughMoneyException("Not enough funds in the account.");
        }
        balance -= amount;
        System.out.println("Transfer made: " + amount + " zł.");
    }
}

class NotEnoughMoneyException extends Exception {
    public NotEnoughMoneyException(String message) {
        super(message);
    }
}
