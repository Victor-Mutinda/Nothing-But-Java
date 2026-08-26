package BankAccountSystem ;
// Inheritance through use of 'extends'
public class CurrentAccount extends BankAccount {

    private double overdraftLimit;


    public CurrentAccount(int accountNo, String accountName, double accountBalance,double overdraftLimit){
        // Creating a CurrentAccount, You need to have a minimum account Balance of 500 kshs.
        // Constructor chaining - reusing intiliazation logic and reduce code duplication. Inheriting the parent Constructor attributes using super.
        super(accountNo, accountName, accountBalance);  
        this.overdraftLimit = overdraftLimit;
    }

// Method overriding. The withdraw method gets to have another different behaviour from the original behaviour in the parent class.
    @Override 
    public double withdraw(double withdrawnAmount){
       // overdraftLimit = super.getAccountBalance() * 0.2; // Will get back to calculating overdraft limit later. For now lets initialize the limit through a constructor.
        
        if (withdrawnAmount <= super.getAccountBalance()){

            super.withdraw(withdrawnAmount);

        } else if (withdrawnAmount > super.getAccountBalance()) {
            if ((super.getAccountBalance() + overdraftLimit) > withdrawnAmount){
                System.out.println("Your account balance has been depleted. Your Account is overdrawn by : "
                 + (withdrawnAmount - (super.getAccountBalance() + overdraftLimit)));
                
                updateAccountBalance(withdrawnAmount - (super.getAccountBalance() + overdraftLimit));
            }
            else{
                System.out.println("Withdrawal Request was unsuccessful.");
            }
            
        }

       return super.getAccountBalance();

    }
    


}