package Abstraction;

public class PayPal extends Payment {

    private String email;

    public PayPal(String email) {
        this.email = email;
    }

    @Override
    void pay(int amount){

        System.out.println("Enter your email " + email + "\n" + amount + " will be deducated from your PayPal account");
       
    }
    
}
