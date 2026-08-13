package Abstraction;

public abstract class Payment {
    // abstract method
    abstract void pay(int amount);

    // concrete method
    public void paymentInfo(String name, String email, String phoneNumber){

        System.out.println("Payment Information:" + "\nName: " + name + "\nEmail: " + email + "\nPhone Number: " + phoneNumber);
    }           

    
}
