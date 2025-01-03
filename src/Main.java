public class Main {
    public static void main(String[] args) {
        Account account = new Account("Jan Kowalski", 500, "123456789");

        try {
            account.transfer(600);
        } catch (NotEnoughMoneyException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Another error occurred: " + e.getMessage());
        } finally {
            System.out.println("Current account balance: " + account.getBalance() + " zł.");
        }
    }
}