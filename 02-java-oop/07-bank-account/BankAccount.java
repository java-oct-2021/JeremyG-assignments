public class BankAccount {

    private double checkingBalance;
    private double savingsBalance;
    public static int numAccounts = 0;
    public static double totalMoney = 0;

    public BankAccount() {
        checkingBalance = 0;
        savingsBalance = 0;
        numAccounts++;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void setBalance(double x, int y) {
        if(y == 0) {
            checkingBalance += x;
            totalMoney += x;
        }
        else {
            savingsBalance += x;
            totalMoney += x;
        }
    }

    public void withdraw(double x, int y) {
        if(y == 0) {
            if(x <= checkingBalance) {
                checkingBalance -= x;
                totalMoney -= x;
            }
            else {
                System.out.println("Insufficient Funds");
            }
        }        
        else {
            if (x <= savingsBalance) {
                savingsBalance -= x;
                totalMoney -= x;
            }
            else {
                System.out.println("Insufficient Funds");
            }
        }
    }
    public void displayBalances() {
        System.out.println("Checking Account Balance is: " + checkingBalance);
        System.out.println("Savings Account Balance is: " + savingsBalance);
        System.out.println("Total Balance is: " + totalMoney);
    }
}
