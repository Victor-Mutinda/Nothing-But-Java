package BankAccountSystem ;

public class SavingsAccount extends BankAccount {
    private double interestRate = 0.12 ;

    private int withdrawCount = 0; //This is an instance variable. 

    

    public SavingsAccount(int accountNo, String accountName, double accountBalance){
        // Creating a Savings Account, You need to have a minimum account Balance of 1000 kshs.
        super(accountNo, accountName,accountBalance);
    }

    public double interestAccrued(){
        double interest ; // this is a local variable.

        interest = super.getAccountBalance() * interestRate ;

        super.updateAccountBalance(interest+=super.getAccountBalance());

        System.out.println("The interest gained is : " + interest + "\n" +
            " The new Account Balance is : " + super.getAccountBalance());

        return getAccountBalance();

    }

    @Override
    public double withdraw(double withdrawnAmount){
        
        
        if (withdrawCount <= 1){
            super.withdraw(withdrawnAmount);
            withdrawCount++;
        } else{
    
        System.out.println("You can only withdraw twice a month");
        }

        return 0;
    }


}
    

