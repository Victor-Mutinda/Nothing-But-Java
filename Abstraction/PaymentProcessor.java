package Abstraction;

public class PaymentProcessor {
    private final Payment paymentMethod;

    public PaymentProcessor(Payment paymentMethod){

        this.paymentMethod = paymentMethod ;

    }

    public void processPayment(int amount){
        paymentMethod.pay(amount);
    }


    

    
}
