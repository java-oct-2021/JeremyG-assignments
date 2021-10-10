public class BankAccountsTest {
    
    public static void main(String[] args) {
        
        BankAccount account = new BankAccount();

        //x = amount of money
        //y=0 is checking / y=1 is savings (or any other number besides 0)
        account.setBalance(500.99,0);
        account.setBalance(1200.32,1);
        
        account.displayBalances();

        account.withdraw(300.00,0);
        account.withdraw(600.00,1);

        account.displayBalances();
    }
}
