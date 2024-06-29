public class ATMInterface {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500); // Initial balance is $500
        ATM atm = new ATM(account);
        atm.start();
    }
}
