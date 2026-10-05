package BankAccountSystem ;
// Inheritance through use of 'extends'
public class SavingsAccount extends BankAccount {
// Global variables - They are declared using static keyword. Eg private static double interestRate
// Attributes of a class. They aren't tied to an object instance/reference.
// They are created & destroyed when the class is loaded & unloaded.


    private double interestRate = 0.12 ;
    private double newBalance;
    private int withdrawCount = 0; //This is an instance variable.

// Instance variable/Fields/Attributes of an object (stored in the Heap) - declared in a class but outside a method, constructor or block. 
// They are created & destroyed when an object is created & destroyed. 
// They are initialized to default values automatically if not explicitly initialized. eg null for objects, 0 for int, false for boolean.

// Local variable (Stored in the Stack) -  declared inside a method, constructor or block and are only accessed within that scope. 
// They are created & destroyed when the scope starts and finishes execution.
// They dont get default values automatically, they need to be initialized before use

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
    

