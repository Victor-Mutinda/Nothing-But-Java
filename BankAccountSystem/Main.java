package BankAccountSystem ;

public class Main{
    public static void main(String[] args){

        CurrentAccount victorCurrent = new CurrentAccount(1, "Victor Mutinda",500,100);
        victorCurrent.deposit(500);
        victorCurrent.withdraw(1050);
        victorCurrent.checkBalance();        
        

        SavingsAccount familySaving = new SavingsAccount(2, "Beautiful People", 1000);
        familySaving.deposit(200);
        familySaving.interestAccrued();
        familySaving.checkBalance();
        familySaving.withdraw(200);
        familySaving.withdraw(2000);
        familySaving.withdraw(300);
        familySaving.withdraw(300);
        

    }
}