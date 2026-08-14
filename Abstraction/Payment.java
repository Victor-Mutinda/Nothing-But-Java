package Abstraction;

public abstract class Payment {
    // abstract method
    abstract void pay(int amount);

    // concrete method but its not logical here. This is method doesn't involve payments. Should be redone.
    public void paymentInfo(String name, String email, String phoneNumber){

        System.out.println("Payment Information:" + "\nName: " + name + "\nEmail: " + email + "\nPhone Number: " + phoneNumber);
    }           

    
}
