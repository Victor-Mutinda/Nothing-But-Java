package Abstraction;

public class BankCard extends Payment {

    private String cardNumber;

    public BankCard(String cardNumber) {

        this.cardNumber = cardNumber;

    }

    @Override
    void pay(int amount){
        System.out.println("Enter your card details " + cardNumber + "\n" + amount + " will be deducted from your account via bank card");
    }

    
}
