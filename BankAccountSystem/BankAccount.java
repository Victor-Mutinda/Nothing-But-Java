package BankAccountSystem ;

public class BankAccount {
    
    private int accountNo;
    private String accountName;
    private double accountBalance;

    public BankAccount(int accountNo, String accountName, double accountBalance){
        this.accountNo = accountNo;
        this.accountName = accountName;
        this.accountBalance = accountBalance;
    }


// getter and setter methods to control access of the state of these variables.
    public int getAccountNo(){
        return accountNo;       
    }
    public void setAccountNo(int accountNo){

        if(accountNo <= 0){
            System.out.println("Invalid AccountNumber. Account Number can't be zero or negative. Try Again");
        } else {
            this.accountNo = accountNo;
        }

    }

    public String getAccountName(){
        return accountName;
    }
    public void setAccountName(String accountName){
        this.accountName = accountName ;
    }

    public double getAccountBalance(){
        return accountBalance;
    }
    //public void setAccountBalance(double accountBalance){
     //   this.accountBalance =  accountBalance ;
    //}
    // public setter exposes privaate accountBalance attribute to other external classes.
    //Therefore using a protected method to control access to that private attribute to  the child classs and the classes in the same package
 
    protected void updateAccountBalance(double accountBal){
        this.accountBalance = accountBal;
    }
    public double withdraw(double withdrawnAmount){

        if (accountBalance >= withdrawnAmount) {

            accountBalance -= withdrawnAmount;
            //setAccountBalance(accountBalance);
            updateAccountBalance(accountBalance);
            
            System.out.println("Amount : " + withdrawnAmount + " has been withdrawn." 
            + "\nNew Account balance is : " + getAccountBalance());

        } else {
            System.out.println("Insufficient Funds to complete the withdraw request");
        }

        return accountBalance;

    }

    public double deposit(double depositedAmount){
    
        accountBalance += depositedAmount;

        updateAccountBalance(accountBalance);

        System.out.println("You have deposited : " + depositedAmount + "\nNew Account Balance is : " + getAccountBalance());

        return accountBalance;
    }
    
    public double checkBalance(){
        System.out.println("The Account Balance is : " + getAccountBalance());
        
        return getAccountBalance();
    }

}