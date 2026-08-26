package BankAccountSystem ;
// Inheritance through use of 'extends'
public class SavingsAccount extends BankAccount {
    private double interestRate = 0.12 ;
    private double newBalance;
    private int withdrawCount = 0; //This is an instance variable. 

    

    public SavingsAccount(int accountNo, String accountName, double accountBalance){
        // Creating a Savings Account, You need to have a minimum account Balance of 1000 kshs.
        super(accountNo, accountName,accountBalance); // Constructor chaining - reusing intiliazation logic and reduce code duplication. Inheriting the parent Constructor attributes using super.
    }

    public double interestAccrued(){
        double interest ; // this is a local variable.

        interest = super.getAccountBalance() * interestRate ;
        newBalance = super.getAccountBalance() + interest ;

        super.updateAccountBalance(newBalance);

        System.out.println("The interest gained is : " + interest + "\n" +
            " The new Account Balance is : " + super.getAccountBalance());

        return getAccountBalance();

    }

    @Override
    public double withdraw(double withdrawnAmount){
        if (withdrawnAmount <= super.getAccountBalance()){
        
        
            if (withdrawCount <= 1){
                super.withdraw(withdrawnAmount);             
                withdrawCount++;
            } else{
        
            System.out.println("You can only withdraw twice a month");
            }
        } else {
            System.out.println("Your withdrawal Request failed. You dont have sufficient funds.");

        }

        return super.getAccountBalance();
        
    


}
}
    

