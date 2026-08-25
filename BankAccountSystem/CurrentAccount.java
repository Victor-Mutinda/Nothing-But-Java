package BankAccountSystem ;

public class CurrentAccount extends BankAccount {

    private double overdraftLimit;

    

    public CurrentAccount(int accountNo, String accountName, double accountBalance,double overdraftLimit){
        // Creating a CurrentAccount, You need to have a minimum account Balance of 500 kshs.
        super(accountNo, accountName, accountBalance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override 
    public double withdraw(double withdrawnAmount){
       // overdraftLimit = super.getAccountBalance() * 0.2; // Will get back to calculating overdraft limit later. For now lets initialize the limit through a constructor.
        
        if (withdrawnAmount < super.getAccountBalance()){

            super.withdraw(withdrawnAmount);

        } else if (withdrawnAmount > super.getAccountBalance()) {
            if ((super.getAccountBalance() + overdraftLimit) > withdrawnAmount){
                System.out.println("Your account balance has been depleted. Your Overdraft Limit balance is : "
                 + ((super.getAccountBalance() + overdraftLimit) - withdrawnAmount));
                
                updateAccountBalance((super.getAccountBalance() + overdraftLimit) - withdrawnAmount);
            }
            else{
                System.out.println("Withdrawal Request was unsuccessful.");
            }
            
        }

       return super.getAccountBalance();

    }
    


}